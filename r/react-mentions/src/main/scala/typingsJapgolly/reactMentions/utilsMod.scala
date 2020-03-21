package typingsJapgolly.reactMentions

import typingsJapgolly.reactMentions.mod.DisplayTransformFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mentions/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def mapPlainTextIndex(
    value: String,
    markup: String,
    indexInPlainText: Double,
    inMarkupCorrection: String,
    displayTransform: DisplayTransformFunc,
    regex: js.RegExp
  ): Double = js.native
}

