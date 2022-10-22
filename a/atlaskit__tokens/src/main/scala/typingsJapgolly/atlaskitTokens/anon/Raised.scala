package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raised extends StObject {
  
  var overflow: ShadowToken[BaseToken]
  
  var overlay: ShadowToken[BaseToken]
  
  var raised: ShadowToken[BaseToken]
}
object Raised {
  
  inline def apply(overflow: ShadowToken[BaseToken], overlay: ShadowToken[BaseToken], raised: ShadowToken[BaseToken]): Raised = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raised]
  }
  
  extension [Self <: Raised](x: Self) {
    
    inline def setOverflow(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: ShadowToken[BaseToken]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
  }
}
