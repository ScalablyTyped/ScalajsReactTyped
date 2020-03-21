package typingsJapgolly.opentypeJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var charset: String
  var font: Font
  def charToGlyphIndex(c: String): Double
}

object Encoding {
  @scala.inline
  def apply(charToGlyphIndex: String => CallbackTo[Double], charset: String, font: Font): Encoding = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.updateDynamic("charToGlyphIndex")(js.Any.fromFunction1((t0: java.lang.String) => charToGlyphIndex(t0).runNow()))
    __obj.asInstanceOf[Encoding]
  }
}

