package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.BankAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseInvoiceTitleOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_ChooseInvoiceTitleOptions: js.UndefOr[js.Function1[/* res */ BankAccount, Unit]] = js.undefined
}
object ChooseInvoiceTitleOptions {
  
  inline def apply(): ChooseInvoiceTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseInvoiceTitleOptions]
  }
  
  extension [Self <: ChooseInvoiceTitleOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ BankAccount => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ BankAccount) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
