package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def activate(data: SubscriptionActivateRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def cancel(data: SubscriptionCancelRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def fetch(data: SubscriptionFetchRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def list(data: SubscriptionListRequest): js.Promise[AxiosResponse[Any, Any]]
}
object Subscription {
  
  inline def apply(
    activate: SubscriptionActivateRequest => js.Promise[AxiosResponse[Any, Any]],
    cancel: SubscriptionCancelRequest => js.Promise[AxiosResponse[Any, Any]],
    fetch: SubscriptionFetchRequest => js.Promise[AxiosResponse[Any, Any]],
    list: SubscriptionListRequest => js.Promise[AxiosResponse[Any, Any]]
  ): Subscription = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), cancel = js.Any.fromFunction1(cancel), fetch = js.Any.fromFunction1(fetch), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setActivate(value: SubscriptionActivateRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setCancel(value: SubscriptionCancelRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setFetch(value: SubscriptionFetchRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setList(value: SubscriptionListRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
  }
}
