package typingsJapgolly.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Resource that represents completion results.
  */
@js.native
trait SchemaCompletionResult extends js.Object {
  /**
    * The URI of the company image for CompletionType.COMPANY_NAME.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * The suggestion for the query.
    */
  var suggestion: js.UndefOr[String] = js.native
  /**
    * The completion topic.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCompletionResult {
  @scala.inline
  def apply(imageUri: String = null, suggestion: String = null, `type`: String = null): SchemaCompletionResult = {
    val __obj = js.Dynamic.literal()
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompletionResult]
  }
}

