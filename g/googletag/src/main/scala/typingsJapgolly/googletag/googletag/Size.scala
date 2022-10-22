package typingsJapgolly.googletag.googletag

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  def getHeight(): Double
  
  def getWidth(): Double
  
  var height: Double
  
  var width: Double
}
object Size {
  
  inline def apply(getHeight: CallbackTo[Double], getWidth: CallbackTo[Double], height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn, height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
