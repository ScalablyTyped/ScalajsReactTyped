package typingsJapgolly.plottable.mod

import typingsJapgolly.plottable.AnonX
import typingsJapgolly.plottable.interfacesMod.Point
import typingsJapgolly.plottable.scaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Interactions")
@js.native
object Interactions extends js.Object {
  @js.native
  class Click ()
    extends typingsJapgolly.plottable.interactionsMod.Click
  
  @js.native
  class Drag ()
    extends typingsJapgolly.plottable.interactionsMod.Drag {
    def this(mouseButton: Double) = this()
  }
  
  @js.native
  class Key ()
    extends typingsJapgolly.plottable.keyInteractionMod.Key
  
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  class PanZoom ()
    extends typingsJapgolly.plottable.interactionsMod.PanZoom {
    def this(xScale: TransformableScale[_, Double]) = this()
    def this(xScale: TransformableScale[_, Double], yScale: TransformableScale[_, Double]) = this()
  }
  
  @js.native
  class Pointer ()
    extends typingsJapgolly.plottable.pointerInteractionMod.Pointer
  
  def zoomOut(value: Double, zoom: Double, center: Double): Double = js.native
  /* static members */
  @js.native
  object Click extends js.Object {
    /* private */ def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Drag extends js.Object {
    var _DEFAULT_MOUSE_FILTER: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PanZoom extends js.Object {
    /**
      * The number of pixels occupied in a line.
      */
    var _PIXELS_PER_LINE: js.Any = js.native
    /* private */ def _pointDistance(point1: js.Any, point2: js.Any): js.Any = js.native
    def centerPoint(point1: Point, point2: Point): AnonX = js.native
  }
  
}

