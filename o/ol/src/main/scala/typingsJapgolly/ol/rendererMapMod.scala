package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.renderEventTypeMod.EventType
import typingsJapgolly.ol.rendererVectorMod.FeatureCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMapMod {
  
  /* note: abstract class */ @JSImport("ol/renderer/Map", JSImport.Default)
  @js.native
  open class default protected () extends MapRenderer {
    def this(map: typingsJapgolly.ol.pluggableMapMod.default) = this()
  }
  
  trait HitMatch[T] extends StObject {
    
    def callback(
      p0: FeatureLike,
      p1: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default],
      p2: typingsJapgolly.ol.geomSimpleGeometryMod.default
    ): T
    @JSName("callback")
    var callback_Original: FeatureCallback[T]
    
    var distanceSq: Double
    
    var feature: FeatureLike
    
    var geometry: typingsJapgolly.ol.geomSimpleGeometryMod.default
    
    var layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
  }
  object HitMatch {
    
    inline def apply[T](
      callback: (/* p0 */ FeatureLike, /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], /* p2 */ typingsJapgolly.ol.geomSimpleGeometryMod.default) => T,
      distanceSq: Double,
      feature: FeatureLike,
      geometry: typingsJapgolly.ol.geomSimpleGeometryMod.default,
      layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
    ): HitMatch[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction3(callback), distanceSq = distanceSq.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[HitMatch[T]]
    }
    
    extension [Self <: HitMatch[?], T](x: Self & HitMatch[T]) {
      
      inline def setCallback(
        value: (/* p0 */ FeatureLike, /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], /* p2 */ typingsJapgolly.ol.geomSimpleGeometryMod.default) => T
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setDistanceSq(value: Double): Self = StObject.set(x, "distanceSq", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typingsJapgolly.ol.geomSimpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapRenderer
    extends typingsJapgolly.ol.disposableMod.default {
    
    /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
    
    def dispatchRenderEvent(`type`: EventType, frameState: FrameState): Unit = js.native
    
    def forEachFeatureAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      callback: FeatureCallback[T],
      thisArg: S,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg2: U
    ): js.UndefOr[T] = js.native
    
    def forEachLayerAtPixel[T](
      pixel: Pixel,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          /* p1 */ js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array, 
          T
        ],
      layerFilter: js.Function1[
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ]
    ): js.UndefOr[T] = js.native
    
    def getMap(): typingsJapgolly.ol.pluggableMapMod.default = js.native
    
    def hasFeatureAtCoordinate[U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg: U
    ): Boolean = js.native
    
    /**
      * Render.
      */
    def renderFrame(frameState: FrameState): Unit = js.native
    
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  }
}
