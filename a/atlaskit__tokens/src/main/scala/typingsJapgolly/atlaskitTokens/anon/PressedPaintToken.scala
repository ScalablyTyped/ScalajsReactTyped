package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressedPaintToken extends StObject {
  
  var hover: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object PressedPaintToken {
  
  inline def apply(hover: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): PressedPaintToken = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressedPaintToken]
  }
  
  extension [Self <: PressedPaintToken](x: Self) {
    
    inline def setHover(value: PaintToken[BaseToken]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
  }
}
