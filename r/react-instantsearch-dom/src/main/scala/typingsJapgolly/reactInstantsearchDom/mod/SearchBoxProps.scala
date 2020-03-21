package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxProps extends CommonWidgetProps {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var defaultRefinement: js.UndefOr[String] = js.undefined
  var focusShortcuts: js.UndefOr[js.Array[String]] = js.undefined
  var loadingIndicator: js.UndefOr[Element] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], _]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLFormElement], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLFormElement], _]] = js.undefined
  var reset: js.UndefOr[Element] = js.undefined
  var searchAsYouType: js.UndefOr[Boolean] = js.undefined
  var showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  var submit: js.UndefOr[Element] = js.undefined
}

object SearchBoxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultRefinement: String = null,
    focusShortcuts: js.Array[String] = null,
    loadingIndicator: VdomElement = null,
    onChange: /* event */ ReactEventFrom[HTMLInputElement] => CallbackTo[js.Any] = null,
    onReset: /* event */ ReactEventFrom[HTMLFormElement] => CallbackTo[js.Any] = null,
    onSubmit: /* event */ ReactEventFrom[HTMLFormElement] => CallbackTo[js.Any] = null,
    reset: VdomElement = null,
    searchAsYouType: js.UndefOr[Boolean] = js.undefined,
    showLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    submit: VdomElement = null,
    translations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])] = null
  ): SearchBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    if (focusShortcuts != null) __obj.updateDynamic("focusShortcuts")(focusShortcuts.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.rawElement.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLFormElement]) => onReset(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLFormElement]) => onSubmit(t0).runNow()))
    if (reset != null) __obj.updateDynamic("reset")(reset.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(searchAsYouType)) __obj.updateDynamic("searchAsYouType")(searchAsYouType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadingIndicator)) __obj.updateDynamic("showLoadingIndicator")(showLoadingIndicator.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.rawElement.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBoxProps]
  }
}

