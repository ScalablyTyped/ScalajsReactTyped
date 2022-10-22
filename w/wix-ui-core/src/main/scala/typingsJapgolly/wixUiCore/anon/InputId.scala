package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSignatureInputContextMod.SignaturePadApiContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputId extends StObject {
  
  var inputId: Any
  
  var padApi: Any
  
  def setInputId(inputId: String): Unit
  
  def setSignaturePadContext(padApi: SignaturePadApiContext): Unit
  
  def setSignatureTitleId(titleId: String): Unit
  
  var titleId: Any
}
object InputId {
  
  inline def apply(
    inputId: Any,
    padApi: Any,
    setInputId: String => Callback,
    setSignaturePadContext: SignaturePadApiContext => Callback,
    setSignatureTitleId: String => Callback,
    titleId: Any
  ): InputId = {
    val __obj = js.Dynamic.literal(inputId = inputId.asInstanceOf[js.Any], padApi = padApi.asInstanceOf[js.Any], setInputId = js.Any.fromFunction1((t0: String) => setInputId(t0).runNow()), setSignaturePadContext = js.Any.fromFunction1((t0: SignaturePadApiContext) => setSignaturePadContext(t0).runNow()), setSignatureTitleId = js.Any.fromFunction1((t0: String) => setSignatureTitleId(t0).runNow()), titleId = titleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputId]
  }
  
  extension [Self <: InputId](x: Self) {
    
    inline def setInputId(value: Any): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setPadApi(value: Any): Self = StObject.set(x, "padApi", value.asInstanceOf[js.Any])
    
    inline def setSetInputId(value: String => Callback): Self = StObject.set(x, "setInputId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetSignaturePadContext(value: SignaturePadApiContext => Callback): Self = StObject.set(x, "setSignaturePadContext", js.Any.fromFunction1((t0: SignaturePadApiContext) => value(t0).runNow()))
    
    inline def setSetSignatureTitleId(value: String => Callback): Self = StObject.set(x, "setSignatureTitleId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTitleId(value: Any): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
  }
}
