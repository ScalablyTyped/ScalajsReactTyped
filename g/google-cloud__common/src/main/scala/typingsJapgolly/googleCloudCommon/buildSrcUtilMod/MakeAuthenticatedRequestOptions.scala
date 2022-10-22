package typingsJapgolly.googleCloudCommon.buildSrcUtilMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeAuthenticatedRequestOptions extends StObject {
  
  def onAuthenticated(): Unit
  def onAuthenticated(err: js.Error): Unit
  def onAuthenticated(err: js.Error, reqOpts: DecorateRequestOptions): Unit
  def onAuthenticated(err: Null, reqOpts: DecorateRequestOptions): Unit
  @JSName("onAuthenticated")
  var onAuthenticated_Original: OnAuthenticatedCallback
}
object MakeAuthenticatedRequestOptions {
  
  inline def apply(
    onAuthenticated: (/* err */ js.Error | Null, /* reqOpts */ js.UndefOr[DecorateRequestOptions]) => Callback
  ): MakeAuthenticatedRequestOptions = {
    val __obj = js.Dynamic.literal(onAuthenticated = js.Any.fromFunction2((t0: /* err */ js.Error | Null, t1: /* reqOpts */ js.UndefOr[DecorateRequestOptions]) => (onAuthenticated(t0, t1)).runNow()))
    __obj.asInstanceOf[MakeAuthenticatedRequestOptions]
  }
  
  extension [Self <: MakeAuthenticatedRequestOptions](x: Self) {
    
    inline def setOnAuthenticated(value: (/* err */ js.Error | Null, /* reqOpts */ js.UndefOr[DecorateRequestOptions]) => Callback): Self = StObject.set(x, "onAuthenticated", js.Any.fromFunction2((t0: /* err */ js.Error | Null, t1: /* reqOpts */ js.UndefOr[DecorateRequestOptions]) => (value(t0, t1)).runNow()))
  }
}
