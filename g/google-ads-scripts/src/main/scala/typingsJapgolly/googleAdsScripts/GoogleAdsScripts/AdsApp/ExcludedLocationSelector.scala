package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded locations. Unlike other selectors, does not support filtering or sorting.
  *
  * Typical usage:
  *
  *      var locationSelector = AdsApp.targeting().excludedLocations();
  *
  *      var locationIterator = locationSelector.get();
  *      while (locationIterator.hasNext()) {
  *        var location = locationIterator.next();
  *      }
  */
trait ExcludedLocationSelector
  extends StObject
     with Selector[ExcludedLocationIterator]
     with SelectorWithLimit
object ExcludedLocationSelector {
  
  inline def apply(get: CallbackTo[ExcludedLocationIterator], withLimit: Double => ExcludedLocationSelector): ExcludedLocationSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedLocationSelector]
  }
}
