package com.lius.MemoryProcess;

import org.junit.Test;

public class MemoryProcessTest {

    @Test
    public void MemoryProcessTest() {
        // ��ȡ����
        MemoryProcess counterStrikeProcess = new MemoryProcess("Counter-Strike");
        // ��ȡ����id
        System.out.printf("��ȡ����id:%d\r\n", counterStrikeProcess.getProcessId());
        // �򿪽���
        if(counterStrikeProcess.openProcess()){
            System.out.println("�򿪽��̳ɹ�");
            // ��ȡ�ڴ�
            float bloodValue = counterStrikeProcess.readFloat(0x25069bc, 0x7c, 0x4, 0x160);
            System.out.println("Ѫ����" + bloodValue);
            // д���ڴ�
            counterStrikeProcess.writeFloat(100, 0x25069bc, 0x7c, 0x4, 0x160);
            // �رս���
            counterStrikeProcess.closeProcess();
            System.out.println("�رս��̾������");
        };
    }
}
