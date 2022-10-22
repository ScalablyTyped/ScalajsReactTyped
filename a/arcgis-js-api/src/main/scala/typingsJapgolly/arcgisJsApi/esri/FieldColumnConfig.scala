package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.asc_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.center_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.desc_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.end
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldColumnConfig
  extends StObject
     with FieldConfig {
  
  /**
    * Controls the sort order of the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#direction)
    */
  var direction: asc_ | desc_ | Any = js.native
  
  /**
    * Use this in combination with [FeatureTable.multiSortEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#multiSortEnabled) and FeatureTable.direction properties to set sorting functionality on multiple columns.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#initialSortPriority)
    */
  var initialSortPriority: Double = js.native
  
  /**
    * Set this object to customize the field column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#menuConfig)
    */
  var menuConfig: ButtonMenuConfig = js.native
  
  /**
    * Indicates whether the field column can be sorted.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#sortable)
    */
  var sortable: Boolean = js.native
  
  /**
    * Aligns the columns cell content horizontally.
    *
    * @default start
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#textAlign)
    */
  var textAlign: start | center_ | end = js.native
  
  /**
    * Indicates whether the field column is visible.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#visible)
    */
  var visible: Boolean = js.native
}
