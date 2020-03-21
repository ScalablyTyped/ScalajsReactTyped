package typingsJapgolly.highcharts.exportDataMod.highchartsAugmentingMod

import typingsJapgolly.highcharts.highchartsStrings.DELETE
import typingsJapgolly.highcharts.highchartsStrings.GET
import typingsJapgolly.highcharts.highchartsStrings.POST
import typingsJapgolly.highcharts.highchartsStrings.UPDATE
import typingsJapgolly.highcharts.highchartsStrings.json
import typingsJapgolly.highcharts.highchartsStrings.octet
import typingsJapgolly.highcharts.highchartsStrings.text
import typingsJapgolly.highcharts.highchartsStrings.xml
import typingsJapgolly.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettingsObject extends js.Object {
  var data: String | Dictionary[_]
  var dataType: json | octet | text | xml
  var error: js.Function
  var headers: Dictionary[String]
  var success: js.Function
  var `type`: DELETE | GET | POST | UPDATE
  var url: String
}

object AjaxSettingsObject {
  @scala.inline
  def apply(
    data: String | Dictionary[_],
    dataType: json | octet | text | xml,
    error: js.Function,
    headers: Dictionary[String],
    success: js.Function,
    `type`: DELETE | GET | POST | UPDATE,
    url: String
  ): AjaxSettingsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsObject]
  }
}

