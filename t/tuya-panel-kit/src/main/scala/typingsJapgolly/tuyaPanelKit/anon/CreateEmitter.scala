package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tuyaPanelKit.mod.AnyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmitter extends StObject {
  
  def addListener(listener: AnyFunction): Unit
  
  def createEmitter(): Unit
  
  /**
    * 跳转面板, 等同于jumpSubPage, 只是传参形式的区别
    * @param uiId uiid
    * @param props 携带参数
    */
  def pushWithUiID(uiId: String, props: Any): Unit
  
  def registerEventListener(): Unit
  
  def removeEmitter(): Unit
  
  def sendEvent(props: Any): Unit
}
object CreateEmitter {
  
  inline def apply(
    addListener: AnyFunction => Callback,
    createEmitter: Callback,
    pushWithUiID: (String, Any) => Callback,
    registerEventListener: Callback,
    removeEmitter: Callback,
    sendEvent: Any => Callback
  ): CreateEmitter = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: AnyFunction) => addListener(t0).runNow()), createEmitter = createEmitter.toJsFn, pushWithUiID = js.Any.fromFunction2((t0: String, t1: Any) => (pushWithUiID(t0, t1)).runNow()), registerEventListener = registerEventListener.toJsFn, removeEmitter = removeEmitter.toJsFn, sendEvent = js.Any.fromFunction1((t0: Any) => sendEvent(t0).runNow()))
    __obj.asInstanceOf[CreateEmitter]
  }
  
  extension [Self <: CreateEmitter](x: Self) {
    
    inline def setAddListener(value: AnyFunction => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: AnyFunction) => value(t0).runNow()))
    
    inline def setCreateEmitter(value: Callback): Self = StObject.set(x, "createEmitter", value.toJsFn)
    
    inline def setPushWithUiID(value: (String, Any) => Callback): Self = StObject.set(x, "pushWithUiID", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRegisterEventListener(value: Callback): Self = StObject.set(x, "registerEventListener", value.toJsFn)
    
    inline def setRemoveEmitter(value: Callback): Self = StObject.set(x, "removeEmitter", value.toJsFn)
    
    inline def setSendEvent(value: Any => Callback): Self = StObject.set(x, "sendEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
