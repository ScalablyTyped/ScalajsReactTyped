package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.SupportMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSupportSoterAuthenticationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_CheckIsSupportSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ SupportMode, Unit]] = js.undefined
}
object CheckIsSupportSoterAuthenticationOptions {
  
  inline def apply(): CheckIsSupportSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationOptions]
  }
  
  extension [Self <: CheckIsSupportSoterAuthenticationOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ SupportMode => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ SupportMode) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
