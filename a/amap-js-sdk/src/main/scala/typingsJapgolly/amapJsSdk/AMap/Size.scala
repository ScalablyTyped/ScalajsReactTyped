package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地物对象的像素尺寸
  */
trait Size extends StObject {
  
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
  
  inline def apply(getHeight: CallbackTo[Double], getWidth: CallbackTo[Double]): Size = {
    val __obj = js.Dynamic.literal(getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn)
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
  }
}
