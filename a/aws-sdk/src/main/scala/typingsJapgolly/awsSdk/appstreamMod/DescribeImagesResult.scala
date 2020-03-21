package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagesResult extends js.Object {
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeImagesResult {
  @scala.inline
  def apply(Images: ImageList = null, NextToken: String = null): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    if (Images != null) __obj.updateDynamic("Images")(Images.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagesResult]
  }
}

