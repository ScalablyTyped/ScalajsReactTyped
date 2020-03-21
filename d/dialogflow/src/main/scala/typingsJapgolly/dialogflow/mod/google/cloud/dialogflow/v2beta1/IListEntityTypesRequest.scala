package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListEntityTypesRequest. */
trait IListEntityTypesRequest extends js.Object {
  /** ListEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** ListEntityTypesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListEntityTypesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListEntityTypesRequest {
  @scala.inline
  def apply(
    languageCode: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null
  ): IListEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListEntityTypesRequest]
  }
}

