package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.formGroupMod.FormGroupProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.error
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.success
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormGroup {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.formGroupMod.FormGroup] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.formGroupMod.FormGroup] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    controlId: String = null,
    validationState: success | warning | error = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FormGroupProps, typingsJapgolly.reactBootstrap.mod.FormGroup, Unit, FormGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (controlId != null) __obj.updateDynamic("controlId")(controlId.asInstanceOf[js.Any])
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.formGroupMod.FormGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.FormGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.formGroupMod.FormGroupProps])(children: _*)
  }
  @JSImport("react-bootstrap", "FormGroup")
  @js.native
  object componentImport extends js.Object
  
}

