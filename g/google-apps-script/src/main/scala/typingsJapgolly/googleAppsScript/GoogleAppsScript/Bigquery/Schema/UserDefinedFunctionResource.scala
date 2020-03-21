package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunctionResource extends js.Object {
  var inlineCode: js.UndefOr[String] = js.undefined
  var resourceUri: js.UndefOr[String] = js.undefined
}

object UserDefinedFunctionResource {
  @scala.inline
  def apply(inlineCode: String = null, resourceUri: String = null): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    if (inlineCode != null) __obj.updateDynamic("inlineCode")(inlineCode.asInstanceOf[js.Any])
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
}

