package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.CodedValueDomainPropertie
import typingsJapgolly.arcgisJsApi.anon.RangeDomainPropertiestype
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

trait FieldProperties extends StObject {
  
  /**
    * The display name for the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * The default value set for the field.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    */
  var defaultValue: js.UndefOr[Double | String | Any] = js.undefined
  
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The domain associated with the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    */
  var domain: js.UndefOr[
    CodedValueDomainPropertie | RangeDomainPropertiestype | typingsJapgolly.arcgisJsApi.anon.InheritedDomainProperties
  ] = js.undefined
  
  /**
    * Indicates whether the field is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The field length.
    *
    * @default -1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the field can accept `null` values.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The data type of the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string_ | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.undefined
  
  /**
    * The types of values that can be assigned to a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: js.UndefOr[
    binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none_ | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
  ] = js.undefined
}
object FieldProperties {
  
  inline def apply(): FieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProperties]
  }
  
  extension [Self <: FieldProperties](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setDefaultValue(value: Double | String | Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(
      value: CodedValueDomainPropertie | RangeDomainPropertiestype | typingsJapgolly.arcgisJsApi.anon.InheritedDomainProperties
    ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setType(
      value: `small-integer` | integer | single | double | long | string_ | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueType(
      value: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none_ | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
    ): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
