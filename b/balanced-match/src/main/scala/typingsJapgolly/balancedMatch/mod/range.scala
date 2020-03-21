package typingsJapgolly.balancedMatch.mod

import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("balanced-match", "range")
@js.native
object range extends js.Object {
  /**
    * For the first non-nested matching pair of `a` and `b` in `str`,
    * return an array with indexes: `[ <a index>, <b index> ]`.
    */
  def apply(a: String, b: String, str: String): Output | Unit = js.native
  def apply(a: String, b: RegExp, str: String): Output | Unit = js.native
  def apply(a: RegExp, b: String, str: String): Output | Unit = js.native
  def apply(a: RegExp, b: RegExp, str: String): Output | Unit = js.native
}

