package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation for a color.
  */
trait Color extends StObject {
  
  def asRgbColor(): RgbColor
  
  def asThemeColor(): ThemeColor
  
  def getColorType(): ColorType
}
object Color {
  
  inline def apply(
    asRgbColor: CallbackTo[RgbColor],
    asThemeColor: CallbackTo[ThemeColor],
    getColorType: CallbackTo[ColorType]
  ): Color = {
    val __obj = js.Dynamic.literal(asRgbColor = asRgbColor.toJsFn, asThemeColor = asThemeColor.toJsFn, getColorType = getColorType.toJsFn)
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setAsRgbColor(value: CallbackTo[RgbColor]): Self = StObject.set(x, "asRgbColor", value.toJsFn)
    
    inline def setAsThemeColor(value: CallbackTo[ThemeColor]): Self = StObject.set(x, "asThemeColor", value.toJsFn)
    
    inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
  }
}
