package typingsJapgolly.reactAriaModal.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAriaModal.PickAriaModalPropstitleId
import typingsJapgolly.reactAriaModal.PickAriaModalPropstitleTe
import typingsJapgolly.reactAriaModal.mod.AriaModalProps
import typingsJapgolly.reactAriaModal.mod.RequiredAriaTypes
import typingsJapgolly.reactAriaModal.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ReactAriaModal {
  def apply(
    props: AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]) with js.Object, 
    default, 
    Unit, 
    AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAriaModal.mod.AriaModalProps with (typingsJapgolly.reactAriaModal.mod.RequiredAriaTypes[
    typingsJapgolly.reactAriaModal.PickAriaModalPropstitleId, 
    typingsJapgolly.reactAriaModal.PickAriaModalPropstitleTe
  ]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAriaModal.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAriaModal.mod.AriaModalProps with (typingsJapgolly.reactAriaModal.mod.RequiredAriaTypes[
  typingsJapgolly.reactAriaModal.PickAriaModalPropstitleId, 
  typingsJapgolly.reactAriaModal.PickAriaModalPropstitleTe]) with js.Object])(children: _*)
  }
  @JSImport("react-aria-modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

