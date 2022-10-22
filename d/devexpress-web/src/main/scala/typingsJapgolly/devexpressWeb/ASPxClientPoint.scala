package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client point object.
  */
trait ASPxClientPoint extends StObject {
  
  /**
    * Gets the point's X-coordinate.
    */
  def GetX(): Double
  
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): Double
}
object ASPxClientPoint {
  
  inline def apply(GetX: CallbackTo[Double], GetY: CallbackTo[Double]): ASPxClientPoint = {
    val __obj = js.Dynamic.literal(GetX = GetX.toJsFn, GetY = GetY.toJsFn)
    __obj.asInstanceOf[ASPxClientPoint]
  }
  
  extension [Self <: ASPxClientPoint](x: Self) {
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "GetX", value.toJsFn)
    
    inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "GetY", value.toJsFn)
  }
}
