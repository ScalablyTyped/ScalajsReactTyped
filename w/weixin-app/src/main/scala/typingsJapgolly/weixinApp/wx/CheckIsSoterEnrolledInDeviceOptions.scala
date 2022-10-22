package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.IsEnrolled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSoterEnrolledInDeviceOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var checkAuthMode: AuthModes
  
  // 认证方式
  @JSName("success")
  var success_CheckIsSoterEnrolledInDeviceOptions: js.UndefOr[js.Function1[/* res */ IsEnrolled, Unit]] = js.undefined
}
object CheckIsSoterEnrolledInDeviceOptions {
  
  inline def apply(checkAuthMode: AuthModes): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
  
  extension [Self <: CheckIsSoterEnrolledInDeviceOptions](x: Self) {
    
    inline def setCheckAuthMode(value: AuthModes): Self = StObject.set(x, "checkAuthMode", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ IsEnrolled => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ IsEnrolled) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
