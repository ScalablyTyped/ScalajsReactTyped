package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a3-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a3-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a4-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`a4-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`map-only`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-landscape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-portrait`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.eps
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.gif
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png8
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svgz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTemplate
  extends StObject
     with Accessor {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#attributionVisible)
    */
  var attributionVisible: Boolean = js.native
  
  /**
    * Define the map width, height and dpi.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#exportOptions)
    */
  var exportOptions: PrintTemplateExportOptions = js.native
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: Boolean = js.native
  
  /**
    * The output format for the printed map.
    *
    * @default png32
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#format)
    */
  var format: pdf | png32 | png8 | jpg | gif | eps | svg | svgz = js.native
  
  /**
    * The layout used for the print output.
    *
    * @default map-only
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layout)
    */
  var layout: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait` = js.native
  
  /**
    * Defines the layout elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var layoutOptions: PrintTemplateLayoutOptions = js.native
  
  /**
    * The optional map scale of the printed map.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#outScale)
    */
  var outScale: Double = js.native
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#scalePreserved)
    */
  var scalePreserved: Boolean = js.native
  
  /**
    * When `true`, labels will be shown on the layout.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#showLabels)
    */
  var showLabels: Boolean = js.native
}
