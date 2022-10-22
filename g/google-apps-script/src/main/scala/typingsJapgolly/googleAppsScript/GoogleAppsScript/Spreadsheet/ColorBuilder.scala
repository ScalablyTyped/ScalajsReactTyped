package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for ColorBuilder. To create a new builder, use SpreadsheetApp.newColor().
  */
trait ColorBuilder extends StObject {
  
  def asRgbColor(): RgbColor
  
  def asThemeColor(): ThemeColor
  
  def build(): Color
  
  def getColorType(): ColorType
  
  def setRgbColor(cssString: String): ColorBuilder
  
  def setThemeColor(themeColorType: ThemeColorType): ColorBuilder
}
object ColorBuilder {
  
  inline def apply(
    asRgbColor: CallbackTo[RgbColor],
    asThemeColor: CallbackTo[ThemeColor],
    build: CallbackTo[Color],
    getColorType: CallbackTo[ColorType],
    setRgbColor: String => ColorBuilder,
    setThemeColor: ThemeColorType => ColorBuilder
  ): ColorBuilder = {
    val __obj = js.Dynamic.literal(asRgbColor = asRgbColor.toJsFn, asThemeColor = asThemeColor.toJsFn, build = build.toJsFn, getColorType = getColorType.toJsFn, setRgbColor = js.Any.fromFunction1(setRgbColor), setThemeColor = js.Any.fromFunction1(setThemeColor))
    __obj.asInstanceOf[ColorBuilder]
  }
  
  extension [Self <: ColorBuilder](x: Self) {
    
    inline def setAsRgbColor(value: CallbackTo[RgbColor]): Self = StObject.set(x, "asRgbColor", value.toJsFn)
    
    inline def setAsThemeColor(value: CallbackTo[ThemeColor]): Self = StObject.set(x, "asThemeColor", value.toJsFn)
    
    inline def setBuild(value: CallbackTo[Color]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
    
    inline def setSetRgbColor(value: String => ColorBuilder): Self = StObject.set(x, "setRgbColor", js.Any.fromFunction1(value))
    
    inline def setSetThemeColor(value: ThemeColorType => ColorBuilder): Self = StObject.set(x, "setThemeColor", js.Any.fromFunction1(value))
  }
}
