package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder used to create TextStyle objects. It allows configuration of the text's
  * properties such as name, color, and size.
  *
  * The following example shows how to create a text style using the builder. For a more complete
  * example, refer to the documentation for TextStyle.
  *
  *     // Creates a new text style that uses 26-point, blue, Ariel font.
  *     var textStyleBuilder = Charts.newTextStyle()
  *         .setColor('#0000FF').setFontName('Ariel').setFontSize(26);
  *     var style = textStyleBuilder.build();
  */
trait TextStyleBuilder extends StObject {
  
  def build(): TextStyle
  
  def setColor(cssValue: String): TextStyleBuilder
  
  def setFontName(fontName: String): TextStyleBuilder
  
  def setFontSize(fontSize: Double): TextStyleBuilder
}
object TextStyleBuilder {
  
  inline def apply(
    build: CallbackTo[TextStyle],
    setColor: String => TextStyleBuilder,
    setFontName: String => TextStyleBuilder,
    setFontSize: Double => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, setColor = js.Any.fromFunction1(setColor), setFontName = js.Any.fromFunction1(setFontName), setFontSize = js.Any.fromFunction1(setFontSize))
    __obj.asInstanceOf[TextStyleBuilder]
  }
  
  extension [Self <: TextStyleBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[TextStyle]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetColor(value: String => TextStyleBuilder): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    inline def setSetFontName(value: String => TextStyleBuilder): Self = StObject.set(x, "setFontName", js.Any.fromFunction1(value))
    
    inline def setSetFontSize(value: Double => TextStyleBuilder): Self = StObject.set(x, "setFontSize", js.Any.fromFunction1(value))
  }
}
