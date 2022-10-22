package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to ad group-level targeting criteria: audiences. */
trait AdGroupTargeting extends StObject {
  
  /** Specializes this selector to return SearchAdGroupAudience criteria. */
  def audiences(): SearchAdGroupAudienceSelector
  
  /** Specializes this selector to return SearchAdGroupExcludedAudience criteria. */
  def excludedAudiences(): SearchAdGroupExcludedAudienceSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this ad group. */
  def getTargetingSetting(): String
  
  /** Returns a new user list builder for this ad group. */
  def newUserListBuilder(): SearchAdGroupAudienceBuilder
  
  /** Sets the targeting setting for this ad group. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
}
object AdGroupTargeting {
  
  inline def apply(
    audiences: CallbackTo[SearchAdGroupAudienceSelector],
    excludedAudiences: CallbackTo[SearchAdGroupExcludedAudienceSelector],
    getTargetingSetting: CallbackTo[String],
    newUserListBuilder: CallbackTo[SearchAdGroupAudienceBuilder],
    setTargetingSetting: (String, String) => Callback
  ): AdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, excludedAudiences = excludedAudiences.toJsFn, getTargetingSetting = getTargetingSetting.toJsFn, newUserListBuilder = newUserListBuilder.toJsFn, setTargetingSetting = js.Any.fromFunction2((t0: String, t1: String) => (setTargetingSetting(t0, t1)).runNow()))
    __obj.asInstanceOf[AdGroupTargeting]
  }
  
  extension [Self <: AdGroupTargeting](x: Self) {
    
    inline def setAudiences(value: CallbackTo[SearchAdGroupAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedAudiences(value: CallbackTo[SearchAdGroupExcludedAudienceSelector]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
    
    inline def setGetTargetingSetting(value: CallbackTo[String]): Self = StObject.set(x, "getTargetingSetting", value.toJsFn)
    
    inline def setNewUserListBuilder(value: CallbackTo[SearchAdGroupAudienceBuilder]): Self = StObject.set(x, "newUserListBuilder", value.toJsFn)
    
    inline def setSetTargetingSetting(value: (String, String) => Callback): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
