package typingsJapgolly.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 动画 https://docs.alipay.com/mini/api/ui-animation
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliApp.aliAppStrings.linear
  - typingsJapgolly.aliApp.aliAppStrings.ease
  - typingsJapgolly.aliApp.aliAppStrings.`ease-in`
  - typingsJapgolly.aliApp.aliAppStrings.`ease-in-out`
  - typingsJapgolly.aliApp.aliAppStrings.`ease-out`
  - typingsJapgolly.aliApp.aliAppStrings.`step-start`
  - typingsJapgolly.aliApp.aliAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typingsJapgolly.aliApp.aliAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typingsJapgolly.aliApp.aliAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typingsJapgolly.aliApp.aliAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typingsJapgolly.aliApp.aliAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typingsJapgolly.aliApp.aliAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typingsJapgolly.aliApp.aliAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typingsJapgolly.aliApp.aliAppStrings.`step-start` = this.cast("step-start")
}

