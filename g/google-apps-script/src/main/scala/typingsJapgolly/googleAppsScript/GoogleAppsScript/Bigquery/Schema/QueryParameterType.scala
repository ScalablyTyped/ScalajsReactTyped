package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterType extends js.Object {
  var arrayType: js.UndefOr[QueryParameterType] = js.undefined
  var structTypes: js.UndefOr[js.Array[QueryParameterTypeStructTypes]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryParameterType {
  @scala.inline
  def apply(
    arrayType: QueryParameterType = null,
    structTypes: js.Array[QueryParameterTypeStructTypes] = null,
    `type`: String = null
  ): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    if (arrayType != null) __obj.updateDynamic("arrayType")(arrayType.asInstanceOf[js.Any])
    if (structTypes != null) __obj.updateDynamic("structTypes")(structTypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameterType]
  }
}

