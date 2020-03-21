package typingsJapgolly.heremaps.H.map.render

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.heremaps.H.map.DataModel
import typingsJapgolly.heremaps.H.map.ViewModel
import typingsJapgolly.heremaps.H.map.ViewPort
import typingsJapgolly.heremaps.H.map.render.RenderEngine.Options
import typingsJapgolly.heremaps.H.util.EventTarget
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an abstract class representing a render engine. Render engines are used to render the geographical position from a view model on the
  * screen (viewport element). The rendered result may be different for different engines, because every engine uses its own capabilities and
  * specific implementation to present the current view model data in best possible way. For example, 2D engines create a two-dimensional flat
  * map composed of tiles, while 3D engines can generate panoramas displaying the same coordinates as a 'street view'.
  */
@JSGlobal("H.map.render.RenderEngine")
@js.native
class RenderEngine protected () extends EventTarget {
  /**
    * Constructor
    * @param viewPort {H.map.ViewPort} - An object representing the map viewport
    * @param viewModel {H.map.ViewModel} - An object representing a view of the map
    * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
    * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
    */
  def this(viewPort: ViewPort, viewModel: ViewModel, dataModel: DataModel, options: Options) = this()
  /**
    * This method adds a listener for a specific event.
    * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
    * @param type {string} - The name of the event
    * @param handler {!Function} - An event handler function
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - An object defining the scope for the handler function
    */
  def addEventListener(`type`: String, handler: js.Function1[/* evt */ Event_, Unit]): Unit = js.native
  def addEventListener(`type`: String, handler: js.Function1[/* evt */ Event_, Unit], opt_capture: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    handler: js.Function1[/* evt */ Event_, Unit],
    opt_capture: Boolean,
    opt_scope: js.Object
  ): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  /**
    * This method removes a previously added listener from the EventTarget instance.
    * @param type {string} - The name of the event
    * @param handler {!Function} - A previously added event handler
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - An object defining the scope for the handler function
    */
  def removeEventListener(`type`: String, handler: js.Function1[/* evt */ Event_, Unit]): Unit = js.native
  def removeEventListener(`type`: String, handler: js.Function1[/* evt */ Event_, Unit], opt_capture: Boolean): Unit = js.native
  def removeEventListener(
    `type`: String,
    handler: js.Function1[/* evt */ Event_, Unit],
    opt_capture: Boolean,
    opt_scope: js.Object
  ): Unit = js.native
}

@JSGlobal("H.map.render.RenderEngine")
@js.native
object RenderEngine extends js.Object {
  @js.native
  sealed trait InteractionModifiers extends js.Object
  
  /**
    * This object defines the modifiers to use for H.map.ViewPort#startInteraction.
    */
  @js.native
  object InteractionModifiers extends js.Object {
    /** changes incline angle during the interaction */
    @js.native
    sealed trait COORD extends InteractionModifiers
    
    /** changes map center during the interaction */
    @js.native
    sealed trait HEADING extends InteractionModifiers
    
    /** changes tilt angle during the interaction */
    @js.native
    sealed trait INCLINE extends InteractionModifiers
    
    /** changes heading angle during the interaction */
    @js.native
    sealed trait TILT extends InteractionModifiers
    
    /** changes zoom level during the interaction */
    @js.native
    sealed trait ZOOM extends InteractionModifiers
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InteractionModifiers with Double] = js.native
    /* 4 */ @js.native
    object COORD extends TopLevel[COORD with Double]
    
    /* 1 */ @js.native
    object HEADING extends TopLevel[HEADING with Double]
    
    /* 3 */ @js.native
    object INCLINE extends TopLevel[INCLINE with Double]
    
    /* 2 */ @js.native
    object TILT extends TopLevel[TILT with Double]
    
    /* 0 */ @js.native
    object ZOOM extends TopLevel[ZOOM with Double]
    
  }
  
  /**
    * An object containing the render engine initialization options
    */
  type Options = StringDictionary[String]
}

