package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViterbiLattice extends StObject {
  
  def append(node: ViterbiNode): Unit
  
  def appendEos(): Unit
}
object ViterbiLattice {
  
  inline def apply(append: ViterbiNode => Callback, appendEos: Callback): ViterbiLattice = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: ViterbiNode) => append(t0).runNow()), appendEos = appendEos.toJsFn)
    __obj.asInstanceOf[ViterbiLattice]
  }
  
  extension [Self <: ViterbiLattice](x: Self) {
    
    inline def setAppend(value: ViterbiNode => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: ViterbiNode) => value(t0).runNow()))
    
    inline def setAppendEos(value: Callback): Self = StObject.set(x, "appendEos", value.toJsFn)
  }
}
