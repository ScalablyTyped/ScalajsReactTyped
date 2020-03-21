package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.fingerPrint
  - typingsJapgolly.weixinApp.weixinAppStrings.facial
  - typingsJapgolly.weixinApp.weixinAppStrings.speech
*/
trait AuthModes extends js.Object

object AuthModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facial: typingsJapgolly.weixinApp.weixinAppStrings.facial = this.cast("facial")
  @scala.inline
  def fingerPrint: typingsJapgolly.weixinApp.weixinAppStrings.fingerPrint = this.cast("fingerPrint")
  @scala.inline
  def speech: typingsJapgolly.weixinApp.weixinAppStrings.speech = this.cast("speech")
}

