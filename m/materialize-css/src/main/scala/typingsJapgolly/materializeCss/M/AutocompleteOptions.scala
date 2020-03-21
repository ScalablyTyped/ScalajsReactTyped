package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteOptions extends js.Object {
  /**
    * Data object defining autocomplete options with optional icon strings.
    */
  var data: AutocompleteData
  /**
    * Limit of results the autocomplete shows.
    * @default infinity
    */
  var limit: Double
  /**
    * Minimum number of characters before autocomplete starts.
    * @default 1
    */
  var minLength: Double
  /**
    * Callback for when autocompleted.
    */
  def onAutocomplete(text: String): Unit
  /**
    * Sort function that defines the order of the list of autocomplete options.
    */
  def sortFunction(a: String, b: String, inputText: String): Double
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    data: AutocompleteData,
    limit: Double,
    minLength: Double,
    onAutocomplete: String => Callback,
    sortFunction: (String, String, String) => CallbackTo[Double]
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any])
    __obj.updateDynamic("onAutocomplete")(js.Any.fromFunction1((t0: java.lang.String) => onAutocomplete(t0).runNow()))
    __obj.updateDynamic("sortFunction")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sortFunction(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

