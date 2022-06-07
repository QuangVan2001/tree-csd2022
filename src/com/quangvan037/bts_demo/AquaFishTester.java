/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangvan037.bts_demo;

import java.io.FileNotFoundException;

/**
 *
 * @author QUANG VAN
 */
public class AquaFishTester {

    public static void main(String[] args) throws FileNotFoundException {
        String BF_fname = "BFT.txt";
        String NLR_fname = "NLR.txt";
        String LNR_fname = "LRN.txt";
        String RNL_fname = "RNL.txt";
        BST_Fish_Tree fTree = new BST_Fish_Tree();
        fTree.add_recur("32","11","57","06", "18", "40","80","02","16","22","35","50","70","90");
        fTree.add("01","05","15","17","34","37","45","85","03");
        System.out.println("Bread First traversal: ");
        fTree.BF_Traverse();
        System.out.println("NLR_traversal: ");
        fTree.NLR();
        System.out.println("LNR_traversal: ");
        fTree.LNR();
        System.out.println("RNL_traversal: ");
        fTree.RNL();
        System.out.println("Traverse the tree to files:");
        fTree.BF_Traverse_F(BF_fname);
        fTree.NLR_F(NLR_fname);
        fTree.LNR_F(LNR_fname);
         fTree.RNL_F(RNL_fname);
         System.out.println("Done.");
    }
}
