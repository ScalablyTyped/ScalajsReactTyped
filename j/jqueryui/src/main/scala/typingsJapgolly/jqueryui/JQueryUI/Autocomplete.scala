package typingsJapgolly.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete
  extends AutocompleteOptions
     with Widget {
  def escapeRegex(value: String): String = js.native
  def filter(array: js.Any, term: String): js.Any = js.native
}

