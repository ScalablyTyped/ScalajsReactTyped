package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xterm.xtermNumbers.`0`
import typingsJapgolly.xterm.xtermNumbers.`1`
import typingsJapgolly.xterm.xtermNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnicodeVersionProvider extends js.Object {
  /**
    * String indicating the Unicode version provided.
    */
  val version: String
  /**
    * Unicode version dependent wcwidth implementation.
    */
  def wcwidth(codepoint: Double): `0` | `1` | `2`
}

object IUnicodeVersionProvider {
  @scala.inline
  def apply(version: String, wcwidth: Double => CallbackTo[`0` | `1` | `2`]): IUnicodeVersionProvider = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("wcwidth")(js.Any.fromFunction1((t0: scala.Double) => wcwidth(t0).runNow()))
    __obj.asInstanceOf[IUnicodeVersionProvider]
  }
}

