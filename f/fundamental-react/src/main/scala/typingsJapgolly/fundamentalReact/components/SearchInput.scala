package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.fundamentalReact.AnonCallback
import typingsJapgolly.fundamentalReact.searchInputMod.SearchInputProps
import typingsJapgolly.fundamentalReact.searchInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchInput {
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
    searchList: js.Array[AnonCallback] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SearchInputProps, default, Unit, SearchInputProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.searchInputMod.SearchInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.searchInputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.searchInputMod.SearchInputProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

