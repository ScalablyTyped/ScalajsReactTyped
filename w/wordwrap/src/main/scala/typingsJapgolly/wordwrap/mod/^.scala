package typingsJapgolly.wordwrap.mod

import typingsJapgolly.wordwrap.AnonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wordwrap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  def apply(params: Options): Wrap = js.native
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  def apply(start: Double, stop: Double): Wrap = js.native
  def apply(start: Double, stop: Double, params: AnonMode): Wrap = js.native
  /**
    * Wrap lines until column `stop`. If a word is longer than `stop` characters
    * it will overflow.
    */
  def apply(stop: Double): Wrap = js.native
  def apply(stop: Double, params: AnonMode): Wrap = js.native
}

