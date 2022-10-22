package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation for a theme color.
  */
trait ThemeColor extends StObject {
  
  def getColorType(): ColorType
  
  def getThemeColorType(): ThemeColorType
}
object ThemeColor {
  
  inline def apply(getColorType: CallbackTo[ColorType], getThemeColorType: CallbackTo[ThemeColorType]): ThemeColor = {
    val __obj = js.Dynamic.literal(getColorType = getColorType.toJsFn, getThemeColorType = getThemeColorType.toJsFn)
    __obj.asInstanceOf[ThemeColor]
  }
  
  extension [Self <: ThemeColor](x: Self) {
    
    inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
    
    inline def setGetThemeColorType(value: CallbackTo[ThemeColorType]): Self = StObject.set(x, "getThemeColorType", value.toJsFn)
  }
}
