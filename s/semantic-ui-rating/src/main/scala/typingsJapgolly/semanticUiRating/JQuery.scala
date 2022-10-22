package typingsJapgolly.semanticUiRating

import typingsJapgolly.semanticUiRating.SemanticUI.Rating
import typingsJapgolly.semanticUiRating.SemanticUI.RatingSettings
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`get rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`set rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.destroy
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.disable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.enable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def rating(): JQuery
  def rating(settings: RatingSettings): JQuery
  @JSName("rating")
  var rating_Original: Rating
  /**
    * Clears current rating
    */
  @JSName("rating")
  def rating_clearrating(behavior: `clear rating`): JQuery
  @JSName("rating")
  def rating_destroy(behavior: destroy): JQuery
  /**
    * Disables interactive rating mode
    */
  @JSName("rating")
  def rating_disable(behavior: disable): JQuery
  /**
    * Enables interactive rating mode
    */
  @JSName("rating")
  def rating_enable(behavior: enable): JQuery
  /**
    * Gets current rating
    */
  @JSName("rating")
  def rating_getrating(behavior: `get rating`): Double
  /**
    * Sets rating programmatically
    */
  @JSName("rating")
  def rating_setrating(behavior: `set rating`, rating: Double): JQuery
  @JSName("rating")
  def rating_setting(behavior: setting, value: RatingSettings): JQuery
  @JSName("rating")
  def rating_setting[K /* <: /* keyof semantic-ui-rating.SemanticUI.RatingSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("rating")
  def rating_setting[K /* <: /* keyof semantic-ui-rating.SemanticUI.RatingSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
}
object JQuery {
  
  inline def apply(rating: Rating): JQuery = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
  }
}
