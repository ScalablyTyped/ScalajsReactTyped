package typingsJapgolly.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteOptions extends js.Object {
  var input: js.UndefOr[String | HTMLElement] = js.undefined
  var location: js.UndefOr[String | Map | Point] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ AutocompleteResult, Unit]] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    input: String | HTMLElement = null,
    location: String | Map | Point = null,
    onSearchComplete: /* result */ AutocompleteResult => japgolly.scalajs.react.Callback = null,
    types: js.Array[String] = null
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.baidumapWebSdk.BMap.AutocompleteResult) => onSearchComplete(t0).runNow()))
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

