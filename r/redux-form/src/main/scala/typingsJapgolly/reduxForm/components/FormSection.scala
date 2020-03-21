package typingsJapgolly.reduxForm.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxForm.formSectionMod.FormSectionProps
import typingsJapgolly.reduxForm.formSectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object FormSection {
  def apply[P](
    props: FormSectionProps[P] with P with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FormSectionProps[P] with P with js.Object, 
    default[P], 
    Unit, 
    FormSectionProps[P] with P with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxForm.formSectionMod.FormSectionProps[P] with P with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxForm.formSectionMod.default[P]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxForm.formSectionMod.FormSectionProps[P] with P with js.Object])(children: _*)
  }
  @JSImport("redux-form/lib/FormSection", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

