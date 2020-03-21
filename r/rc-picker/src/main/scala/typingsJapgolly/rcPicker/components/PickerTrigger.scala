package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcPicker.pickerTriggerMod.PickerTriggerProps
import typingsJapgolly.rcPicker.pickerTriggerMod.Placement
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerTrigger {
  def apply(
    prefixCls: String,
    visible: Boolean,
    popupElement: VdomElement,
    direction: ltr | rtl = null,
    dropdownAlign: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any = null,
    dropdownClassName: String = null,
    getPopupContainer: /* node */ HTMLElement => CallbackTo[HTMLElement] = null,
    popupPlacement: Placement = null,
    popupStyle: CSSProperties = null,
    range: js.UndefOr[Boolean] = js.undefined,
    transitionName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PickerTriggerProps, 
    MountedWithRawType[PickerTriggerProps, js.Object, RawMounted[PickerTriggerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
      if (popupElement != null) __obj.updateDynamic("popupElement")(popupElement.rawElement.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (dropdownAlign != null) __obj.updateDynamic("dropdownAlign")(dropdownAlign.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcPicker.pickerTriggerMod.PickerTriggerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcPicker.pickerTriggerMod.PickerTriggerProps])(children: _*)
  }
  @JSImport("rc-picker/lib/PickerTrigger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

