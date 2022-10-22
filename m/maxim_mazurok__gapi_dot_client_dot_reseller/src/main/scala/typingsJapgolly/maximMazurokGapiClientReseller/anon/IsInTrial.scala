package typingsJapgolly.maximMazurokGapiClientReseller.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInTrial extends StObject {
  
  /** Determines if a subscription's plan is in a 30-day free trial or not: - `true` — The plan is in trial. - `false` — The plan is not in trial. */
  var isInTrial: js.UndefOr[Boolean] = js.undefined
  
  /** Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var trialEndTime: js.UndefOr[String] = js.undefined
}
object IsInTrial {
  
  inline def apply(): IsInTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsInTrial]
  }
  
  extension [Self <: IsInTrial](x: Self) {
    
    inline def setIsInTrial(value: Boolean): Self = StObject.set(x, "isInTrial", value.asInstanceOf[js.Any])
    
    inline def setIsInTrialUndefined: Self = StObject.set(x, "isInTrial", js.undefined)
    
    inline def setTrialEndTime(value: String): Self = StObject.set(x, "trialEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrialEndTimeUndefined: Self = StObject.set(x, "trialEndTime", js.undefined)
  }
}
