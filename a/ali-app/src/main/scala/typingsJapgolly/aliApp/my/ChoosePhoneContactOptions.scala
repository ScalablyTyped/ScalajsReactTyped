package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppInts.`10`
import typingsJapgolly.aliApp.aliAppInts.`11`
import typingsJapgolly.aliApp.anon.Mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 联系人 https://docs.alipay.com/mini/api/ui-contact
trait ChoosePhoneContactOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 10    没有权限
    * 11    用户取消操作(或设备未授权使用通讯录)
    */
  @JSName("fail")
  var fail_ChoosePhoneContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  
  @JSName("success")
  def success_MChoosePhoneContactOptions(result: Mobile): Unit
}
object ChoosePhoneContactOptions {
  
  inline def apply(success: Mobile => Callback): ChoosePhoneContactOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Mobile) => success(t0).runNow()))
    __obj.asInstanceOf[ChoosePhoneContactOptions]
  }
  
  extension [Self <: ChoosePhoneContactOptions](x: Self) {
    
    inline def setFail(value: /* error */ `10` | `11` => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* error */ `10` | `11`) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: Mobile => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Mobile) => value(t0).runNow()))
  }
}
