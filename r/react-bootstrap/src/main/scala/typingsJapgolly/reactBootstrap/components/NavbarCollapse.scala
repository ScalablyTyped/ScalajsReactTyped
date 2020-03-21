package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.navbarCollapseMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavbarCollapse {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.navbarCollapseMod.NavbarCollapse] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.navbarCollapseMod.NavbarCollapse] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLProps[typingsJapgolly.reactBootstrap.navbarCollapseMod.NavbarCollapse], 
    ^, 
    Unit, 
    HTMLProps[typingsJapgolly.reactBootstrap.navbarCollapseMod.NavbarCollapse]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.react.mod.HTMLProps[typingsJapgolly.reactBootstrap.navbarCollapseMod.NavbarCollapse], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.navbarCollapseMod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[typingsJapgolly.reactBootstrap.navbarCollapseMod.NavbarCollapse]])(children: _*)
  }
  @JSImport("react-bootstrap/lib/NavbarCollapse", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

