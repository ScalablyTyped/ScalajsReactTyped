package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.AppBarProps
import typingsJapgolly.materialUi.appBarMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppBar {
  def apply(
    className: String = null,
    iconClassNameLeft: String = null,
    iconClassNameRight: String = null,
    iconElementLeft: VdomElement = null,
    iconElementRight: VdomElement = null,
    iconStyleLeft: CSSProperties = null,
    iconStyleRight: CSSProperties = null,
    onLeftIconButtonClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onRightIconButtonClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onTitleClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    showMenuIconButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: VdomNode = null,
    titleStyle: CSSProperties = null,
    zDepth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AppBarProps, default, Unit, AppBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (iconClassNameLeft != null) __obj.updateDynamic("iconClassNameLeft")(iconClassNameLeft.asInstanceOf[js.Any])
    if (iconClassNameRight != null) __obj.updateDynamic("iconClassNameRight")(iconClassNameRight.asInstanceOf[js.Any])
    if (iconElementLeft != null) __obj.updateDynamic("iconElementLeft")(iconElementLeft.rawElement.asInstanceOf[js.Any])
    if (iconElementRight != null) __obj.updateDynamic("iconElementRight")(iconElementRight.rawElement.asInstanceOf[js.Any])
    if (iconStyleLeft != null) __obj.updateDynamic("iconStyleLeft")(iconStyleLeft.asInstanceOf[js.Any])
    if (iconStyleRight != null) __obj.updateDynamic("iconStyleRight")(iconStyleRight.asInstanceOf[js.Any])
    if (onLeftIconButtonClick != null) __obj.updateDynamic("onLeftIconButtonClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onLeftIconButtonClick(t0).runNow()))
    if (onRightIconButtonClick != null) __obj.updateDynamic("onRightIconButtonClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onRightIconButtonClick(t0).runNow()))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTitleClick(t0).runNow()))
    if (!js.isUndefined(showMenuIconButton)) __obj.updateDynamic("showMenuIconButton")(showMenuIconButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.AppBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.appBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.AppBarProps])(children: _*)
  }
  @JSImport("material-ui/AppBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

