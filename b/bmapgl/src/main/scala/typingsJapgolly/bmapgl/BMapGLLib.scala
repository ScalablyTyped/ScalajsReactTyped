package typingsJapgolly.bmapgl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bmapgl.BMapGL.DrawingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BMapGLLib {
  
  @js.native
  trait Callback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait DistanceTool extends StObject {
    
    def addEventListener(event: String, handler: Callback): Unit
    
    def close(): Unit
    
    def open(): Unit
    
    def removeEventListener(event: String, handler: Callback): Unit
  }
  object DistanceTool {
    
    inline def apply(
      addEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
      close: japgolly.scalajs.react.Callback,
      open: japgolly.scalajs.react.Callback,
      removeEventListener: (String, Callback) => japgolly.scalajs.react.Callback
    ): DistanceTool = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (addEventListener(t0, t1)).runNow()), close = close.toJsFn, open = open.toJsFn, removeEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (removeEventListener(t0, t1)).runNow()))
      __obj.asInstanceOf[DistanceTool]
    }
    
    extension [Self <: DistanceTool](x: Self) {
      
      inline def setAddEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
      
      inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOpen(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setRemoveEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    }
  }
  
  trait DrawingManager extends StObject {
    
    def addEventListener(event: String, handler: Callback): Unit
    
    def close(): Unit
    
    def disableCalculate(): Unit
    
    def enableCalculate(): Unit
    
    def getDrawingMode(): DrawingType
    
    def open(): Unit
    
    def removeEventListener(event: String, handler: Callback): Unit
    
    def setDrawingMode(drawingType: DrawingType): Unit
  }
  object DrawingManager {
    
    inline def apply(
      addEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
      close: japgolly.scalajs.react.Callback,
      disableCalculate: japgolly.scalajs.react.Callback,
      enableCalculate: japgolly.scalajs.react.Callback,
      getDrawingMode: CallbackTo[DrawingType],
      open: japgolly.scalajs.react.Callback,
      removeEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
      setDrawingMode: DrawingType => japgolly.scalajs.react.Callback
    ): DrawingManager = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (addEventListener(t0, t1)).runNow()), close = close.toJsFn, disableCalculate = disableCalculate.toJsFn, enableCalculate = enableCalculate.toJsFn, getDrawingMode = getDrawingMode.toJsFn, open = open.toJsFn, removeEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (removeEventListener(t0, t1)).runNow()), setDrawingMode = js.Any.fromFunction1((t0: DrawingType) => setDrawingMode(t0).runNow()))
      __obj.asInstanceOf[DrawingManager]
    }
    
    extension [Self <: DrawingManager](x: Self) {
      
      inline def setAddEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
      
      inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDisableCalculate(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disableCalculate", value.toJsFn)
      
      inline def setEnableCalculate(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "enableCalculate", value.toJsFn)
      
      inline def setGetDrawingMode(value: CallbackTo[DrawingType]): Self = StObject.set(x, "getDrawingMode", value.toJsFn)
      
      inline def setOpen(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setRemoveEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
      
      inline def setSetDrawingMode(value: DrawingType => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setDrawingMode", js.Any.fromFunction1((t0: DrawingType) => value(t0).runNow()))
    }
  }
}
