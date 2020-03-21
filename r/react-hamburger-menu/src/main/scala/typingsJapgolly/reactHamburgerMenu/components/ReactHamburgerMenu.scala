package typingsJapgolly.reactHamburgerMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactHamburgerMenu.mod.HamburgerMenuProps
import typingsJapgolly.reactHamburgerMenu.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHamburgerMenu {
  def apply(
    color: String,
    isOpen: Boolean,
    menuClicked: Callback,
    animationDuration: Int | Double = null,
    borderRadius: Int | Double = null,
    height: Int | Double = null,
    rotate: Int | Double = null,
    strokeWidth: Int | Double = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HamburgerMenuProps, default, Unit, HamburgerMenuProps] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
  
      __obj.updateDynamic("menuClicked")(menuClicked.toJsFn)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHamburgerMenu.mod.HamburgerMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHamburgerMenu.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHamburgerMenu.mod.HamburgerMenuProps])(children: _*)
  }
  @JSImport("react-hamburger-menu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

