package typingsJapgolly.reduxForm.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxForm.fieldsMod.BaseFieldsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Fields {
  def apply[P](
    props: BaseFieldsProps[P] with P with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BaseFieldsProps[P] with P with js.Object, 
    typingsJapgolly.reduxForm.mod.Fields[P], 
    Unit, 
    BaseFieldsProps[P] with P with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxForm.fieldsMod.BaseFieldsProps[P] with P with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxForm.mod.Fields[P]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxForm.fieldsMod.BaseFieldsProps[P] with P with js.Object])(children: _*)
  }
  @JSImport("redux-form", "Fields")
  @js.native
  object componentImport extends js.Object
  
}

