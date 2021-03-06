package typingsJapgolly.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseHelper extends js.Object {
  /**
  	 * Retrieves a template string from a script tag with the given id.j
  	 */
  def fromId(id: String): String = js.native
  /**
  	 * @returns true if the given value is a parsed template
  	 */
  def isParsed(template: js.Any): Boolean = js.native
  /**
  	 * Parse the given template with Ractive.parse.
  	 */
  def parse(template: String): ParsedTemplate = js.native
  def parse(template: String, opts: ParseOpts): ParsedTemplate = js.native
}

