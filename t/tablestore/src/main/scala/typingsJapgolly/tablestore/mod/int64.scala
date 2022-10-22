package typingsJapgolly.tablestore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait int64 extends StObject {
  
  def toBuffer(): Buffer
  
  def toNumber(): Double
}
object int64 {
  
  inline def apply(toBuffer: CallbackTo[Buffer], toNumber: CallbackTo[Double]): int64 = {
    val __obj = js.Dynamic.literal(toBuffer = toBuffer.toJsFn, toNumber = toNumber.toJsFn)
    __obj.asInstanceOf[int64]
  }
  
  extension [Self <: int64](x: Self) {
    
    inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
    
    inline def setToNumber(value: CallbackTo[Double]): Self = StObject.set(x, "toNumber", value.toJsFn)
  }
}
