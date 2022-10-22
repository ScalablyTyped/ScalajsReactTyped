package typingsJapgolly.openlayers.mod.olx.source

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.openlayers.mod.Attribution
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.CanvasFunctionType
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.Size
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import typingsJapgolly.openlayers.mod.source.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCanvasOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  def canvasFunction(extent: Extent_, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement
  @JSName("canvasFunction")
  var canvasFunction_Original: CanvasFunctionType
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var projection: ProjectionLike
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var state: js.UndefOr[State] = js.undefined
}
object ImageCanvasOptions {
  
  inline def apply(
    canvasFunction: (/* extent */ Extent_, /* resolution */ Double, /* pixelRatio */ Double, /* size */ Size, /* proj */ Projection) => HTMLCanvasElement
  ): ImageCanvasOptions = {
    val __obj = js.Dynamic.literal(canvasFunction = js.Any.fromFunction5(canvasFunction))
    __obj.asInstanceOf[ImageCanvasOptions]
  }
  
  extension [Self <: ImageCanvasOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value*))
    
    inline def setCanvasFunction(
      value: (/* extent */ Extent_, /* resolution */ Double, /* pixelRatio */ Double, /* size */ Size, /* proj */ Projection) => HTMLCanvasElement
    ): Self = StObject.set(x, "canvasFunction", js.Any.fromFunction5(value))
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
