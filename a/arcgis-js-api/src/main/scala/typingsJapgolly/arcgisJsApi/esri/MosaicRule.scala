package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`lock-raster`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.attribute
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.blend
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.center_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.first
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.last
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mean
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.nadir
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.northwest
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.seamline
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.sum
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.viewpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MosaicRule
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Indicates whether the sort should be ascending.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    */
  var ascending: Boolean = js.native
  
  /**
    * The rendering rule applied on items before mosaicking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
    */
  var itemRenderingRule: RasterFunction = js.native
  
  /**
    * An array of raster Ids.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.Array[Double] = js.native
  
  /**
    * The mosaic method determines how the selected rasters are ordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
    */
  var method: none_ | center_ | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline = js.native
  
  /**
    * A multiple dimensional service can have multiple dimensions for one or more variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.Array[DimensionalDefinition] = js.native
  
  /**
    * Defines a selection using a set of ObjectIDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.Array[Double] = js.native
  
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
    */
  var operation: first | last | min | max | mean | blend | sum = js.native
  
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: String = js.native
  
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: String | Double = js.native
  
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: Point = js.native
  
  /**
    * The where clause determines which rasters will participate in the mosaic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: String = js.native
}
