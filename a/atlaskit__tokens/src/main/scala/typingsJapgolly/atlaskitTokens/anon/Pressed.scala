package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pressed extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object Pressed {
  
  inline def apply(`[default]`: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): Pressed = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pressed]
  }
  
  extension [Self <: Pressed](x: Self) {
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
