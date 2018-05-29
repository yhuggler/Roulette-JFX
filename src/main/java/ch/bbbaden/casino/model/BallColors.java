/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.casino.model;

/**
 *
 * @author yannick_huggler
 */
public enum BallColors {
    BLACK {
        public String toString() {
            return "black";
        }
    },
    RED {
        public String toString() {
            return "red";
        }
    },
    GREEN {
        public String toString() {
            return "green";
        }
    }
}
