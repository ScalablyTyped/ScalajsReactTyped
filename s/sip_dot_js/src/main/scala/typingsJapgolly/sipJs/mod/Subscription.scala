package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.libSubscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Subscription")
@js.native
class Subscription protected ()
  extends typingsJapgolly.sipJs.libSubscriptionMod.Subscription {
  /**
    * Constructor.
    * @param ua User agent.
    * @param target Subscription target.
    * @param event Subscription event.
    * @param options Options bucket.
    */
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: String, event: String) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: typingsJapgolly.sipJs.coreMod.URI, event: String) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: String, event: String, options: SubscriptionOptions) = this()
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    target: typingsJapgolly.sipJs.coreMod.URI,
    event: String,
    options: SubscriptionOptions
  ) = this()
}

