package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverse extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var inverse: PaintToken[BaseToken]
}
object Inverse {
  
  inline def apply(`[default]`: PaintToken[BaseToken], inverse: PaintToken[BaseToken]): Inverse = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverse]
  }
  
  extension [Self <: Inverse](x: Self) {
    
    inline def setInverse(value: PaintToken[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
