package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a negative keyword list under construction.
  *
  * Typical usage:
  *
  *      var negativeKeywordListOperation =
  *          AdsApp.newNegativeKeywordListBuilder()
  *              .withName("NegativeKeywordList")
  *              .build();
  *
  *      var negativeKeywordList = negativeKeywordListOperation.getResult();
  */
trait NegativeKeywordListBuilder
  extends StObject
     with Builder[NegativeKeywordListOperation] {
  
  /** Sets the name of the new negative keyword list to the specified value. */
  def withName(name: String): this.type
}
object NegativeKeywordListBuilder {
  
  inline def apply(build: CallbackTo[NegativeKeywordListOperation], withName: String => NegativeKeywordListBuilder): NegativeKeywordListBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[NegativeKeywordListBuilder]
  }
  
  extension [Self <: NegativeKeywordListBuilder](x: Self) {
    
    inline def setWithName(value: String => NegativeKeywordListBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
