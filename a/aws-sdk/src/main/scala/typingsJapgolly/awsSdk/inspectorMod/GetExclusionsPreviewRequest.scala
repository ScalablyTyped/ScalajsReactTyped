package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExclusionsPreviewRequest extends js.Object {
  /**
    * The ARN that specifies the assessment template for which the exclusions preview was requested.
    */
  var assessmentTemplateArn: Arn = js.native
  /**
    * The locale into which you want to translate the exclusion's title, description, and recommendation.
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 100. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.native
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The unique identifier associated of the exclusions preview.
    */
  var previewToken: UUID = js.native
}

object GetExclusionsPreviewRequest {
  @scala.inline
  def apply(
    assessmentTemplateArn: Arn,
    previewToken: UUID,
    locale: Locale = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null
  ): GetExclusionsPreviewRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any], previewToken = previewToken.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExclusionsPreviewRequest]
  }
}

