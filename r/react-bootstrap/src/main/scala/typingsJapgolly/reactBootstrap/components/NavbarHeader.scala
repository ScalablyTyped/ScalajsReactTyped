package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.navbarHeaderMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavbarHeader {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.navbarHeaderMod.NavbarHeader] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.navbarHeaderMod.NavbarHeader] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLProps[typingsJapgolly.reactBootstrap.navbarHeaderMod.NavbarHeader], 
    ^, 
    Unit, 
    HTMLProps[typingsJapgolly.reactBootstrap.navbarHeaderMod.NavbarHeader]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.react.mod.HTMLProps[typingsJapgolly.reactBootstrap.navbarHeaderMod.NavbarHeader], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.navbarHeaderMod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[typingsJapgolly.reactBootstrap.navbarHeaderMod.NavbarHeader]])(children: _*)
  }
  @JSImport("react-bootstrap/lib/NavbarHeader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

