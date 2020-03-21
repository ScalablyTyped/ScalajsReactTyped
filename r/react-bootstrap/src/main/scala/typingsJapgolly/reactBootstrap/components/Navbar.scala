package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.navbarMod.NavbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navbar {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.navbarMod.Navbar] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.navbarMod.Navbar] = null,
    brand: js.Any = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    collapseOnSelect: js.UndefOr[Boolean] = js.undefined,
    componentClass: ReactType[_] = null,
    defaultNavExpanded: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    fixedBottom: js.UndefOr[Boolean] = js.undefined,
    fixedTop: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    onToggle: js.Function = null,
    staticTop: js.UndefOr[Boolean] = js.undefined,
    toggleButton: js.Any = null,
    toggleNavKey: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NavbarProps, typingsJapgolly.reactBootstrap.mod.Navbar, Unit, NavbarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnSelect)) __obj.updateDynamic("collapseOnSelect")(collapseOnSelect.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNavExpanded)) __obj.updateDynamic("defaultNavExpanded")(defaultNavExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedBottom)) __obj.updateDynamic("fixedBottom")(fixedBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedTop)) __obj.updateDynamic("fixedTop")(fixedTop.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(staticTop)) __obj.updateDynamic("staticTop")(staticTop.asInstanceOf[js.Any])
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton.asInstanceOf[js.Any])
    if (toggleNavKey != null) __obj.updateDynamic("toggleNavKey")(toggleNavKey.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.navbarMod.NavbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Navbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.navbarMod.NavbarProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Navbar")
  @js.native
  object componentImport extends js.Object
  
}

