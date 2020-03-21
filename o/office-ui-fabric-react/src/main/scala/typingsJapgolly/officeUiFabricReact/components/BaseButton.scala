package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseButton {
  def apply(
    IButtonProps: IButtonProps = null,
    baseClassName: String = null,
    variantClassName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IBaseButtonProps, 
    typingsJapgolly.officeUiFabricReact.mod.BaseButton, 
    Unit, 
    IBaseButtonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (IButtonProps != null) js.Dynamic.global.Object.assign(__obj, IButtonProps)
    if (baseClassName != null) __obj.updateDynamic("baseClassName")(baseClassName.asInstanceOf[js.Any])
    if (variantClassName != null) __obj.updateDynamic("variantClassName")(variantClassName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.baseButtonMod.IBaseButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.BaseButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.baseButtonMod.IBaseButtonProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "BaseButton")
  @js.native
  object componentImport extends js.Object
  
}

