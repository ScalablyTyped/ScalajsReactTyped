package typingsJapgolly.onfidoSdkUi.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkHandle extends StObject {
  
  var containerId: js.UndefOr[String] = js.undefined
  
  var options: NormalisedSdkOptions
  
  def setOptions(options: SdkOptions): Unit
  
  def tearDown(): Unit
}
object SdkHandle {
  
  inline def apply(options: NormalisedSdkOptions, setOptions: SdkOptions => Callback, tearDown: Callback): SdkHandle = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], setOptions = js.Any.fromFunction1((t0: SdkOptions) => setOptions(t0).runNow()), tearDown = tearDown.toJsFn)
    __obj.asInstanceOf[SdkHandle]
  }
  
  extension [Self <: SdkHandle](x: Self) {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setOptions(value: NormalisedSdkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetOptions(value: SdkOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: SdkOptions) => value(t0).runNow()))
    
    inline def setTearDown(value: Callback): Self = StObject.set(x, "tearDown", value.toJsFn)
  }
}
