package typingsJapgolly.semanticUiApi

import typingsJapgolly.semanticUiApi.semanticUiApiStrings.html
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.json
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.jsonp
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.script
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.text
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'dataType'> */
trait PickImpldataType extends js.Object {
  var dataType: xml | json | jsonp | script | html | text
}

object PickImpldataType {
  @scala.inline
  def apply(dataType: xml | json | jsonp | script | html | text): PickImpldataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImpldataType]
  }
}

