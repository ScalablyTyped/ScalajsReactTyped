package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.bevel
  - typingsJapgolly.weixinApp.weixinAppStrings.round
  - typingsJapgolly.weixinApp.weixinAppStrings.miter
*/
trait LineJoinType extends js.Object

object LineJoinType {
  @scala.inline
  def bevel: typingsJapgolly.weixinApp.weixinAppStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typingsJapgolly.weixinApp.weixinAppStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsJapgolly.weixinApp.weixinAppStrings.round = this.cast("round")
}

