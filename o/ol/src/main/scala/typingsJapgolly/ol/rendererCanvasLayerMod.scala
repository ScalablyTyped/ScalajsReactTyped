package typingsJapgolly.ol

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasLayerMod {
  
  /* note: abstract class */ @JSImport("ol/renderer/canvas/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] */] protected () extends CanvasLayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
  @js.native
  trait CanvasLayerRenderer[LayerType /* <: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] */]
    extends typingsJapgolly.ol.rendererLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    
    /* protected */ def clip(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    
    /* protected */ def clipUnrotated(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    
    /* protected */ var container: HTMLElement = js.native
    
    /**
      * Creates a transform for rendering to an element that will be rotated after rendering.
      */
    /* protected */ def getRenderTransform(
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      pixelRatio: Double,
      width: Double,
      height: Double,
      offsetX: Double
    ): Transform = js.native
    
    /**
      * The transform for viewport CSS pixels to rendered pixels.  This transform must
      * be set when rendering a frame and may be used by other functions after rendering.
      */
    /* protected */ var inversePixelTransform: Transform = js.native
    
    /**
      * The transform for rendered pixels to viewport CSS pixels.  This transform must
      * be set when rendering a frame and may be used by other functions after rendering.
      */
    /* protected */ var pixelTransform: Transform = js.native
    
    /* protected */ def postRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    
    /* protected */ def preRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    
    /* protected */ var renderedResolution: Double = js.native
    
    /**
      * A temporary transform.  The values in this transform should only be used in a
      * function that sets the values.
      */
    /* protected */ var tempTransform: Transform = js.native
    
    /**
      * Get a rendering container from an existing target, if compatible.
      */
    def useContainer(target: HTMLElement, transform: String, opacity: Double): Unit = js.native
  }
}
