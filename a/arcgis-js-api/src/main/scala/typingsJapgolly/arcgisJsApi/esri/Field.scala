package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`count-or-amount`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`date-and-time`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`global-id`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`location-or-place-name`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`name-or-title`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ordered-or-ranked`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`percentage-or-ratio`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`small-integer`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`type-or-category`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`unique-identifier`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.binary
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.blob
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.coordinate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.description
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.double
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.guid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.integer
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.long
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.measurement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.oid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.raster
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.single
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.string_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The display name for the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    */
  var alias: String = js.native
  
  /**
    * The default value set for the field.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    */
  var defaultValue: Double | String | Any = js.native
  
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: String = js.native
  
  /**
    * The domain associated with the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    */
  var domain: CodedValueDomain | RangeDomain | InheritedDomain = js.native
  
  /**
    * Indicates whether the field is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    */
  var editable: Boolean = js.native
  
  /**
    * The field length.
    *
    * @default -1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    */
  var length: Double = js.native
  
  /**
    * The name of the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    */
  var name: String = js.native
  
  /**
    * Indicates if the field can accept `null` values.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    */
  var nullable: Boolean = js.native
  
  /**
    * The data type of the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    */
  var `type`: `small-integer` | integer | single | double | long | string_ | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml = js.native
  
  /**
    * The types of values that can be assigned to a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none_ | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier` = js.native
}
