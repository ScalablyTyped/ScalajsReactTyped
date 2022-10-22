package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultPointCallback extends StObject {
  
  def foundPossibleResultPoint(point: FinderPattern): Unit
}
object ResultPointCallback {
  
  inline def apply(foundPossibleResultPoint: FinderPattern => Callback): ResultPointCallback = {
    val __obj = js.Dynamic.literal(foundPossibleResultPoint = js.Any.fromFunction1((t0: FinderPattern) => foundPossibleResultPoint(t0).runNow()))
    __obj.asInstanceOf[ResultPointCallback]
  }
  
  extension [Self <: ResultPointCallback](x: Self) {
    
    inline def setFoundPossibleResultPoint(value: FinderPattern => Callback): Self = StObject.set(x, "foundPossibleResultPoint", js.Any.fromFunction1((t0: FinderPattern) => value(t0).runNow()))
  }
}
