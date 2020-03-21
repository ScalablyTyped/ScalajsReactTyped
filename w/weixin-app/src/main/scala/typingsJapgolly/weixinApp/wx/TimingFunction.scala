package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.linear
  - typingsJapgolly.weixinApp.weixinAppStrings.ease
  - typingsJapgolly.weixinApp.weixinAppStrings.`ease-in`
  - typingsJapgolly.weixinApp.weixinAppStrings.`ease-in-out`
  - typingsJapgolly.weixinApp.weixinAppStrings.`ease-out`
  - typingsJapgolly.weixinApp.weixinAppStrings.`step-start`
  - typingsJapgolly.weixinApp.weixinAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typingsJapgolly.weixinApp.weixinAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typingsJapgolly.weixinApp.weixinAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typingsJapgolly.weixinApp.weixinAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typingsJapgolly.weixinApp.weixinAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typingsJapgolly.weixinApp.weixinAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typingsJapgolly.weixinApp.weixinAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typingsJapgolly.weixinApp.weixinAppStrings.`step-start` = this.cast("step-start")
}

