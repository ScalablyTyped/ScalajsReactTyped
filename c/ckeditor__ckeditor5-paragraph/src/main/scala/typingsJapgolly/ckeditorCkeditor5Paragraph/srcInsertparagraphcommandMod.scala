package typingsJapgolly.ckeditorCkeditor5Paragraph

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditorCkeditor5Paragraph.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInsertparagraphcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph/src/insertparagraphcommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with InsertParagraphCommand {
    
    /**
      * Executes the command.
      */
    /* CompleteClass */
    override def execute(options: Position): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait InsertParagraphCommand extends StObject {
    
    /**
      * Executes the command.
      */
    def execute(options: Position): Unit
  }
  object InsertParagraphCommand {
    
    inline def apply(execute: Position => Callback): InsertParagraphCommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1((t0: Position) => execute(t0).runNow()))
      __obj.asInstanceOf[InsertParagraphCommand]
    }
    
    extension [Self <: InsertParagraphCommand](x: Self) {
      
      inline def setExecute(value: Position => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
    }
  }
}
