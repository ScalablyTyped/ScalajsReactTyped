package typingsJapgolly.ckeditorCkeditor5Enter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEntercommandMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/entercommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EnterCommand {
    
    /* CompleteClass */
    override def execute(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait EnterCommand extends StObject {
    
    def execute(): Unit
  }
  object EnterCommand {
    
    inline def apply(execute: Callback): EnterCommand = {
      val __obj = js.Dynamic.literal(execute = execute.toJsFn)
      __obj.asInstanceOf[EnterCommand]
    }
    
    extension [Self <: EnterCommand](x: Self) {
      
      inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var EnterCommand: typingsJapgolly.ckeditorCkeditor5Enter.srcEntercommandMod.EnterCommand
    }
    object Commands {
      
      inline def apply(EnterCommand: EnterCommand): Commands = {
        val __obj = js.Dynamic.literal(EnterCommand = EnterCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setEnterCommand(value: EnterCommand): Self = StObject.set(x, "EnterCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
