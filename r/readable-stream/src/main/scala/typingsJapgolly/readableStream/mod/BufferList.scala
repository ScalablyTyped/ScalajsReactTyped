package typingsJapgolly.readableStream.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.safeBuffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferList[D /* <: Buffer */] extends StObject {
  
  def clear(): Unit
  
  def concat(n: Double): D
  
  var head: Entry[D]
  
  def join(s: Any): String
  
  var length: Double
  
  def push(v: D): Unit
  
  def shift(): D
  
  var tail: Entry[D]
  
  def unshift(v: D): Unit
}
object BufferList {
  
  inline def apply[D /* <: Buffer */](
    clear: Callback,
    concat: Double => D,
    head: Entry[D],
    join: Any => String,
    length: Double,
    push: D => Callback,
    shift: CallbackTo[D],
    tail: Entry[D],
    unshift: D => Callback
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, concat = js.Any.fromFunction1(concat), head = head.asInstanceOf[js.Any], join = js.Any.fromFunction1(join), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1((t0: D) => push(t0).runNow()), shift = shift.toJsFn, tail = tail.asInstanceOf[js.Any], unshift = js.Any.fromFunction1((t0: D) => unshift(t0).runNow()))
    __obj.asInstanceOf[BufferList[D]]
  }
  
  extension [Self <: BufferList[?], D /* <: Buffer */](x: Self & BufferList[D]) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setConcat(value: Double => D): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setHead(value: Entry[D]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: Any => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPush(value: D => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: D) => value(t0).runNow()))
    
    inline def setShift(value: CallbackTo[D]): Self = StObject.set(x, "shift", value.toJsFn)
    
    inline def setTail(value: Entry[D]): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setUnshift(value: D => Callback): Self = StObject.set(x, "unshift", js.Any.fromFunction1((t0: D) => value(t0).runNow()))
  }
}
