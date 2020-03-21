package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonImageLabel
import typingsJapgolly.fundamentalReact.multiInputMod.MultiInputProps
import typingsJapgolly.fundamentalReact.multiInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiInput {
  def apply(
    data: js.Array[String | Double | js.Array[String]],
    onTagsUpdate: js.Array[String] => Callback,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    listProps: StringDictionary[js.Any] = null,
    localizedText: AnonImageLabel = null,
    placeHolder: String = null,
    popoverProps: StringDictionary[js.Any] = null,
    tagProps: StringDictionary[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MultiInputProps, default, Unit, MultiInputProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onTagsUpdate")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => onTagsUpdate(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.multiInputMod.MultiInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.multiInputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.multiInputMod.MultiInputProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/MultiInput/MultiInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

