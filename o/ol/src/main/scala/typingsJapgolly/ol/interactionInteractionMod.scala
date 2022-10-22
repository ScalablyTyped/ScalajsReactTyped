package typingsJapgolly.ol

import org.scalajs.dom.UIEvent
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionInteractionMod {
  
  @JSImport("ol/interaction/Interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/interaction/Interaction", JSImport.Default)
  @js.native
  open class default () extends Interaction {
    def this(opt_options: InteractionOptions) = this()
  }
  
  inline def pan(view: typingsJapgolly.ol.viewMod.default, delta: Coordinate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pan(view: typingsJapgolly.ol.viewMod.default, delta: Coordinate, opt_duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], opt_duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zoomByDelta(view: typingsJapgolly.ol.viewMod.default, delta: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomByDelta(view: typingsJapgolly.ol.viewMod.default, delta: Double, opt_anchor: Unit, opt_duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], opt_anchor.asInstanceOf[js.Any], opt_duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomByDelta(view: typingsJapgolly.ol.viewMod.default, delta: Double, opt_anchor: Coordinate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], opt_anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomByDelta(
    view: typingsJapgolly.ol.viewMod.default,
    delta: Double,
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], opt_anchor.asInstanceOf[js.Any], opt_duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Interaction
    extends typingsJapgolly.ol.objectMod.default {
    
    /**
      * Return whether the interaction is currently active.
      */
    def getActive(): Boolean = js.native
    
    /**
      * Get the map associated with this interaction.
      */
    def getMap(): typingsJapgolly.ol.pluggableMapMod.default = js.native
    
    /**
      * Handles the {@link module:ol/MapBrowserEvent map browser event}.
      */
    def handleEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
    
    @JSName("on")
    def on_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Activate or deactivate the interaction.
      */
    def setActive(active: Boolean): Unit = js.native
    
    /**
      * Remove the interaction from its current map and attach it to the new map.
      * Subclasses may set up event handlers to get notified about changes to
      * the map here.
      */
    def setMap(map: typingsJapgolly.ol.pluggableMapMod.default): Unit = js.native
    
    @JSName("un")
    def un_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  trait InteractionOptions extends StObject {
    
    def handleEvent(p0: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent]): Boolean
  }
  object InteractionOptions {
    
    inline def apply(handleEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent] => Boolean): InteractionOptions = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[InteractionOptions]
    }
    
    extension [Self <: InteractionOptions](x: Self) {
      
      inline def setHandleEvent(value: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
