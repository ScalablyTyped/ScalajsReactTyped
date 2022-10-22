package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]
  extends StObject
     with AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  
  def getTargetingSetting(): String
  
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit
}
object AdGroupTargeting {
  
  inline def apply[SearchAdGroupAudience, SearchAdGroupExcludedAudience](
    audiences: CallbackTo[AdWordsSelector[SearchAdGroupAudience]],
    exculdedAudiences: CallbackTo[AdWordsSelector[SearchAdGroupExcludedAudience]],
    getTargetingSetting: CallbackTo[String],
    newUserListBuilder: CallbackTo[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Callback
  ): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, exculdedAudiences = exculdedAudiences.toJsFn, getTargetingSetting = getTargetingSetting.toJsFn, newUserListBuilder = newUserListBuilder.toJsFn, setTargetingSetting = js.Any.fromFunction2((t0: CriterionTypeGroup, t1: TargetingSetting) => (setTargetingSetting(t0, t1)).runNow()))
    __obj.asInstanceOf[AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
  }
  
  extension [Self <: AdGroupTargeting[?, ?], SearchAdGroupAudience, SearchAdGroupExcludedAudience](x: Self & (AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience])) {
    
    inline def setGetTargetingSetting(value: CallbackTo[String]): Self = StObject.set(x, "getTargetingSetting", value.toJsFn)
    
    inline def setNewUserListBuilder(value: CallbackTo[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]): Self = StObject.set(x, "newUserListBuilder", value.toJsFn)
    
    inline def setSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Callback): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2((t0: CriterionTypeGroup, t1: TargetingSetting) => (value(t0, t1)).runNow()))
  }
}
