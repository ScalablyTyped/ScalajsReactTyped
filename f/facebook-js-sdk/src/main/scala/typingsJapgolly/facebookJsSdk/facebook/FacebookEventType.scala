package typingsJapgolly.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotauthResponseChange
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotlogout
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotlogin
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotstatusChange
  - typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.xfbmlDotrender
*/
trait FacebookEventType extends js.Object

object FacebookEventType {
  @scala.inline
  def authDotauthResponseChange: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotauthResponseChange = this.cast("auth.authResponseChange")
  @scala.inline
  def authDotlogin: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotlogin = this.cast("auth.login")
  @scala.inline
  def authDotlogout: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotlogout = this.cast("auth.logout")
  @scala.inline
  def authDotstatusChange: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.authDotstatusChange = this.cast("auth.statusChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xfbmlDotrender: typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.xfbmlDotrender = this.cast("xfbml.render")
}

