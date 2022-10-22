package typingsJapgolly.googlePicker.google.picker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Picker extends StObject {
  
  def dispose(): Unit
  
  def isVisible(): Boolean
  
  def setCallback(method: js.Function1[/* result */ ResponseObject, Unit]): Picker
  
  def setRelayUrl(url: String): Picker
  
  def setVisible(visible: Boolean): Picker
}
object Picker {
  
  inline def apply(
    dispose: Callback,
    isVisible: CallbackTo[Boolean],
    setCallback: js.Function1[/* result */ ResponseObject, Unit] => Picker,
    setRelayUrl: String => Picker,
    setVisible: Boolean => Picker
  ): Picker = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, isVisible = isVisible.toJsFn, setCallback = js.Any.fromFunction1(setCallback), setRelayUrl = js.Any.fromFunction1(setRelayUrl), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[Picker]
  }
  
  extension [Self <: Picker](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setSetCallback(value: js.Function1[/* result */ ResponseObject, Unit] => Picker): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
    
    inline def setSetRelayUrl(value: String => Picker): Self = StObject.set(x, "setRelayUrl", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Picker): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
