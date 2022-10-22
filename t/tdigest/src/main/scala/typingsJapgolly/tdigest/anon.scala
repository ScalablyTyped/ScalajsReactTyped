package typingsJapgolly.tdigest

import typingsJapgolly.tdigest.tdigestStrings.auto
import typingsJapgolly.tdigest.tdigestStrings.cont
import typingsJapgolly.tdigest.tdigestStrings.disc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<tdigest.tdigest.DigestConfiguration> */
  trait PartialDigestConfiguratio extends StObject {
    
    var mode: js.UndefOr[disc | cont | auto] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var thresh: js.UndefOr[Double] = js.undefined
  }
  object PartialDigestConfiguratio {
    
    inline def apply(): PartialDigestConfiguratio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDigestConfiguratio]
    }
    
    extension [Self <: PartialDigestConfiguratio](x: Self) {
      
      inline def setMode(value: disc | cont | auto): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setThresh(value: Double): Self = StObject.set(x, "thresh", value.asInstanceOf[js.Any])
      
      inline def setThreshUndefined: Self = StObject.set(x, "thresh", js.undefined)
    }
  }
}
