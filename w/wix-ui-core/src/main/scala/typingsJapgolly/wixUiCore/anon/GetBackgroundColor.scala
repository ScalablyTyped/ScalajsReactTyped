package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundColor extends StObject {
  
  def getBackgroundColor(): String
  
  def getBorderColor(): String
  
  def getBorderRadius(): String
  
  def getBorderStyle(): String
  
  def getBorderWidth(): String
  
  def getContentPadding(): String
}
object GetBackgroundColor {
  
  inline def apply(
    getBackgroundColor: CallbackTo[String],
    getBorderColor: CallbackTo[String],
    getBorderRadius: CallbackTo[String],
    getBorderStyle: CallbackTo[String],
    getBorderWidth: CallbackTo[String],
    getContentPadding: CallbackTo[String]
  ): GetBackgroundColor = {
    val __obj = js.Dynamic.literal(getBackgroundColor = getBackgroundColor.toJsFn, getBorderColor = getBorderColor.toJsFn, getBorderRadius = getBorderRadius.toJsFn, getBorderStyle = getBorderStyle.toJsFn, getBorderWidth = getBorderWidth.toJsFn, getContentPadding = getContentPadding.toJsFn)
    __obj.asInstanceOf[GetBackgroundColor]
  }
  
  extension [Self <: GetBackgroundColor](x: Self) {
    
    inline def setGetBackgroundColor(value: CallbackTo[String]): Self = StObject.set(x, "getBackgroundColor", value.toJsFn)
    
    inline def setGetBorderColor(value: CallbackTo[String]): Self = StObject.set(x, "getBorderColor", value.toJsFn)
    
    inline def setGetBorderRadius(value: CallbackTo[String]): Self = StObject.set(x, "getBorderRadius", value.toJsFn)
    
    inline def setGetBorderStyle(value: CallbackTo[String]): Self = StObject.set(x, "getBorderStyle", value.toJsFn)
    
    inline def setGetBorderWidth(value: CallbackTo[String]): Self = StObject.set(x, "getBorderWidth", value.toJsFn)
    
    inline def setGetContentPadding(value: CallbackTo[String]): Self = StObject.set(x, "getContentPadding", value.toJsFn)
  }
}
