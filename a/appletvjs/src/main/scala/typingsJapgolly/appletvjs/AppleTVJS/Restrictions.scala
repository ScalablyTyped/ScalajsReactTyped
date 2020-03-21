package typingsJapgolly.appletvjs.AppleTVJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restrictions extends js.Object {
  /** A boolean value that indicates if explicit media is allowed. */
  var allowsExplicit: Boolean
  /** The maximum movie ranking allowed. */
  var maxMovieRank: Double
  /** The maximum television show ranking allowed. */
  var maxTVShowRank: Double
  /** The maximum movie rating allowed for the specified country. */
  def maxMovieRatingForCountry(countryCode: String): String
  /** Sets the maximum television show rating allowed for the specified country. */
  def maxTVShowRatingForCountry(countryCode: String): String
}

object Restrictions {
  @scala.inline
  def apply(
    allowsExplicit: Boolean,
    maxMovieRank: Double,
    maxMovieRatingForCountry: String => CallbackTo[String],
    maxTVShowRank: Double,
    maxTVShowRatingForCountry: String => CallbackTo[String]
  ): Restrictions = {
    val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit.asInstanceOf[js.Any], maxMovieRank = maxMovieRank.asInstanceOf[js.Any], maxTVShowRank = maxTVShowRank.asInstanceOf[js.Any])
    __obj.updateDynamic("maxMovieRatingForCountry")(js.Any.fromFunction1((t0: java.lang.String) => maxMovieRatingForCountry(t0).runNow()))
    __obj.updateDynamic("maxTVShowRatingForCountry")(js.Any.fromFunction1((t0: java.lang.String) => maxTVShowRatingForCountry(t0).runNow()))
    __obj.asInstanceOf[Restrictions]
  }
}

