package typingsJapgolly.plottable

import typingsJapgolly.plottable.anon.X
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.Point
import typingsJapgolly.plottable.buildSrcScalesScaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInteractionsMod {
  
  @JSImport("plottable/build/src/interactions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/interactions", "Click")
  @js.native
  open class Click ()
    extends typingsJapgolly.plottable.buildSrcInteractionsClickInteractionMod.Click
  /* static members */
  object Click {
    
    @JSImport("plottable/build/src/interactions", "Click")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions", "Click._pointsEqual")
    @js.native
    def _pointsEqual: Any = js.native
    inline def _pointsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointsEqual")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/interactions", "Drag")
  @js.native
  open class Drag ()
    extends typingsJapgolly.plottable.buildSrcInteractionsDragInteractionMod.Drag {
    def this(mouseButton: Double) = this()
  }
  /* static members */
  object Drag {
    
    @JSImport("plottable/build/src/interactions", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions", "Drag._DEFAULT_MOUSE_FILTER")
    @js.native
    def _DEFAULT_MOUSE_FILTER: Any = js.native
    inline def _DEFAULT_MOUSE_FILTER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MOUSE_FILTER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/interactions", "Key")
  @js.native
  open class Key ()
    extends typingsJapgolly.plottable.buildSrcInteractionsKeyInteractionMod.Key
  
  @JSImport("plottable/build/src/interactions", "PanZoom")
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  open class PanZoom ()
    extends typingsJapgolly.plottable.buildSrcInteractionsPanZoomInteractionMod.PanZoom {
    def this(xScale: TransformableScale[Any, Double]) = this()
    def this(xScale: Unit, yScale: TransformableScale[Any, Double]) = this()
    def this(xScale: TransformableScale[Any, Double], yScale: TransformableScale[Any, Double]) = this()
  }
  /* static members */
  object PanZoom {
    
    @JSImport("plottable/build/src/interactions", "PanZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of pixels occupied in a line.
      */
    @JSImport("plottable/build/src/interactions", "PanZoom._PIXELS_PER_LINE")
    @js.native
    def _PIXELS_PER_LINE: Any = js.native
    inline def _PIXELS_PER_LINE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PIXELS_PER_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/interactions", "PanZoom._pointDistance")
    @js.native
    def _pointDistance: Any = js.native
    inline def _pointDistance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointDistance")(x.asInstanceOf[js.Any])
    
    inline def centerPoint(point1: Point, point2: Point): X = (^.asInstanceOf[js.Dynamic].applyDynamic("centerPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[X]
  }
  
  @JSImport("plottable/build/src/interactions", "Pointer")
  @js.native
  open class Pointer ()
    extends typingsJapgolly.plottable.buildSrcInteractionsPointerInteractionMod.Pointer
  
  inline def zoomOut(value: Double, zoom: Double, center: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(value.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Double]
}
