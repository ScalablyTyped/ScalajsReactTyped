package typingsJapgolly.ol

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.renderEventTypeMod.EventType
import typingsJapgolly.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderEventMod {
  
  @JSImport("ol/render/Event", JSImport.Default)
  @js.native
  open class default protected () extends RenderEvent {
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Transform) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Unit, opt_frameState: FrameState) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Transform, opt_frameState: FrameState) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Unit,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Unit,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Transform,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Transform,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
  }
  
  @js.native
  trait RenderEvent
    extends typingsJapgolly.ol.eventsEventMod.default {
    
    /**
      * Canvas context. Not available when the event is dispatched by the map. Only available
      * when a Canvas renderer is used, null otherwise.
      */
    var context: CanvasRenderingContext2D | Null = js.native
    
    /**
      * An object representing the current render frame state.
      */
    var frameState: FrameState = js.native
    
    /**
      * Transform from CSS pixels (relative to the top-left corner of the map viewport)
      * to rendered pixels on this event's context. Only available when a Canvas renderer is used, null otherwise.
      */
    var inversePixelTransform: Transform = js.native
  }
}
