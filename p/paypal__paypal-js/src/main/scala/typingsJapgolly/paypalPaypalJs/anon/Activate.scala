package typingsJapgolly.paypalPaypalJs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paypalPaypalJs.typesApisSubscriptionsSubscriptionsMod.SubscriptionDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activate extends StObject {
  
  def activate(): js.Promise[Unit]
  
  def get(): js.Promise[SubscriptionDetail]
}
object Activate {
  
  inline def apply(activate: CallbackTo[js.Promise[Unit]], get: CallbackTo[js.Promise[SubscriptionDetail]]): Activate = {
    val __obj = js.Dynamic.literal(activate = activate.toJsFn, get = get.toJsFn)
    __obj.asInstanceOf[Activate]
  }
  
  extension [Self <: Activate](x: Self) {
    
    inline def setActivate(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "activate", value.toJsFn)
    
    inline def setGet(value: CallbackTo[js.Promise[SubscriptionDetail]]): Self = StObject.set(x, "get", value.toJsFn)
  }
}
