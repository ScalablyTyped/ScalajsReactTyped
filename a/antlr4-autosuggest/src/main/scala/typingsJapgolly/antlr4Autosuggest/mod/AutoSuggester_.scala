package typingsJapgolly.antlr4Autosuggest.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSuggester_ extends js.Object {
  def autosuggest(inputText: String): js.Array[String]
}

object AutoSuggester_ {
  @scala.inline
  def apply(autosuggest: String => CallbackTo[js.Array[String]]): AutoSuggester_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autosuggest")(js.Any.fromFunction1((t0: java.lang.String) => autosuggest(t0).runNow()))
    __obj.asInstanceOf[AutoSuggester_]
  }
}

