package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client rectangle object.
  */
trait ASPxClientRect extends StObject {
  
  /**
    * Gets the Y-coordinate of the rectangle's bottom edge.
    */
  def GetBottom(): Double
  
  /**
    * Gets the rectangle's height.
    */
  def GetHeight(): Double
  
  /**
    * Gets the X-coordinate of the rectangle's left edge.
    */
  def GetLeft(): Double
  
  /**
    * Gets the X-coordinate of the rectangle's right edge.
    */
  def GetRight(): Double
  
  /**
    * Gets the Y-coordinate of the rectangle's top edge.
    */
  def GetTop(): Double
  
  /**
    * Gets the rectangle's width.
    */
  def GetWidth(): Double
}
object ASPxClientRect {
  
  inline def apply(
    GetBottom: CallbackTo[Double],
    GetHeight: CallbackTo[Double],
    GetLeft: CallbackTo[Double],
    GetRight: CallbackTo[Double],
    GetTop: CallbackTo[Double],
    GetWidth: CallbackTo[Double]
  ): ASPxClientRect = {
    val __obj = js.Dynamic.literal(GetBottom = GetBottom.toJsFn, GetHeight = GetHeight.toJsFn, GetLeft = GetLeft.toJsFn, GetRight = GetRight.toJsFn, GetTop = GetTop.toJsFn, GetWidth = GetWidth.toJsFn)
    __obj.asInstanceOf[ASPxClientRect]
  }
  
  extension [Self <: ASPxClientRect](x: Self) {
    
    inline def setGetBottom(value: CallbackTo[Double]): Self = StObject.set(x, "GetBottom", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "GetHeight", value.toJsFn)
    
    inline def setGetLeft(value: CallbackTo[Double]): Self = StObject.set(x, "GetLeft", value.toJsFn)
    
    inline def setGetRight(value: CallbackTo[Double]): Self = StObject.set(x, "GetRight", value.toJsFn)
    
    inline def setGetTop(value: CallbackTo[Double]): Self = StObject.set(x, "GetTop", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "GetWidth", value.toJsFn)
  }
}
