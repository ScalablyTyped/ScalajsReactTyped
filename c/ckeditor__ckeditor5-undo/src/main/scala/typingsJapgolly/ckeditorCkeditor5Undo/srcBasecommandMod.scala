package typingsJapgolly.ckeditorCkeditor5Undo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBasecommandMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-undo/src/basecommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BaseCommand {
    
    /* CompleteClass */
    override def addBatch(batch: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default): Unit = js.native
    
    /* CompleteClass */
    override def clearStack(): Unit = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait BaseCommand extends StObject {
    
    def addBatch(batch: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default): Unit
    
    def clearStack(): Unit
    
    def refresh(): Unit
  }
  object BaseCommand {
    
    inline def apply(
      addBatch: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default => Callback,
      clearStack: Callback,
      refresh: Callback
    ): BaseCommand = {
      val __obj = js.Dynamic.literal(addBatch = js.Any.fromFunction1((t0: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default) => addBatch(t0).runNow()), clearStack = clearStack.toJsFn, refresh = refresh.toJsFn)
      __obj.asInstanceOf[BaseCommand]
    }
    
    extension [Self <: BaseCommand](x: Self) {
      
      inline def setAddBatch(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default => Callback): Self = StObject.set(x, "addBatch", js.Any.fromFunction1((t0: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default) => value(t0).runNow()))
      
      inline def setClearStack(value: Callback): Self = StObject.set(x, "clearStack", value.toJsFn)
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    }
  }
}
