package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.buttonMod.ButtonProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.buttonMod.Button] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.buttonMod.Button] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    block: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    componentClass: ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ButtonProps, typingsJapgolly.reactBootstrap.mod.Button, Unit, ButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.buttonMod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Button](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.buttonMod.ButtonProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Button")
  @js.native
  object componentImport extends js.Object
  
}

