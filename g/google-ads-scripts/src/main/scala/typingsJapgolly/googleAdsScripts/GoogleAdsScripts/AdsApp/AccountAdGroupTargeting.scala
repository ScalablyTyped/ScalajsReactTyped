package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to ad group-level targeting criteria (currently just audiences). */
trait AccountAdGroupTargeting extends StObject {
  
  /** Specializes this selector to return SearchAdGroupAudience criteria. */
  def audiences(): SearchAdGroupAudienceSelector
  
  /** Specializes this selector to return SearchAdGroupExcludedAudience criteria. */
  def excludedAudiences(): SearchAdGroupExcludedAudienceSelector
}
object AccountAdGroupTargeting {
  
  inline def apply(
    audiences: CallbackTo[SearchAdGroupAudienceSelector],
    excludedAudiences: CallbackTo[SearchAdGroupExcludedAudienceSelector]
  ): AccountAdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, excludedAudiences = excludedAudiences.toJsFn)
    __obj.asInstanceOf[AccountAdGroupTargeting]
  }
  
  extension [Self <: AccountAdGroupTargeting](x: Self) {
    
    inline def setAudiences(value: CallbackTo[SearchAdGroupAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedAudiences(value: CallbackTo[SearchAdGroupExcludedAudienceSelector]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
  }
}
