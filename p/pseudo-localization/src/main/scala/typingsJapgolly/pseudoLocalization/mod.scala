package typingsJapgolly.pseudoLocalization

import typingsJapgolly.pseudoLocalization.anon.OmitOptionsblacklistedNod
import typingsJapgolly.pseudoLocalization.mod.PseudoLocalization.Localize
import typingsJapgolly.pseudoLocalization.mod.PseudoLocalization.Start
import typingsJapgolly.pseudoLocalization.mod.PseudoLocalization.Stop
import typingsJapgolly.pseudoLocalization.pseudoLocalizationStrings.accented
import typingsJapgolly.pseudoLocalization.pseudoLocalizationStrings.bidi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pseudo-localization", "localize")
  @js.native
  val localize: Localize = js.native
  
  @JSImport("pseudo-localization", "start")
  @js.native
  val start: Start = js.native
  
  @JSImport("pseudo-localization", "stop")
  @js.native
  val stop: Stop = js.native
  
  object PseudoLocalization {
    
    type Localize = js.Function2[
        /* inputString */ String, 
        /* options */ js.UndefOr[OmitOptionsblacklistedNod], 
        String
      ]
    
    trait Options extends StObject {
      
      var blacklistedNodeNames: js.UndefOr[js.Array[String]] = js.undefined
      
      var strategy: js.UndefOr[accented | bidi] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBlacklistedNodeNames(value: js.Array[String]): Self = StObject.set(x, "blacklistedNodeNames", value.asInstanceOf[js.Any])
        
        inline def setBlacklistedNodeNamesUndefined: Self = StObject.set(x, "blacklistedNodeNames", js.undefined)
        
        inline def setBlacklistedNodeNamesVarargs(value: String*): Self = StObject.set(x, "blacklistedNodeNames", js.Array(value*))
        
        inline def setStrategy(value: accented | bidi): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      }
    }
    
    type Start = js.Function1[/* options */ js.UndefOr[Options], Unit]
    
    type Stop = js.Function0[Unit]
  }
}
