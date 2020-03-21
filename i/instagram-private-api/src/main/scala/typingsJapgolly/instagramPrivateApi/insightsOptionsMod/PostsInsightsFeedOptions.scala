package typingsJapgolly.instagramPrivateApi.insightsOptionsMod

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ALL
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.BIO_LINK_CLICK
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.CALL
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL_V2
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.COMMENT_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.EMAIL
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ENGAGEMENT_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.FOLLOW
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.GET_DIRECTIONS
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.IMAGE
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.IMPRESSION_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.LIKE_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ONE_MONTH
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ONE_YEAR
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.PROFILE_VIEW
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.REACH_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.SAVE_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.SHARE_COUNT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.SHOPPING
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.SIX_MONTHS
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.TEXT
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.THREE_MONTHS
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.TWO_YEARS
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedOptions extends js.Object {
  var dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK
  var postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING
  var timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
}

object PostsInsightsFeedOptions {
  @scala.inline
  def apply(
    dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK,
    postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING,
    timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
  ): PostsInsightsFeedOptions = {
    val __obj = js.Dynamic.literal(dataOrdering = dataOrdering.asInstanceOf[js.Any], postType = postType.asInstanceOf[js.Any], timeframe = timeframe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostsInsightsFeedOptions]
  }
}

