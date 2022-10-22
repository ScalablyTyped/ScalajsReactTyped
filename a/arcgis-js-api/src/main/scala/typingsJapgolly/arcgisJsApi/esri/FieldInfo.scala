package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rich-text`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`text-box`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`var`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.avg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.count
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.stddev
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The field name as defined by the service or the name of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#fieldName)
    */
  var fieldName: String = js.native
  
  /**
    * Class which provides formatting options for numerical or date fields and how they should display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#format)
    */
  var format: FieldInfoFormat = js.native
  
  /**
    * A Boolean determining whether users can edit this field.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#isEditable)
    */
  var isEditable: Boolean = js.native
  
  /**
    * A string containing the field alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#label)
    */
  var label: String = js.native
  
  /**
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#statisticType)
    */
  var statisticType: count | sum | min | max | avg | stddev | `var` = js.native
  
  /**
    * A string determining what type of input box editors see when editing the field.
    *
    * @default text-box
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#stringFieldOption)
    */
  var stringFieldOption: `rich-text` | `text-area` | `text-box` = js.native
  
  /**
    * A string providing an editing hint for editors of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#tooltip)
    */
  var tooltip: String = js.native
  
  /**
    * Indicates whether the field is visible in the popup window.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#visible)
    */
  var visible: Boolean = js.native
}
