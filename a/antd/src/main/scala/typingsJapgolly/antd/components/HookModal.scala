package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.hookModalMod.HookModalProps
import typingsJapgolly.antd.hookModalMod.HookModalRef
import typingsJapgolly.antd.modalModalMod.ModalFuncProps
import typingsJapgolly.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HookModal {
  def apply(
    config: ModalFuncProps,
    afterClose: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HookModalProps with RefAttributes[HookModalRef], 
    Ref, 
    Unit, 
    HookModalProps with RefAttributes[HookModalRef]
  ] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      __obj.updateDynamic("afterClose")(afterClose.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.hookModalMod.HookModalProps with typingsJapgolly.react.mod.RefAttributes[typingsJapgolly.antd.hookModalMod.HookModalRef], 
  japgolly.scalajs.react.Children.Varargs, 
  japgolly.scalajs.react.raw.React.Ref](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.hookModalMod.HookModalProps with typingsJapgolly.react.mod.RefAttributes[typingsJapgolly.antd.hookModalMod.HookModalRef]])(children: _*)
  }
  @JSImport("antd/lib/modal/useModal/HookModal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

