package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dark
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.light
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartGetSchemeByNameParams
  extends StObject
     with Object {
  
  /**
    * The basemap to pair with the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemeByName)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
    * If you have a non-Esri basemap (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemeByName)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
    * The geometry type of the features to visualize.
    *
    * [Read more...](global.html#geometryType)
    */
  var geometryType: point | polygon
  
  /**
    * The name of the scheme to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemeByName)
    */
  var name: String
  
  /**
    * The number of values to include in the pie chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemeByName)
    */
  var numColors: Double
}
object pieChartGetSchemeByNameParams {
  
  inline def apply(
    constructor: js.Function,
    geometryType: point | polygon,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): pieChartGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], numColors = numColors.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[pieChartGetSchemeByNameParams]
  }
  
  extension [Self <: pieChartGetSchemeByNameParams](x: Self) {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setGeometryType(value: point | polygon): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumColors(value: Double): Self = StObject.set(x, "numColors", value.asInstanceOf[js.Any])
  }
}
