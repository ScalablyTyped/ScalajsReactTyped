package typingsJapgolly.semanticUiRating

import typingsJapgolly.semanticUiRating.SemanticUI.Rating
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typingsJapgolly.semanticUiRating.SemanticUI.RatingSettings
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`get rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.`set rating`
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.auto
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.className
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.clearable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.debug
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.destroy
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.disable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.enable
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.error
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.fireOnInit
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.initialRating
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.interactive
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.name
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.namespace
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.onRate
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.performance
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.selector
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.setting
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.silent
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("rating")
  var rating_Original: Rating = js.native
  def rating(): JQuery = js.native
  def rating(behavior: setting, name: className): ClassNameSettings = js.native
  def rating(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def rating(behavior: setting, name: clearable): auto | Boolean = js.native
  def rating(behavior: setting, name: clearable, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: clearable, value: auto): JQuery = js.native
  def rating(behavior: setting, name: debug): Boolean = js.native
  def rating(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: error): ErrorSettings = js.native
  def rating(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def rating(behavior: setting, name: fireOnInit): Boolean = js.native
  def rating(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: initialRating): Double = js.native
  def rating(behavior: setting, name: initialRating, value: Double): JQuery = js.native
  def rating(behavior: setting, name: interactive): Boolean = js.native
  def rating(behavior: setting, name: interactive, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: name): String = js.native
  def rating(behavior: setting, name: namespace): String = js.native
  def rating(behavior: setting, name: namespace, value: String): JQuery = js.native
  def rating(behavior: setting, name: name, value: String): JQuery = js.native
  def rating(behavior: setting, name: onRate): js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit] = js.native
  def rating(
    behavior: setting,
    name: onRate,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
  ): JQuery = js.native
  def rating(behavior: setting, name: performance): Boolean = js.native
  def rating(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: selector): SelectorSettings = js.native
  def rating(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def rating(behavior: setting, name: silent): Boolean = js.native
  def rating(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: verbose): Boolean = js.native
  def rating(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def rating(settings: RatingSettings): JQuery = js.native
  /**
    * Clears current rating
    */
  @JSName("rating")
  def rating_clearrating(behavior: `clear rating`): JQuery = js.native
  @JSName("rating")
  def rating_destroy(behavior: destroy): JQuery = js.native
  /**
    * Disables interactive rating mode
    */
  @JSName("rating")
  def rating_disable(behavior: disable): JQuery = js.native
  /**
    * Enables interactive rating mode
    */
  @JSName("rating")
  def rating_enable(behavior: enable): JQuery = js.native
  /**
    * Gets current rating
    */
  @JSName("rating")
  def rating_getrating(behavior: `get rating`): Double = js.native
  /**
    * Sets rating programmatically
    */
  @JSName("rating")
  def rating_setrating(behavior: `set rating`, rating: Double): JQuery = js.native
  @JSName("rating")
  def rating_setting(behavior: setting, value: RatingSettings): JQuery = js.native
}

