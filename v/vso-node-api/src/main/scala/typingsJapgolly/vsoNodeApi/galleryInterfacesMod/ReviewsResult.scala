package typingsJapgolly.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResult extends js.Object {
  /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
  var hasMoreReviews: Boolean
  /**
    * List of reviews
    */
  var reviews: js.Array[Review]
  /**
    * Count of total review items
    */
  var totalReviewCount: Double
}

object ReviewsResult {
  @scala.inline
  def apply(hasMoreReviews: Boolean, reviews: js.Array[Review], totalReviewCount: Double): ReviewsResult = {
    val __obj = js.Dynamic.literal(hasMoreReviews = hasMoreReviews.asInstanceOf[js.Any], reviews = reviews.asInstanceOf[js.Any], totalReviewCount = totalReviewCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReviewsResult]
  }
}

