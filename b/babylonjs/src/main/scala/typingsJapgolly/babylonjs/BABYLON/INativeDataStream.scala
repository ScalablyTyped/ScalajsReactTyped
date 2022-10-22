package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INativeDataStream extends StObject {
  
  def writeBuffer(buffer: js.typedarray.ArrayBuffer, length: Double): Unit
}
object INativeDataStream {
  
  inline def apply(writeBuffer: (js.typedarray.ArrayBuffer, Double) => Callback): INativeDataStream = {
    val __obj = js.Dynamic.literal(writeBuffer = js.Any.fromFunction2((t0: js.typedarray.ArrayBuffer, t1: Double) => (writeBuffer(t0, t1)).runNow()))
    __obj.asInstanceOf[INativeDataStream]
  }
  
  extension [Self <: INativeDataStream](x: Self) {
    
    inline def setWriteBuffer(value: (js.typedarray.ArrayBuffer, Double) => Callback): Self = StObject.set(x, "writeBuffer", js.Any.fromFunction2((t0: js.typedarray.ArrayBuffer, t1: Double) => (value(t0, t1)).runNow()))
  }
}
