package typingsJapgolly.fundamentalReact.searchInputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.fundamentalReact.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInputProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var inShellbar: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var listProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to render without a search button. */
  var noSearchBtn: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]] = js.undefined
  /* Callback function when the user hits the <Enter> key. */
  var onEnter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double | js.Array[String]], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the search `<button>` element. */
  var searchBtnProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Collection of items to display in the dropdown list. */
  var searchList: js.UndefOr[js.Array[AnonCallback]] = js.undefined
}

object SearchInputProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inShellbar: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    listProps: StringDictionary[js.Any] = null,
    noSearchBtn: js.UndefOr[Boolean] = js.undefined,
    onChange: /* event */ ReactEventFrom[HTMLInputElement] => Callback = null,
    onEnter: /* value */ js.UndefOr[String | Double | js.Array[String]] => Callback = null,
    placeholder: String = null,
    searchBtnProps: StringDictionary[js.Any] = null,
    searchList: js.Array[AnonCallback] = null
  ): SearchInputProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(inShellbar)) __obj.updateDynamic("inShellbar")(inShellbar.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (!js.isUndefined(noSearchBtn)) __obj.updateDynamic("noSearchBtn")(noSearchBtn.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String | scala.Double | js.Array[java.lang.String]]) => onEnter(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (searchBtnProps != null) __obj.updateDynamic("searchBtnProps")(searchBtnProps.asInstanceOf[js.Any])
    if (searchList != null) __obj.updateDynamic("searchList")(searchList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInputProps]
  }
}

