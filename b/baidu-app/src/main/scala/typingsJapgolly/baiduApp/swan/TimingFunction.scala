package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baiduApp.baiduAppStrings.linear
  - typingsJapgolly.baiduApp.baiduAppStrings.ease
  - typingsJapgolly.baiduApp.baiduAppStrings.`ease-in`
  - typingsJapgolly.baiduApp.baiduAppStrings.`ease-in-out`
  - typingsJapgolly.baiduApp.baiduAppStrings.`ease-out`
  - typingsJapgolly.baiduApp.baiduAppStrings.`step-start`
  - typingsJapgolly.baiduApp.baiduAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typingsJapgolly.baiduApp.baiduAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typingsJapgolly.baiduApp.baiduAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typingsJapgolly.baiduApp.baiduAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typingsJapgolly.baiduApp.baiduAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typingsJapgolly.baiduApp.baiduAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typingsJapgolly.baiduApp.baiduAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typingsJapgolly.baiduApp.baiduAppStrings.`step-start` = this.cast("step-start")
}

