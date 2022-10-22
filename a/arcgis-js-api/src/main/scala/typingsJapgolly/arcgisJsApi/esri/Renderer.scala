package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`class-breaks`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`dot-density`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`pie-chart`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`unique-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dictionary
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
    */
  var authoringInfo: AuthoringInfo = js.native
  
  /**
    * The renderer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#type)
    */
  val `type`: `class-breaks` | dictionary | `dot-density` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.heatmap | `pie-chart` | simple | `unique-value` = js.native
}
