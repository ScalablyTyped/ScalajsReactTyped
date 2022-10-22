package typingsJapgolly.ckeditorCkeditor5Indent

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentblockcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentblockcommand", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentBlockCommand {
    def this(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any,
      indentBehavior: IndentBehavior
    ) = this()
    
    /* CompleteClass */
    override def execute(): Unit = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  trait IndentBehavior extends StObject {
    
    def checkEnabled(indentAttributeValue: String): Boolean
    
    def getNextIndent(indentAttributeValue: String): js.UndefOr[String]
  }
  object IndentBehavior {
    
    inline def apply(checkEnabled: String => Boolean, getNextIndent: String => js.UndefOr[String]): IndentBehavior = {
      val __obj = js.Dynamic.literal(checkEnabled = js.Any.fromFunction1(checkEnabled), getNextIndent = js.Any.fromFunction1(getNextIndent))
      __obj.asInstanceOf[IndentBehavior]
    }
    
    extension [Self <: IndentBehavior](x: Self) {
      
      inline def setCheckEnabled(value: String => Boolean): Self = StObject.set(x, "checkEnabled", js.Any.fromFunction1(value))
      
      inline def setGetNextIndent(value: String => js.UndefOr[String]): Self = StObject.set(x, "getNextIndent", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait IndentBlockCommand extends StObject {
    
    def execute(): Unit
    
    def refresh(): Unit
  }
  object IndentBlockCommand {
    
    inline def apply(execute: Callback, refresh: Callback): IndentBlockCommand = {
      val __obj = js.Dynamic.literal(execute = execute.toJsFn, refresh = refresh.toJsFn)
      __obj.asInstanceOf[IndentBlockCommand]
    }
    
    extension [Self <: IndentBlockCommand](x: Self) {
      
      inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var IndentBlockCommand: typingsJapgolly.ckeditorCkeditor5Indent.srcIndentblockcommandMod.IndentBlockCommand
    }
    object Commands {
      
      inline def apply(IndentBlockCommand: IndentBlockCommand): Commands = {
        val __obj = js.Dynamic.literal(IndentBlockCommand = IndentBlockCommand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setIndentBlockCommand(value: IndentBlockCommand): Self = StObject.set(x, "IndentBlockCommand", value.asInstanceOf[js.Any])
      }
    }
  }
}
