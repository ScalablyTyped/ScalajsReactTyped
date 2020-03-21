package typingsJapgolly.styledReactModal.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsJapgolly.styledReactModal.mod.ModalProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalProvider {
  def apply(
    backgroundComponent: AnyStyledComponent = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ModalProviderProps, 
    typingsJapgolly.styledReactModal.mod.ModalProvider, 
    Unit, 
    ModalProviderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styledReactModal.mod.ModalProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styledReactModal.mod.ModalProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styledReactModal.mod.ModalProviderProps])(children: _*)
  }
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  object componentImport extends js.Object
  
}

