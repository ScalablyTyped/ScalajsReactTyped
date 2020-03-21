package typingsJapgolly.webPush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webPush.webPushStrings.aesgcm
  - typingsJapgolly.webPush.webPushStrings.aes128gcm
*/
trait ContentEncoding extends js.Object

object ContentEncoding {
  @scala.inline
  def aes128gcm: typingsJapgolly.webPush.webPushStrings.aes128gcm = this.cast("aes128gcm")
  @scala.inline
  def aesgcm: typingsJapgolly.webPush.webPushStrings.aesgcm = this.cast("aesgcm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

