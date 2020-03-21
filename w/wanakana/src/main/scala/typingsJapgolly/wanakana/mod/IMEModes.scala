package typingsJapgolly.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wanakana.wanakanaBooleans.`true`
  - typingsJapgolly.wanakana.wanakanaBooleans.`false`
  - typingsJapgolly.wanakana.wanakanaStrings.toHiragana
  - typingsJapgolly.wanakana.wanakanaStrings.toKatakana
*/
trait IMEModes extends js.Object

object IMEModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typingsJapgolly.wanakana.wanakanaBooleans.`false` = this.cast(false)
  @scala.inline
  def toHiragana: typingsJapgolly.wanakana.wanakanaStrings.toHiragana = this.cast("toHiragana")
  @scala.inline
  def toKatakana: typingsJapgolly.wanakana.wanakanaStrings.toKatakana = this.cast("toKatakana")
  @scala.inline
  def `true`: typingsJapgolly.wanakana.wanakanaBooleans.`true` = this.cast(true)
}

