package typingsJapgolly.amapJsApi.AMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.amapJsApi.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  // internal
  def contains(size: X): Boolean
  
  /**
    * 获得高度
    */
  def getHeight(): Double
  
  /**
    * 获得宽度
    */
  def getWidth(): Double
}
object Size {
  
  inline def apply(contains: X => Boolean, getHeight: CallbackTo[Double], getWidth: CallbackTo[Double]): Size = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn)
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setContains(value: X => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
  }
}
