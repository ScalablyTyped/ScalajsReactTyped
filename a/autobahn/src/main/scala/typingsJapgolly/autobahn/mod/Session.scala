package typingsJapgolly.autobahn.mod

import typingsJapgolly.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Session")
@js.native
class Session protected () extends js.Object {
  def this(transport: ITransport, defer: DeferFactory, challenge: OnChallengeHandler) = this()
  var caller_disclose_me: Boolean = js.native
  var features: js.Any = js.native
  var id: Double = js.native
  var isOpen: Boolean = js.native
  var publisher_disclose_me: Boolean = js.native
  var realm: String = js.native
  var registrations: js.Array[IRegistration] = js.native
  var subscriptions: js.Array[js.Array[ISubscription]] = js.native
  def call[TResult](procedure: String): Promise_[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any): Promise_[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any, kwargs: js.Any): Promise_[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any, kwargs: js.Any, options: ICallOptions): Promise_[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_]): Promise_[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_], kwargs: js.Any): Promise_[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_], kwargs: js.Any, options: ICallOptions): Promise_[TResult] = js.native
  def join(realm: String, authmethods: js.Array[String], authid: String): Unit = js.native
  def leave(reason: String, message: String): Unit = js.native
  def onjoin(roleFeatures: js.Any): Unit = js.native
  def onleave(reason: String, details: js.Any): Unit = js.native
  def prefix(prefix: String, uri: String): Unit = js.native
  def publish(topic: String): Promise_[IPublication] = js.native
  def publish(topic: String, args: js.Array[_]): Promise_[IPublication] = js.native
  def publish(topic: String, args: js.Array[_], kwargs: js.Any): Promise_[IPublication] = js.native
  def publish(topic: String, args: js.Array[_], kwargs: js.Any, options: IPublishOptions): Promise_[IPublication] = js.native
  def register(procedure: String, endpoint: RegisterEndpoint): Promise_[IRegistration] = js.native
  def register(procedure: String, endpoint: RegisterEndpoint, options: IRegisterOptions): Promise_[IRegistration] = js.native
  def resolve(curie: String): String = js.native
  def subscribe(topic: String, handler: SubscribeHandler): Promise_[ISubscription] = js.native
  def subscribe(topic: String, handler: SubscribeHandler, options: ISubscribeOptions): Promise_[ISubscription] = js.native
  def unregister(registration: IRegistration): Promise_[_] = js.native
  def unsubscribe(subscription: ISubscription): Promise_[_] = js.native
}

