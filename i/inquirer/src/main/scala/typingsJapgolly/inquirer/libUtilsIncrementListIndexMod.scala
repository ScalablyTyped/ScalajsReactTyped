package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.libObjectsChoicesMod.default
import typingsJapgolly.inquirer.mod.Answers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsIncrementListIndexMod {
  
  @JSImport("inquirer/lib/utils/incrementListIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Find the index of the next answer to be selected.
    *
    * @param current
    * Index of the answer currently selected.
    * @param dir
    * Whether to go up or down in the answers list.
    * @param opt
    * The option used for the question initialization.
    * @return
    * The index of the next answer to be selected.
    */
  inline def default(current: Double, dir: Direction, opt: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(current.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inquirer.inquirerStrings.up
    - typingsJapgolly.inquirer.inquirerStrings.down
  */
  trait Direction extends StObject
  object Direction {
    
    inline def down: typingsJapgolly.inquirer.inquirerStrings.down = "down".asInstanceOf[typingsJapgolly.inquirer.inquirerStrings.down]
    
    inline def up: typingsJapgolly.inquirer.inquirerStrings.up = "up".asInstanceOf[typingsJapgolly.inquirer.inquirerStrings.up]
  }
  
  trait Options extends StObject {
    
    var choices: default[Answers]
    
    var loop: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(choices: default[Answers]): Options = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChoices(value: default[Answers]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    }
  }
}
