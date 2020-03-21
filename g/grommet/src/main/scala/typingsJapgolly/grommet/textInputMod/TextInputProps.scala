package typingsJapgolly.grommet.textInputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grommet.AnonEnterSelect
import typingsJapgolly.grommet.AnonLabelValue
import typingsJapgolly.grommet.AnonLeft
import typingsJapgolly.grommet.AnonSuggestion
import typingsJapgolly.grommet.dropMod.DropProps
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.utilsMod.PlaceHolderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps extends js.Object {
  var dropAlign: js.UndefOr[AnonLeft] = js.undefined
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[AnonEnterSelect] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* x */ AnonSuggestion, Unit]] = js.undefined
  var onSuggestionsClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSuggestionsOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var suggestions: js.UndefOr[js.Array[AnonLabelValue | String]] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    dropAlign: AnonLeft = null,
    dropHeight: xsmall | small | medium | large | xlarge | String = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    messages: AnonEnterSelect = null,
    name: String = null,
    onSelect: /* x */ AnonSuggestion => Callback = null,
    onSuggestionsClose: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSuggestionsOpen: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    placeholder: PlaceHolderType = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    suggestions: js.Array[AnonLabelValue | String] = null,
    value: String | Double = null
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign.asInstanceOf[js.Any])
    if (dropHeight != null) __obj.updateDynamic("dropHeight")(dropHeight.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* x */ typingsJapgolly.grommet.AnonSuggestion) => onSelect(t0).runNow()))
    if (onSuggestionsClose != null) __obj.updateDynamic("onSuggestionsClose")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSuggestionsClose(t0).runNow()))
    if (onSuggestionsOpen != null) __obj.updateDynamic("onSuggestionsOpen")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSuggestionsOpen(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

