package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererProperties extends StObject {
  
  /**
    * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
    */
  var authoringInfo: js.UndefOr[AuthoringInfoProperties] = js.undefined
}
object RendererProperties {
  
  inline def apply(): RendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererProperties]
  }
  
  extension [Self <: RendererProperties](x: Self) {
    
    inline def setAuthoringInfo(value: AuthoringInfoProperties): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthoringInfoUndefined: Self = StObject.set(x, "authoringInfo", js.undefined)
  }
}
