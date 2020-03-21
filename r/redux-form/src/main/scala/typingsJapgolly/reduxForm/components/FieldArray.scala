package typingsJapgolly.reduxForm.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxForm.fieldArrayMod.BaseFieldArrayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object FieldArray {
  def apply[P, FieldValue](
    props: (BaseFieldArrayProps[P, FieldValue]) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    (BaseFieldArrayProps[P, FieldValue]) with js.Object, 
    typingsJapgolly.reduxForm.mod.FieldArray[P, FieldValue], 
    Unit, 
    (BaseFieldArrayProps[P, FieldValue]) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  (typingsJapgolly.reduxForm.fieldArrayMod.BaseFieldArrayProps[P, FieldValue]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxForm.mod.FieldArray[P, FieldValue]](this.componentImport)
    f(__obj.asInstanceOf[(typingsJapgolly.reduxForm.fieldArrayMod.BaseFieldArrayProps[P, FieldValue]) with js.Object])(children: _*)
  }
  @JSImport("redux-form", "FieldArray")
  @js.native
  object componentImport extends js.Object
  
}

