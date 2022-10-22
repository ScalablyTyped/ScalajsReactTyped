package typingsJapgolly.pseudoLocalization

import typingsJapgolly.pseudoLocalization.pseudoLocalizationStrings.accented
import typingsJapgolly.pseudoLocalization.pseudoLocalizationStrings.bidi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<pseudo-localization.pseudo-localization.PseudoLocalization.Options, 'blacklistedNodeNames'> */
  trait OmitOptionsblacklistedNod extends StObject {
    
    var strategy: js.UndefOr[accented | bidi] = js.undefined
  }
  object OmitOptionsblacklistedNod {
    
    inline def apply(): OmitOptionsblacklistedNod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptionsblacklistedNod]
    }
    
    extension [Self <: OmitOptionsblacklistedNod](x: Self) {
      
      inline def setStrategy(value: accented | bidi): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
