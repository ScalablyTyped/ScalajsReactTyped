package typingsJapgolly.validator

import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/matches", JSImport.Namespace)
@js.native
object matchesMod extends js.Object {
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `'foo'`
    * @param [modifiers] - `'i'`
    */
  def default(str: String, pattern: String): Boolean = js.native
  def default(str: String, pattern: String, modifiers: String): Boolean = js.native
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `/foo/i`
    */
  def default(str: String, pattern: RegExp): Boolean = js.native
}

