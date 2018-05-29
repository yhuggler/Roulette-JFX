/*  
 *  © Copyright yannickhuggler.com
 *
 *  [Project Title]     Roulette
 *  [Description]       The king of all casino-games implemented in JavaFX.
 *  [Authors]           Yannick Huggler
 *  [Version]           Version 1.0      
 */

package ch.bbbaden.casino.model;

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
