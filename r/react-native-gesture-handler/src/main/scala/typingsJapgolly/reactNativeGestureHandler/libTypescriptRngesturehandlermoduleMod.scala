package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactNativeGestureHandler.libTypescriptActionTypeMod.ActionType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptRngesturehandlermoduleMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule", JSImport.Default)
  @js.native
  val default: RNGestureHandlerModuleProps = js.native
  
  trait RNGestureHandlerModuleProps extends StObject {
    
    def attachGestureHandler(handlerTag: Double, newView: Double, actionType: ActionType): Unit
    
    def createGestureHandler(handlerName: String, handlerTag: Double, config: Record[String, Any]): Unit
    
    def dropGestureHandler(handlerTag: Double): Unit
    
    def flushOperations(): Unit
    
    def handleClearJSResponder(): Unit
    
    def handleSetJSResponder(tag: Double, blockNativeResponder: Boolean): Unit
    
    def install(): Unit
    
    def updateGestureHandler(handlerTag: Double, newConfig: Record[String, Any]): Unit
  }
  object RNGestureHandlerModuleProps {
    
    inline def apply(
      attachGestureHandler: (Double, Double, ActionType) => Callback,
      createGestureHandler: (String, Double, Record[String, Any]) => Callback,
      dropGestureHandler: Double => Callback,
      flushOperations: Callback,
      handleClearJSResponder: Callback,
      handleSetJSResponder: (Double, Boolean) => Callback,
      install: Callback,
      updateGestureHandler: (Double, Record[String, Any]) => Callback
    ): RNGestureHandlerModuleProps = {
      val __obj = js.Dynamic.literal(attachGestureHandler = js.Any.fromFunction3((t0: Double, t1: Double, t2: ActionType) => (attachGestureHandler(t0, t1, t2)).runNow()), createGestureHandler = js.Any.fromFunction3((t0: String, t1: Double, t2: Record[String, Any]) => (createGestureHandler(t0, t1, t2)).runNow()), dropGestureHandler = js.Any.fromFunction1((t0: Double) => dropGestureHandler(t0).runNow()), flushOperations = flushOperations.toJsFn, handleClearJSResponder = handleClearJSResponder.toJsFn, handleSetJSResponder = js.Any.fromFunction2((t0: Double, t1: Boolean) => (handleSetJSResponder(t0, t1)).runNow()), install = install.toJsFn, updateGestureHandler = js.Any.fromFunction2((t0: Double, t1: Record[String, Any]) => (updateGestureHandler(t0, t1)).runNow()))
      __obj.asInstanceOf[RNGestureHandlerModuleProps]
    }
    
    extension [Self <: RNGestureHandlerModuleProps](x: Self) {
      
      inline def setAttachGestureHandler(value: (Double, Double, ActionType) => Callback): Self = StObject.set(x, "attachGestureHandler", js.Any.fromFunction3((t0: Double, t1: Double, t2: ActionType) => (value(t0, t1, t2)).runNow()))
      
      inline def setCreateGestureHandler(value: (String, Double, Record[String, Any]) => Callback): Self = StObject.set(x, "createGestureHandler", js.Any.fromFunction3((t0: String, t1: Double, t2: Record[String, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDropGestureHandler(value: Double => Callback): Self = StObject.set(x, "dropGestureHandler", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setFlushOperations(value: Callback): Self = StObject.set(x, "flushOperations", value.toJsFn)
      
      inline def setHandleClearJSResponder(value: Callback): Self = StObject.set(x, "handleClearJSResponder", value.toJsFn)
      
      inline def setHandleSetJSResponder(value: (Double, Boolean) => Callback): Self = StObject.set(x, "handleSetJSResponder", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setInstall(value: Callback): Self = StObject.set(x, "install", value.toJsFn)
      
      inline def setUpdateGestureHandler(value: (Double, Record[String, Any]) => Callback): Self = StObject.set(x, "updateGestureHandler", js.Any.fromFunction2((t0: Double, t1: Record[String, Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = RNGestureHandlerModuleProps
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptRngesturehandlermoduleMod.foo` */
  override def _to: RNGestureHandlerModuleProps = default
}
