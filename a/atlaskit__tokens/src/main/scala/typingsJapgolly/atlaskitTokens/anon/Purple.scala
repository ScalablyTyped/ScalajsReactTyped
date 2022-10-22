package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Purple extends StObject {
  
  var blue: PaintToken[BaseToken]
  
  var gray: PaintToken[BaseToken]
  
  var green: PaintToken[BaseToken]
  
  var magenta: PaintToken[BaseToken]
  
  var orange: PaintToken[BaseToken]
  
  var purple: PaintToken[BaseToken]
  
  var red: PaintToken[BaseToken]
  
  var teal: PaintToken[BaseToken]
  
  var yellow: PaintToken[BaseToken]
}
object Purple {
  
  inline def apply(
    blue: PaintToken[BaseToken],
    gray: PaintToken[BaseToken],
    green: PaintToken[BaseToken],
    magenta: PaintToken[BaseToken],
    orange: PaintToken[BaseToken],
    purple: PaintToken[BaseToken],
    red: PaintToken[BaseToken],
    teal: PaintToken[BaseToken],
    yellow: PaintToken[BaseToken]
  ): Purple = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purple]
  }
  
  extension [Self <: Purple](x: Self) {
    
    inline def setBlue(value: PaintToken[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGray(value: PaintToken[BaseToken]): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: PaintToken[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: PaintToken[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: PaintToken[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: PaintToken[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: PaintToken[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: PaintToken[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: PaintToken[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
