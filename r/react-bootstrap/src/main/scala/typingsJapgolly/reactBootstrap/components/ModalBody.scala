package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.modalBodyMod.ModalBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalBody {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.modalBodyMod.ModalBody] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.modalBodyMod.ModalBody] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalBodyProps, typingsJapgolly.reactBootstrap.mod.ModalBody, Unit, ModalBodyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.modalBodyMod.ModalBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.ModalBody](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.modalBodyMod.ModalBodyProps])(children: _*)
  }
  @JSImport("react-bootstrap", "ModalBody")
  @js.native
  object componentImport extends js.Object
  
}

