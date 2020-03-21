package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingFrance extends js.Object {
  /**
    * Movies rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingFranceMoviesType] = js.undefined
  /**
    * TV rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16,
    * agesAbove18.
    */
  var tvRating: js.UndefOr[RatingFranceTelevisionType] = js.undefined
}

object MediaContentRatingFrance {
  @scala.inline
  def apply(movieRating: RatingFranceMoviesType = null, tvRating: RatingFranceTelevisionType = null): MediaContentRatingFrance = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating.asInstanceOf[js.Any])
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContentRatingFrance]
  }
}

