package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weappApi.weappApiStrings.linear
  - typingsJapgolly.weappApi.weappApiStrings.ease
  - typingsJapgolly.weappApi.weappApiStrings.`ease-in`
  - typingsJapgolly.weappApi.weappApiStrings.`ease-in-out`
  - typingsJapgolly.weappApi.weappApiStrings.`ease-out`
  - typingsJapgolly.weappApi.weappApiStrings.`step-start`
  - typingsJapgolly.weappApi.weappApiStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typingsJapgolly.weappApi.weappApiStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typingsJapgolly.weappApi.weappApiStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typingsJapgolly.weappApi.weappApiStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typingsJapgolly.weappApi.weappApiStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typingsJapgolly.weappApi.weappApiStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typingsJapgolly.weappApi.weappApiStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typingsJapgolly.weappApi.weappApiStrings.`step-start` = this.cast("step-start")
}

