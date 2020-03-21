package typingsJapgolly.stripe.mod.customers

import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.resources.CustomerSubscriptions
import typingsJapgolly.stripe.mod.subscriptions.ISubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerSubscriptions
  extends CustomerSubscriptions
     with IList[ISubscription]

