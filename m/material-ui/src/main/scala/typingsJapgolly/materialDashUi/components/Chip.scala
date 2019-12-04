package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDashUi.__MaterialUI.ChipProps
import typingsJapgolly.materialDashUi.chipMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chip {
  def apply(
    backgroundColor: String = null,
    className: String = null,
    containerElement: Node | String = null,
    deleteIconStyle: CSSProperties = null,
    labelColor: String = null,
    labelStyle: CSSProperties = null,
    onClick: ReactMouseEventFrom[typingsJapgolly.materialDashUi.__MaterialUI.Chip with Element] => Callback = null,
    onRequestDelete: ReactTouchEventFrom[typingsJapgolly.materialDashUi.__MaterialUI.Chip with Element] => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ChipProps, default, Unit, ChipProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (deleteIconStyle != null) __obj.updateDynamic("deleteIconStyle")(deleteIconStyle.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.materialDashUi.__MaterialUI.Chip with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onRequestDelete != null) __obj.updateDynamic("onRequestDelete")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.materialDashUi.__MaterialUI.Chip with org.scalajs.dom.raw.Element]) => onRequestDelete(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.ChipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.chipMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.ChipProps])(children: _*)
  }
  @JSImport("material-ui/Chip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

