package typingsJapgolly.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wegameApi.wegameApiStrings.auto
  - typingsJapgolly.wegameApi.wegameApiStrings.buildInMic
  - typingsJapgolly.wegameApi.wegameApiStrings.headsetMic
  - typingsJapgolly.wegameApi.wegameApiStrings.mic
  - typingsJapgolly.wegameApi.wegameApiStrings.camcorder
*/
trait AudioSourceType extends js.Object

object AudioSourceType {
  @scala.inline
  def auto: typingsJapgolly.wegameApi.wegameApiStrings.auto = this.cast("auto")
  @scala.inline
  def buildInMic: typingsJapgolly.wegameApi.wegameApiStrings.buildInMic = this.cast("buildInMic")
  @scala.inline
  def camcorder: typingsJapgolly.wegameApi.wegameApiStrings.camcorder = this.cast("camcorder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def headsetMic: typingsJapgolly.wegameApi.wegameApiStrings.headsetMic = this.cast("headsetMic")
  @scala.inline
  def mic: typingsJapgolly.wegameApi.wegameApiStrings.mic = this.cast("mic")
}

