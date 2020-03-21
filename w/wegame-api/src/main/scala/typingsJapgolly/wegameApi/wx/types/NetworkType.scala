package typingsJapgolly.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wegameApi.wegameApiStrings.wifi
  - typingsJapgolly.wegameApi.wegameApiStrings.`2g`
  - typingsJapgolly.wegameApi.wegameApiStrings.`3g`
  - typingsJapgolly.wegameApi.wegameApiStrings.`4g`
  - typingsJapgolly.wegameApi.wegameApiStrings.unknown
  - typingsJapgolly.wegameApi.wegameApiStrings.none
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2g`: typingsJapgolly.wegameApi.wegameApiStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsJapgolly.wegameApi.wegameApiStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsJapgolly.wegameApi.wegameApiStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.wegameApi.wegameApiStrings.none = this.cast("none")
  @scala.inline
  def unknown: typingsJapgolly.wegameApi.wegameApiStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typingsJapgolly.wegameApi.wegameApiStrings.wifi = this.cast("wifi")
}

