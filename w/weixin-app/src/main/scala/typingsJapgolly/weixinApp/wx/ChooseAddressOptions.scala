package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.CityName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 开放接口-----收货地址
trait ChooseAddressOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_ChooseAddressOptions: js.UndefOr[js.Function1[/* res */ CityName, Unit]] = js.undefined
}
object ChooseAddressOptions {
  
  inline def apply(): ChooseAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseAddressOptions]
  }
  
  extension [Self <: ChooseAddressOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ CityName => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ CityName) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
