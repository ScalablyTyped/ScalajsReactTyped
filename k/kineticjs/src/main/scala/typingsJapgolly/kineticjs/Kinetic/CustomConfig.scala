package typingsJapgolly.kineticjs.Kinetic

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  def drawFunc(): Any
}
object CustomConfig {
  
  inline def apply(drawFunc: CallbackTo[Any]): CustomConfig = {
    val __obj = js.Dynamic.literal(drawFunc = drawFunc.toJsFn)
    __obj.asInstanceOf[CustomConfig]
  }
  
  extension [Self <: CustomConfig](x: Self) {
    
    inline def setDrawFunc(value: CallbackTo[Any]): Self = StObject.set(x, "drawFunc", value.toJsFn)
  }
}
