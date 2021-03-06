package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.DrawerProps
import typingsJapgolly.materialUi.drawerMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  def apply(
    className: String = null,
    containerClassName: String = null,
    containerStyle: CSSProperties = null,
    disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
    docked: js.UndefOr[Boolean] = js.undefined,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openSecondary: js.UndefOr[Boolean] = js.undefined,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    style: CSSProperties = null,
    swipeAreaWidth: Int | Double = null,
    width: Double | String = null,
    zDepth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerProps, default, Unit, DrawerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSwipeToOpen)) __obj.updateDynamic("disableSwipeToOpen")(disableSwipeToOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2((t0: /* opening */ scala.Boolean, t1: /* reason */ java.lang.String) => onRequestChange(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(openSecondary)) __obj.updateDynamic("openSecondary")(openSecondary.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeAreaWidth != null) __obj.updateDynamic("swipeAreaWidth")(swipeAreaWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.DrawerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.drawerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.DrawerProps])(children: _*)
  }
  @JSImport("material-ui/Drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

