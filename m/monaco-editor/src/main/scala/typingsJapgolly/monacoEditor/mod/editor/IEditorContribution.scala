package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorContribution extends StObject {
  
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit
  
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ Any, Unit]] = js.undefined
  
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[Any]] = js.undefined
}
object IEditorContribution {
  
  inline def apply(dispose: Callback): IEditorContribution = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[IEditorContribution]
  }
  
  extension [Self <: IEditorContribution](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setRestoreViewState(value: /* state */ Any => Callback): Self = StObject.set(x, "restoreViewState", js.Any.fromFunction1((t0: /* state */ Any) => value(t0).runNow()))
    
    inline def setRestoreViewStateUndefined: Self = StObject.set(x, "restoreViewState", js.undefined)
    
    inline def setSaveViewState(value: CallbackTo[Any]): Self = StObject.set(x, "saveViewState", value.toJsFn)
    
    inline def setSaveViewStateUndefined: Self = StObject.set(x, "saveViewState", js.undefined)
  }
}
