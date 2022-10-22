package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bolder extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var bolder: PaintToken[BaseToken]
}
object Bolder {
  
  inline def apply(`[default]`: PaintToken[BaseToken], bolder: PaintToken[BaseToken]): Bolder = {
    val __obj = js.Dynamic.literal(bolder = bolder.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bolder]
  }
  
  extension [Self <: Bolder](x: Self) {
    
    inline def setBolder(value: PaintToken[BaseToken]): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
