package typingsJapgolly.geopattern.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  /** Gets the pattern's background color as a hexadecimal string. */
  var color: String
  /** Gets the SVG as a Base64-encoded string. */
  def toBase64(): String
  /**
    * Gets the pattern as a data URI,
    * i.e. data:image/svg+xml;base64,PHN2ZyB...
    */
  def toDataUri(): String
  /**
    * Gets the pattern as a data URL suitable for use as a CSS
    * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
    */
  def toDataUrl(): String
  /** Gets the SVG string representing the pattern. */
  def toSvg(): String
}

object Pattern {
  @scala.inline
  def apply(
    color: String,
    toBase64: CallbackTo[String],
    toDataUri: CallbackTo[String],
    toDataUrl: CallbackTo[String],
    toSvg: CallbackTo[String]
  ): Pattern = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("toBase64")(toBase64.toJsFn)
    __obj.updateDynamic("toDataUri")(toDataUri.toJsFn)
    __obj.updateDynamic("toDataUrl")(toDataUrl.toJsFn)
    __obj.updateDynamic("toSvg")(toSvg.toJsFn)
    __obj.asInstanceOf[Pattern]
  }
}

