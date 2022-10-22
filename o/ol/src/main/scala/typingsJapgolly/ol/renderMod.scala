package typingsJapgolly.ol

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.renderEventMod.default
import typingsJapgolly.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("ol/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRenderPixel(event: default, pixel: Pixel): Pixel = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPixel")(event.asInstanceOf[js.Any], pixel.asInstanceOf[js.Any])).asInstanceOf[Pixel]
  
  inline def getVectorContext(event: default): typingsJapgolly.ol.renderCanvasImmediateMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getVectorContext")(event.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ol.renderCanvasImmediateMod.default]
  
  inline def toContext(context: CanvasRenderingContext2D): typingsJapgolly.ol.renderCanvasImmediateMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ol.renderCanvasImmediateMod.default]
  inline def toContext(context: CanvasRenderingContext2D, opt_options: ToContextOptions): typingsJapgolly.ol.renderCanvasImmediateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.renderCanvasImmediateMod.default]
  
  type OrderFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ FeatureLike, Double]
  
  trait State extends StObject {
    
    var context: CanvasRenderingContext2D
    
    var feature: FeatureLike
    
    var geometry: typingsJapgolly.ol.geomSimpleGeometryMod.default
    
    var pixelRatio: Double
    
    var resolution: Double
    
    var rotation: Double
  }
  object State {
    
    inline def apply(
      context: CanvasRenderingContext2D,
      feature: FeatureLike,
      geometry: typingsJapgolly.ol.geomSimpleGeometryMod.default,
      pixelRatio: Double,
      resolution: Double,
      rotation: Double
    ): State = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typingsJapgolly.ol.geomSimpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToContextOptions extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object ToContextOptions {
    
    inline def apply(): ToContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToContextOptions]
    }
    
    extension [Self <: ToContextOptions](x: Self) {
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
