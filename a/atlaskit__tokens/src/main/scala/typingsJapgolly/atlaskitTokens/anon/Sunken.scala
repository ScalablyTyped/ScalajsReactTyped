package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sunken extends StObject {
  
  var `[default]`: DefaultHovered
  
  var overlay: DefaultHovered
  
  var raised: DefaultHovered
  
  var sunken: PaintToken[BaseToken]
}
object Sunken {
  
  inline def apply(
    `[default]`: DefaultHovered,
    overlay: DefaultHovered,
    raised: DefaultHovered,
    sunken: PaintToken[BaseToken]
  ): Sunken = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any], sunken = sunken.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sunken]
  }
  
  extension [Self <: Sunken](x: Self) {
    
    inline def setOverlay(value: DefaultHovered): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: DefaultHovered): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setSunken(value: PaintToken[BaseToken]): Self = StObject.set(x, "sunken", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultHovered): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
