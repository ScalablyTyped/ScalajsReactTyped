package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.libModalModalMod.ModalFuncProps
import typingsJapgolly.antd.libModalUseModalHookModalMod.HookModalProps
import typingsJapgolly.antd.libModalUseModalHookModalMod.HookModalRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HookModal {
  
  inline def apply(afterClose: Callback, config: ModalFuncProps): Default[HookModalRef] = {
    val __props = js.Dynamic.literal(afterClose = afterClose.toJsFn, config = config.asInstanceOf[js.Any])
    new Default[HookModalRef](js.Array(this.component, __props.asInstanceOf[HookModalProps & RefAttributes[HookModalRef]]))
  }
  
  @JSImport("antd/lib/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HookModalProps & RefAttributes[HookModalRef]): Default[HookModalRef] = new Default[HookModalRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
