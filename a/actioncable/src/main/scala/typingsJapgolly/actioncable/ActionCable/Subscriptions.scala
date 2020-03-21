package typingsJapgolly.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriptions extends js.Object {
  def create(channel: String): Channel = js.native
  def create(channel: String, obj: CreateMixin): Channel = js.native
  def create(channel: ChannelNameWithParams): Channel = js.native
  def create(channel: ChannelNameWithParams, obj: CreateMixin): Channel = js.native
}

