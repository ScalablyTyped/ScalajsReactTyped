package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceHolder extends StObject {
  
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): Unit
  
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): Unit
  
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): Unit
  
  def on(event: String, fn: js.Function1[/* e */ Any, Any]): Unit
  
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): Unit
  
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): Unit
  
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): Unit
  
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): Unit
}
object PlaceHolder {
  
  inline def apply(
    cancel: Callback,
    detach: Callback,
    hideOtherMarkers: Callback,
    on: (String, js.Function1[/* e */ Any, Any]) => Callback,
    onCursorChange: Callback,
    onUpdate: Callback,
    setup: Callback,
    showOtherMarkers: Callback
  ): PlaceHolder = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, detach = detach.toJsFn, hideOtherMarkers = hideOtherMarkers.toJsFn, on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (on(t0, t1)).runNow()), onCursorChange = onCursorChange.toJsFn, onUpdate = onUpdate.toJsFn, setup = setup.toJsFn, showOtherMarkers = showOtherMarkers.toJsFn)
    __obj.asInstanceOf[PlaceHolder]
  }
  
  extension [Self <: PlaceHolder](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setHideOtherMarkers(value: Callback): Self = StObject.set(x, "hideOtherMarkers", value.toJsFn)
    
    inline def setOn(value: (String, js.Function1[/* e */ Any, Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setOnCursorChange(value: Callback): Self = StObject.set(x, "onCursorChange", value.toJsFn)
    
    inline def setOnUpdate(value: Callback): Self = StObject.set(x, "onUpdate", value.toJsFn)
    
    inline def setSetup(value: Callback): Self = StObject.set(x, "setup", value.toJsFn)
    
    inline def setShowOtherMarkers(value: Callback): Self = StObject.set(x, "showOtherMarkers", value.toJsFn)
  }
}
