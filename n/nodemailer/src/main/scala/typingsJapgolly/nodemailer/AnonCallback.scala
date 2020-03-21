package typingsJapgolly.nodemailer

import typingsJapgolly.nodemailer.mailerMod.^
import typingsJapgolly.nodemailer.sesTransportMod.SentMessageInfo
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  var mail: ^ = js.native
  def callback(err: Null, info: SentMessageInfo): Unit = js.native
  def callback(err: Error, info: SentMessageInfo): Unit = js.native
}

