package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.EncryptedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeRunDataOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_WeRunDataOptions: js.UndefOr[js.Function1[/* res */ EncryptedData, Unit]] = js.undefined
}
object WeRunDataOptions {
  
  inline def apply(): WeRunDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeRunDataOptions]
  }
  
  extension [Self <: WeRunDataOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ EncryptedData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ EncryptedData) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
