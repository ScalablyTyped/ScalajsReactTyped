package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomShapes extends StObject {
  
  def init(sigma: Sigma): Unit
}
object CustomShapes {
  
  inline def apply(init: Sigma => Callback): CustomShapes = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: Sigma) => init(t0).runNow()))
    __obj.asInstanceOf[CustomShapes]
  }
  
  extension [Self <: CustomShapes](x: Self) {
    
    inline def setInit(value: Sigma => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Sigma) => value(t0).runNow()))
  }
}
