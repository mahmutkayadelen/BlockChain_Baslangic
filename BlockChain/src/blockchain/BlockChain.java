/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class BlockChain {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
                String[] genesisTransactions = {"Mahmut güvene 10 btc yolladı","sinan yusufa 10 bitcoin yolladı"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"ahmet güvene 3 bitcoin yolladı", "güven migrosa 3 bitcoin yolladı"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Ali  ayşeye iki bitcoin yolladı"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println(": başlangıçtaki bloklar"); 
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

        
    }
    
    
}
