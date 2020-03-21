package typingsJapgolly.hapiFormula.mod

import typingsJapgolly.hapiFormula.mod.Options.Reference
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A hash of key - value pairs used to convert constants to values.
    */
  val constants: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * A hash of key-value pairs used to resolve formula functions.
    */
  val functions: js.UndefOr[Record[String, js.Function]] = js.undefined
  /**
    * A variable resolver factory function.
    */
  val reference: js.UndefOr[Reference] = js.undefined
  /**
    * A regular expression used to validate token variables.
    */
  val tokenRx: js.UndefOr[js.RegExp] = js.undefined
}

@JSImport("@hapi/formula", "Options")
@js.native
object Options extends js.Object {
  type Reference = js.Function1[/* name */ String, js.Function1[/* context */ js.Any, js.Any]]
}

