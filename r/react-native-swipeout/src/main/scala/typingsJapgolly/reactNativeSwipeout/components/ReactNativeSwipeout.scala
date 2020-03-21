package typingsJapgolly.reactNativeSwipeout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typingsJapgolly.reactNativeSwipeout.mod.SwipeoutProperties
import typingsJapgolly.reactNativeSwipeout.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSwipeout {
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    buttonWidth: Int | Double = null,
    close: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[SwipeoutButtonProperties] = null,
    onClose: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback = null,
    onOpen: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback = null,
    openLeft: js.UndefOr[Boolean] = js.undefined,
    openRight: js.UndefOr[Boolean] = js.undefined,
    right: js.Array[SwipeoutButtonProperties] = null,
    rowId: Int | Double = null,
    scroll: /* scrollEnabled */ Boolean => Callback = null,
    sectionId: Int | Double = null,
    sensitivity: Int | Double = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwipeoutProperties, default, Unit, SwipeoutProperties] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (buttonWidth != null) __obj.updateDynamic("buttonWidth")(buttonWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction3((t0: /* sectionId */ scala.Double, t1: /* rowId */ scala.Double, t2: /* direction */ java.lang.String) => onClose(t0, t1, t2).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction3((t0: /* sectionId */ scala.Double, t1: /* rowId */ scala.Double, t2: /* direction */ java.lang.String) => onOpen(t0, t1, t2).runNow()))
    if (!js.isUndefined(openLeft)) __obj.updateDynamic("openLeft")(openLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(openRight)) __obj.updateDynamic("openRight")(openRight.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1((t0: /* scrollEnabled */ scala.Boolean) => scroll(t0).runNow()))
    if (sectionId != null) __obj.updateDynamic("sectionId")(sectionId.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSwipeout.mod.SwipeoutProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSwipeout.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSwipeout.mod.SwipeoutProperties])(children: _*)
  }
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

