package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class GetInfo {
    // построчное считывание файла
    public static void main(String[] args) {
        String data = "Это тестовая строка для записи в файл";

        // пишем в файл с помощью FileWriter
        writeUsingFileWriter(data);

        try {
            File file = new File("C:\\Users\\domashkevichao\\Desktop\\Сотрудники\\Домашкевич\\Личное\\JAVA\\Test.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        // пишем в файл с помощью FileWriter
        private static void writeUsingFileWriter(String data) {
            File file = new File("C:\\Users\\domashkevichao\\Desktop\\Сотрудники\\Домашкевич\\Личное\\JAVA\\Test.txt");
            FileWriter fr = null;
            try {
                fr = new FileWriter(file, true);
                fr.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


