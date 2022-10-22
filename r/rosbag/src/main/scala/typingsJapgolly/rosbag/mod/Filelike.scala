package typingsJapgolly.rosbag.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filelike extends StObject {
  
  /**
    * Reads buffer at specified offset and length then pass it on to callback function.
    * @param offset - The location in the buffer at which to start.
    * @param length - The number of bytes to read.
    * @param callback - Callback function accepting Buffer object.
    */
  def read(offset: Double, length: Double, callback: Callback[Buffer]): Unit
  
  /**
    * Getter method to retrieve file size.
    */
  def size(): Double
}
object Filelike {
  
  inline def apply(
    read: (Double, Double, Callback[Buffer]) => japgolly.scalajs.react.Callback,
    size: CallbackTo[Double]
  ): Filelike = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction3((t0: Double, t1: Double, t2: Callback[Buffer]) => (read(t0, t1, t2)).runNow()), size = size.toJsFn)
    __obj.asInstanceOf[Filelike]
  }
  
  extension [Self <: Filelike](x: Self) {
    
    inline def setRead(value: (Double, Double, Callback[Buffer]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "read", js.Any.fromFunction3((t0: Double, t1: Double, t2: Callback[Buffer]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
  }
}
