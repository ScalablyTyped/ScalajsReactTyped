package typingsJapgolly.stompit.clientMod

import typingsJapgolly.stompit.incomingFrameStreamMod.IncomingFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends IncomingFrame {
  def ack(): Unit = js.native
  def nack(): Unit = js.native
}

