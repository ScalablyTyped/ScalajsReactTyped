package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libModalModalMod.ModalFuncProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalUseModalHookModalMod extends Shortcut {
  
  @JSImport("antd/lib/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HookModalProps & RefAttributes[HookModalRef]] = js.native
  
  trait HookModalProps extends StObject {
    
    def afterClose(): Unit
    
    var config: ModalFuncProps
  }
  object HookModalProps {
    
    inline def apply(afterClose: Callback, config: ModalFuncProps): HookModalProps = {
      val __obj = js.Dynamic.literal(afterClose = afterClose.toJsFn, config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookModalProps]
    }
    
    extension [Self <: HookModalProps](x: Self) {
      
      inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
      
      inline def setConfig(value: ModalFuncProps): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait HookModalRef extends StObject {
    
    def destroy(): Unit
    
    def update(config: ModalFuncProps): Unit
  }
  object HookModalRef {
    
    inline def apply(destroy: Callback, update: ModalFuncProps => Callback): HookModalRef = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, update = js.Any.fromFunction1((t0: ModalFuncProps) => update(t0).runNow()))
      __obj.asInstanceOf[HookModalRef]
    }
    
    extension [Self <: HookModalRef](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setUpdate(value: ModalFuncProps => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: ModalFuncProps) => value(t0).runNow()))
    }
  }
  
  type _To = ForwardRefExoticComponent[HookModalProps & RefAttributes[HookModalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libModalUseModalHookModalMod.foo` */
  override def _to: ForwardRefExoticComponent[HookModalProps & RefAttributes[HookModalRef]] = default
}
