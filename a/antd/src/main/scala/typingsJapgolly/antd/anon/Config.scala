package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antd.antdStrings.warn
import typingsJapgolly.antd.libModalConfirmMod.ModalStaticFunctions
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.Function1[/* hasRootPrefixCls */ RootPrefixCls, Unit]
  
  def destroyAll(): Unit
  
  var useModal: js.Function0[js.Tuple2[Omit[ModalStaticFunctions, warn], Element]]
}
object Config {
  
  inline def apply(
    config: /* hasRootPrefixCls */ RootPrefixCls => Callback,
    destroyAll: Callback,
    useModal: CallbackTo[js.Tuple2[Omit[ModalStaticFunctions, warn], Element]]
  ): Config = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1((t0: /* hasRootPrefixCls */ RootPrefixCls) => config(t0).runNow()), destroyAll = destroyAll.toJsFn, useModal = useModal.toJsFn)
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: /* hasRootPrefixCls */ RootPrefixCls => Callback): Self = StObject.set(x, "config", js.Any.fromFunction1((t0: /* hasRootPrefixCls */ RootPrefixCls) => value(t0).runNow()))
    
    inline def setDestroyAll(value: Callback): Self = StObject.set(x, "destroyAll", value.toJsFn)
    
    inline def setUseModal(value: CallbackTo[js.Tuple2[Omit[ModalStaticFunctions, warn], Element]]): Self = StObject.set(x, "useModal", value.toJsFn)
  }
}
