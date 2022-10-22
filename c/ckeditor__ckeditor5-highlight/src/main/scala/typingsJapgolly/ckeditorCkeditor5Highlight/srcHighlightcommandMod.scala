package typingsJapgolly.ckeditorCkeditor5Highlight

import typingsJapgolly.ckeditorCkeditor5Highlight.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlightcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightcommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HighlightCommand
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ @js.native
  trait HighlightCommand extends StObject {
    
    def execute(): Unit = js.native
    def execute(options: Value): Unit = js.native
    
    def refresh(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var HighlightCommand: typingsJapgolly.ckeditorCkeditor5Highlight.srcHighlightcommandMod.HighlightCommand
    }
    object Commands {
      
      inline def apply(HighlightCommand: HighlightCommand): Commands = {
        val __obj = js.Dynamic.literal(HighlightCommand = HighlightCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setHighlightCommand(value: HighlightCommand): Self = StObject.set(x, "HighlightCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
