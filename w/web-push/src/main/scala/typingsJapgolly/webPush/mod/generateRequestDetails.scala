package typingsJapgolly.webPush.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.webPush.RequestDetailsbodyBuffer
import typingsJapgolly.webPush.RequestDetailsbodynull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "generateRequestDetails")
@js.native
object generateRequestDetails extends js.Object {
  def apply(subscription: PushSubscription): RequestDetailsbodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: String): RequestDetailsbodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetailsbodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetailsbodynull = js.native
  def apply(subscription: PushSubscription, payload: Buffer): RequestDetailsbodyBuffer = js.native
  def apply(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetailsbodyBuffer = js.native
}

