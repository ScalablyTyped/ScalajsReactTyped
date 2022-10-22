package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color defined by red, green, blue color channels.
  */
trait RgbColor extends StObject {
  
  def asHexString(): String
  
  def getBlue(): Integer
  
  def getColorType(): ColorType
  
  def getGreen(): Integer
  
  def getRed(): Integer
}
object RgbColor {
  
  inline def apply(
    asHexString: CallbackTo[String],
    getBlue: CallbackTo[Integer],
    getColorType: CallbackTo[ColorType],
    getGreen: CallbackTo[Integer],
    getRed: CallbackTo[Integer]
  ): RgbColor = {
    val __obj = js.Dynamic.literal(asHexString = asHexString.toJsFn, getBlue = getBlue.toJsFn, getColorType = getColorType.toJsFn, getGreen = getGreen.toJsFn, getRed = getRed.toJsFn)
    __obj.asInstanceOf[RgbColor]
  }
  
  extension [Self <: RgbColor](x: Self) {
    
    inline def setAsHexString(value: CallbackTo[String]): Self = StObject.set(x, "asHexString", value.toJsFn)
    
    inline def setGetBlue(value: CallbackTo[Integer]): Self = StObject.set(x, "getBlue", value.toJsFn)
    
    inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
    
    inline def setGetGreen(value: CallbackTo[Integer]): Self = StObject.set(x, "getGreen", value.toJsFn)
    
    inline def setGetRed(value: CallbackTo[Integer]): Self = StObject.set(x, "getRed", value.toJsFn)
  }
}
