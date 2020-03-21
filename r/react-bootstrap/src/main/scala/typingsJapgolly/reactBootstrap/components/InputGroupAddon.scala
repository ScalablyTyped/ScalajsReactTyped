package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.inputGroupAddonMod.InputGroupAddonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputGroupAddon {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.inputGroupAddonMod.InputGroupAddon] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.inputGroupAddonMod.InputGroupAddon] = null,
    bsClass: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InputGroupAddonProps, 
    typingsJapgolly.reactBootstrap.mod.InputGroupAddon, 
    Unit, 
    InputGroupAddonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.inputGroupAddonMod.InputGroupAddonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.InputGroupAddon](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.inputGroupAddonMod.InputGroupAddonProps])(children: _*)
  }
  @JSImport("react-bootstrap", "InputGroupAddon")
  @js.native
  object componentImport extends js.Object
  
}

