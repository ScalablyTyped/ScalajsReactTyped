package typingsJapgolly.ckeditorCkeditor5Undo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRedocommandMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/redocommand", JSImport.Default)
  @js.native
  open class default () extends RedoCommand
  
  @js.native
  trait RedoCommand
    extends typingsJapgolly.ckeditorCkeditor5Undo.srcBasecommandMod.default {
    
    def execute(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var RedoCommand: typingsJapgolly.ckeditorCkeditor5Undo.srcRedocommandMod.RedoCommand
    }
    object Commands {
      
      inline def apply(RedoCommand: RedoCommand): Commands = {
        val __obj = js.Dynamic.literal(RedoCommand = RedoCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setRedoCommand(value: RedoCommand): Self = StObject.set(x, "RedoCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
