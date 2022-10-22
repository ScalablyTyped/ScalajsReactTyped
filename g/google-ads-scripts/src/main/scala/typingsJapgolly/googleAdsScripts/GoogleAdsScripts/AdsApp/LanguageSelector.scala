package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches languages. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var languageSelector = campaign.targeting()
  *          .languages()
  *          .withCondition("Impressions > 100")
  *          .orderBy("Clicks DESC");
  *
  *      var languageIterator = languageSelector.get();
  *      while (languageIterator.hasNext()) {
  *        var language = languageIterator.next();
  *      }
  */
trait LanguageSelector
  extends StObject
     with Selector[LanguageIterator]
     with SelectorWithIds
     with SelectorWithLimit
object LanguageSelector {
  
  inline def apply(
    get: CallbackTo[LanguageIterator],
    withIds: js.Array[Double] => LanguageSelector,
    withLimit: Double => LanguageSelector
  ): LanguageSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[LanguageSelector]
  }
}
