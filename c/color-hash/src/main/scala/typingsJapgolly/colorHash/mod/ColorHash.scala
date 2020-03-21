package typingsJapgolly.colorHash.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHash extends js.Object {
  /**
    * Returns the hash in hex.
    *
    * @param input string to hash
    * @returns hex with #
    */
  def hex(input: String): String
  /**
    * Returns the hash in [h, s, l].
    * Note that H ∈ [0, 360); S ∈ [0, 1]; L ∈ [0, 1];
    *
    * @param input string to hash
    * @returns [h, s, l]
    */
  def hsl(input: String): ColorValueArray
  /**
    * Returns the hash in [r, g, b].
    * Note that R, G, B ∈ [0, 255]
    *
    * @param input string to hash
    * @returns [r, g, b]
    */
  def rgb(input: String): ColorValueArray
}

object ColorHash {
  @scala.inline
  def apply(
    hex: String => CallbackTo[String],
    hsl: String => CallbackTo[ColorValueArray],
    rgb: String => CallbackTo[ColorValueArray]
  ): ColorHash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hex")(js.Any.fromFunction1((t0: java.lang.String) => hex(t0).runNow()))
    __obj.updateDynamic("hsl")(js.Any.fromFunction1((t0: java.lang.String) => hsl(t0).runNow()))
    __obj.updateDynamic("rgb")(js.Any.fromFunction1((t0: java.lang.String) => rgb(t0).runNow()))
    __obj.asInstanceOf[ColorHash]
  }
}

