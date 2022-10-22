package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBorderRadius extends StObject {
  
  /** returns elements border-radius css property */
  def getBorderRadius(): String
  
  /** returns elements height css property */
  def getHeight(): String
  
  /** returns elements min-width css property */
  def getMinWidth(): String
  
  /** returns elements padding css property */
  def getPadding(): String
  
  /** returns elements width css property */
  def getWidth(): String
}
object GetBorderRadius {
  
  inline def apply(
    getBorderRadius: CallbackTo[String],
    getHeight: CallbackTo[String],
    getMinWidth: CallbackTo[String],
    getPadding: CallbackTo[String],
    getWidth: CallbackTo[String]
  ): GetBorderRadius = {
    val __obj = js.Dynamic.literal(getBorderRadius = getBorderRadius.toJsFn, getHeight = getHeight.toJsFn, getMinWidth = getMinWidth.toJsFn, getPadding = getPadding.toJsFn, getWidth = getWidth.toJsFn)
    __obj.asInstanceOf[GetBorderRadius]
  }
  
  extension [Self <: GetBorderRadius](x: Self) {
    
    inline def setGetBorderRadius(value: CallbackTo[String]): Self = StObject.set(x, "getBorderRadius", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[String]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetMinWidth(value: CallbackTo[String]): Self = StObject.set(x, "getMinWidth", value.toJsFn)
    
    inline def setGetPadding(value: CallbackTo[String]): Self = StObject.set(x, "getPadding", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[String]): Self = StObject.set(x, "getWidth", value.toJsFn)
  }
}
