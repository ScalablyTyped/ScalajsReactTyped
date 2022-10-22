package typingsJapgolly.braintree.mod

import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionGateway extends StObject {
  
  def cancel(subscriptionId: String): js.Promise[Unit] = js.native
  
  def create(request: SubscriptionCreateRequest): js.Promise[ValidatedResponse[Subscription]] = js.native
  
  def find(subscriptionId: String): js.Promise[Subscription] = js.native
  
  def retryCharge(subscriptionId: String): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: String, amount: String): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: String, amount: String, submitForSettlement: Boolean): js.Promise[ValidatedResponse[Subscription]] = js.native
  def retryCharge(subscriptionId: String, amount: Unit, submitForSettlement: Boolean): js.Promise[ValidatedResponse[Subscription]] = js.native
  
  def search(searchFn: Any): Readable = js.native
  
  def update(subscriptionId: String, updates: SubscriptionUpdateRequest): js.Promise[ValidatedResponse[Subscription]] = js.native
}
