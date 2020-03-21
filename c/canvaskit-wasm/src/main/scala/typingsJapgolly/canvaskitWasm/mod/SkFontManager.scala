package typingsJapgolly.canvaskitWasm.mod

import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkFontManager extends SkObject[SkFontManager] {
  def MakeTypefaceFromData(data: js.Array[Double]): SkTypeface = js.native
  def MakeTypefaceFromData(data: ArrayBuffer): SkTypeface = js.native
  def MakeTypefaceFromData(data: Uint8Array): SkTypeface = js.native
  def countFamilies(): Double = js.native
}

