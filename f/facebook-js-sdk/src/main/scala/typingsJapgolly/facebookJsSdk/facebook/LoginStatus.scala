package typingsJapgolly.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authorization_expired
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.connected
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.not_authorized
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.unknown
*/
trait LoginStatus extends js.Object

object LoginStatus {
  @scala.inline
  def authorization_expired: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authorization_expired = this.cast("authorization_expired")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.connected = this.cast("connected")
  @scala.inline
  def not_authorized: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.not_authorized = this.cast("not_authorized")
  @scala.inline
  def unknown: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.unknown = this.cast("unknown")
}

