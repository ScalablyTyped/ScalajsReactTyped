package typingsJapgolly.ckeditorCkeditor5Heading

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditorCkeditor5Heading.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHeadingcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/headingcommand", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HeadingCommand {
    def this(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any,
      modelElements: js.Array[String]
    ) = this()
    
    /* CompleteClass */
    override def execute(options: Value): Unit = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait HeadingCommand extends StObject {
    
    def execute(options: Value): Unit
    
    def refresh(): Unit
  }
  object HeadingCommand {
    
    inline def apply(execute: Value => Callback, refresh: Callback): HeadingCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1((t0: Value) => execute(t0).runNow()), refresh = refresh.toJsFn)
      __obj.asInstanceOf[HeadingCommand]
    }
    
    extension [Self <: HeadingCommand](x: Self) {
      
      inline def setExecute(value: Value => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction1((t0: Value) => value(t0).runNow()))
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var HeadingCommand: typingsJapgolly.ckeditorCkeditor5Heading.srcHeadingcommandMod.HeadingCommand
    }
    object Commands {
      
      inline def apply(HeadingCommand: HeadingCommand): Commands = {
        val __obj = js.Dynamic.literal(HeadingCommand = HeadingCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setHeadingCommand(value: HeadingCommand): Self = StObject.set(x, "HeadingCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
