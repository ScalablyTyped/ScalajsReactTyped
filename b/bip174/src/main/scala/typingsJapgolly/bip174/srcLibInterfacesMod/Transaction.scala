package typingsJapgolly.bip174.srcLibInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.anon.InputCount
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  def addInput(objectArg: Any): Unit
  
  def addOutput(objectArg: Any): Unit
  
  def getInputOutputCounts(): InputCount
  
  def toBuffer(): Buffer
}
object Transaction {
  
  inline def apply(
    addInput: Any => Callback,
    addOutput: Any => Callback,
    getInputOutputCounts: CallbackTo[InputCount],
    toBuffer: CallbackTo[Buffer]
  ): Transaction = {
    val __obj = js.Dynamic.literal(addInput = js.Any.fromFunction1((t0: Any) => addInput(t0).runNow()), addOutput = js.Any.fromFunction1((t0: Any) => addOutput(t0).runNow()), getInputOutputCounts = getInputOutputCounts.toJsFn, toBuffer = toBuffer.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setAddInput(value: Any => Callback): Self = StObject.set(x, "addInput", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAddOutput(value: Any => Callback): Self = StObject.set(x, "addOutput", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGetInputOutputCounts(value: CallbackTo[InputCount]): Self = StObject.set(x, "getInputOutputCounts", value.toJsFn)
    
    inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
  }
}
