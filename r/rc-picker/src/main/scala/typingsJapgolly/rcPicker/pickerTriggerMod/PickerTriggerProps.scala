package typingsJapgolly.rcPicker.pickerTriggerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerTriggerProps extends js.Object {
  var children: Element
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var dropdownAlign: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any
  ] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
  var popupElement: Element
  var popupPlacement: js.UndefOr[Placement] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: String
  var range: js.UndefOr[Boolean] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: Boolean
}

object PickerTriggerProps {
  @scala.inline
  def apply(
    children: VdomElement,
    popupElement: VdomElement,
    prefixCls: String,
    visible: Boolean,
    direction: ltr | rtl = null,
    dropdownAlign: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any = null,
    dropdownClassName: String = null,
    getPopupContainer: /* node */ HTMLElement => CallbackTo[HTMLElement] = null,
    popupPlacement: Placement = null,
    popupStyle: CSSProperties = null,
    range: js.UndefOr[Boolean] = js.undefined,
    transitionName: String = null
  ): PickerTriggerProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (popupElement != null) __obj.updateDynamic("popupElement")(popupElement.rawElement.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (dropdownAlign != null) __obj.updateDynamic("dropdownAlign")(dropdownAlign.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerTriggerProps]
  }
}

