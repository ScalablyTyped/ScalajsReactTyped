package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for Placement objects.
  *
  * Example usage:
  *
  *      var placementBuilder = adGroup.display().newKeywordBuilder();
  *      var placement = placementBuilder
  *        .withUrl("http://www.site.com")  // required
  *        .withCpc(0.50)                   // optional
  *        .build()                         // create the placement
  */
trait PlacementBuilder
  extends StObject
     with Builder[PlacementOperation] {
  
  /** Builds the excluded placement. */
  def exclude(): ExcludedPlacementOperation
  
  /** Sets the max CPC bid of the new placement to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new placement to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the URL of the placement. */
  def withUrl(url: String): this.type
}
object PlacementBuilder {
  
  inline def apply(
    build: CallbackTo[PlacementOperation],
    exclude: CallbackTo[ExcludedPlacementOperation],
    withCpc: Double => PlacementBuilder,
    withCpm: Double => PlacementBuilder,
    withUrl: String => PlacementBuilder
  ): PlacementBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withUrl = js.Any.fromFunction1(withUrl))
    __obj.asInstanceOf[PlacementBuilder]
  }
  
  extension [Self <: PlacementBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedPlacementOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithCpc(value: Double => PlacementBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => PlacementBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithUrl(value: String => PlacementBuilder): Self = StObject.set(x, "withUrl", js.Any.fromFunction1(value))
  }
}
