package typingsJapgolly.openlayers.global.ol

import org.scalajs.dom.File
import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.DrawGeometryFunctionType
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.ModifyEventType
import typingsJapgolly.openlayers.mod.interaction.DragAndDropEventType
import typingsJapgolly.openlayers.mod.interaction.DrawEventType
import typingsJapgolly.openlayers.mod.interaction.ExtentEventType
import typingsJapgolly.openlayers.mod.interaction.TranslateEventType
import typingsJapgolly.openlayers.mod.olx.interaction.DefaultsOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DoubleClickZoomOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DragAndDropOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DragBoxOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DragPanOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DragRotateAndZoomOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DragRotateOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DragZoomOptions
import typingsJapgolly.openlayers.mod.olx.interaction.DrawOptions
import typingsJapgolly.openlayers.mod.olx.interaction.ExtentOptions
import typingsJapgolly.openlayers.mod.olx.interaction.InteractionOptions
import typingsJapgolly.openlayers.mod.olx.interaction.KeyboardPanOptions
import typingsJapgolly.openlayers.mod.olx.interaction.KeyboardZoomOptions
import typingsJapgolly.openlayers.mod.olx.interaction.ModifyOptions
import typingsJapgolly.openlayers.mod.olx.interaction.MouseWheelZoomOptions
import typingsJapgolly.openlayers.mod.olx.interaction.PinchRotateOptions
import typingsJapgolly.openlayers.mod.olx.interaction.PinchZoomOptions
import typingsJapgolly.openlayers.mod.olx.interaction.PointerOptions
import typingsJapgolly.openlayers.mod.olx.interaction.SelectOptions
import typingsJapgolly.openlayers.mod.olx.interaction.SnapOptions
import typingsJapgolly.openlayers.mod.olx.interaction.TranslateOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interaction {
  
  @JSGlobal("ol.interaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DoubleClickZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DoubleClickZoom ()
    extends typingsJapgolly.openlayers.mod.interaction.DoubleClickZoom {
    def this(opt_options: DoubleClickZoomOptions) = this()
  }
  object DoubleClickZoom {
    
    @JSGlobal("ol.interaction.DoubleClickZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
      * doubleclick) and eventually zooms the map.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @fires ol.interaction.DragAndDropEvent
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DragAndDrop")
  @js.native
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @fires ol.interaction.DragAndDropEvent
    * @param opt_options Options.
    * @api stable
    */
  open class DragAndDrop ()
    extends typingsJapgolly.openlayers.mod.interaction.DragAndDrop {
    def this(opt_options: DragAndDropOptions) = this()
  }
  object DragAndDrop {
    
    @JSGlobal("ol.interaction.DragAndDrop")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
      * of this type.
      *
      * @param type Type.
      * @param file File.
      * @param opt_features Features.
      * @param opt_projection Projection.
      */
    @JSGlobal("ol.interaction.DragAndDrop.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.DragAndDrop.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
        * of this type.
        *
        * @param type Type.
        * @param file File.
        * @param opt_features Features.
        * @param opt_projection Projection.
        */
      def this(`type`: DragAndDropEventType, file: File) = this()
      def this(
        `type`: DragAndDropEventType,
        file: File,
        opt_features: js.Array[typingsJapgolly.openlayers.mod.Feature]
      ) = this()
      def this(
        `type`: DragAndDropEventType,
        file: File,
        opt_features: js.Array[typingsJapgolly.openlayers.mod.Feature],
        opt_projection: Projection
      ) = this()
      def this(`type`: DragAndDropEventType, file: File, opt_features: Unit, opt_projection: Projection) = this()
    }
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
      * neither prevents the browser default nor stops event propagation.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    @JSGlobal("ol.interaction.DragAndDrop.handleEvent")
    @js.native
    def handleEvent: Any = js.native
    inline def handleEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link ol.interaction.DragZoom} and
    * {@link ol.interaction.DragRotateAndZoom}).
    *
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.DragBoxEvent
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DragBox")
  @js.native
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link ol.interaction.DragZoom} and
    * {@link ol.interaction.DragRotateAndZoom}).
    *
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.DragBoxEvent
    * @param opt_options Options.
    * @api stable
    */
  open class DragBox ()
    extends typingsJapgolly.openlayers.mod.interaction.DragBox {
    def this(opt_options: DragBoxOptions) = this()
  }
  object DragBox {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragBox} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param coordinate The event coordinate.
      * @param mapBrowserEvent Originating event.
      */
    @JSGlobal("ol.interaction.DragBox.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.DragBox.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragBox} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param coordinate The event coordinate.
        * @param mapBrowserEvent Originating event.
        */
      def this(
        `type`: String,
        coordinate: Coordinate_,
        mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent
      ) = this()
    }
  }
  
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DragPan")
  @js.native
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragPan ()
    extends typingsJapgolly.openlayers.mod.interaction.DragPan {
    def this(opt_options: DragPanOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DragRotate")
  @js.native
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragRotate ()
    extends typingsJapgolly.openlayers.mod.interaction.DragRotate {
    def this(opt_options: DragRotateOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DragRotateAndZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragRotateAndZoom ()
    extends typingsJapgolly.openlayers.mod.interaction.DragRotateAndZoom {
    def this(opt_options: DragRotateAndZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.DragZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragZoom ()
    extends typingsJapgolly.openlayers.mod.interaction.DragZoom {
    def this(opt_options: DragZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Interaction for drawing feature geometries.
    *
    * @fires ol.interaction.DrawEvent
    * @param options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.Draw")
  @js.native
  open class Draw protected ()
    extends typingsJapgolly.openlayers.mod.interaction.Draw {
    /**
      * @classdesc
      * Interaction for drawing feature geometries.
      *
      * @fires ol.interaction.DrawEvent
      * @param options Options.
      * @api stable
      */
    def this(options: DrawOptions) = this()
  }
  object Draw {
    
    @JSGlobal("ol.interaction.Draw")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Draw} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    @JSGlobal("ol.interaction.Draw.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.Draw.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Draw} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      def this(`type`: DrawEventType, feature: typingsJapgolly.openlayers.mod.Feature) = this()
    }
    
    /**
      * Create a `geometryFunction` that will create a box-shaped polygon (aligned
      * with the coordinate system axes).  Use this with the draw interaction and
      * `type: 'Circle'` to return a box instead of a circle geometry.
      * @return Function that draws a box-shaped polygon.
      * @api
      */
    /* static member */
    inline def createBox(): DrawGeometryFunctionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")().asInstanceOf[DrawGeometryFunctionType]
    
    /**
      * Create a `geometryFunction` for `mode: 'Circle'` that will create a regular
      * polygon with a user specified number of sides and start angle instead of an
      * `ol.geom.Circle` geometry.
      * @param opt_sides Number of sides of the regular polygon. Default is
      *     32.
      * @param opt_angle Angle of the first point in radians. 0 means East.
      *     Default is the angle defined by the heading from the center of the
      *     regular polygon to the current pointer position.
      * @return Function that draws a
      *     polygon.
      * @api
      */
    /* static member */
    inline def createRegularPolygon(): DrawGeometryFunctionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")().asInstanceOf[DrawGeometryFunctionType]
    inline def createRegularPolygon(opt_sides: Double): DrawGeometryFunctionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(opt_sides.asInstanceOf[js.Any]).asInstanceOf[DrawGeometryFunctionType]
    inline def createRegularPolygon(opt_sides: Double, opt_angle: Double): DrawGeometryFunctionType = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[DrawGeometryFunctionType]
    inline def createRegularPolygon(opt_sides: Unit, opt_angle: Double): DrawGeometryFunctionType = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[DrawGeometryFunctionType]
  }
  
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map.
    * Once drawn, the vector box can be modified by dragging its vertices or edges.
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.interaction.Extent.Event
    * @param options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.Extent")
  @js.native
  open class Extent protected ()
    extends typingsJapgolly.openlayers.mod.interaction.Extent {
    /**
      * @fires ol.interaction.Extent.Event
      * @param options Options.
      * @api stable
      */
    def this(options: ExtentOptions) = this()
  }
  object Extent {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Extent} instances are instances of
      * this type.
      *
      * @param extent the new extent
      */
    @JSGlobal("ol.interaction.Extent.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.Extent.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Extent} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      def this(`type`: ExtentEventType, extent: Extent_) = this()
    }
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
    * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
    * element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    *
    * @param options Options.
    * @api
    */
  @JSGlobal("ol.interaction.Interaction")
  @js.native
  open class Interaction protected ()
    extends typingsJapgolly.openlayers.mod.interaction.Interaction {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * User actions that change the state of the map. Some are similar to controls,
      * but are not associated with a DOM element.
      * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
      * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
      * element event.
      * Although interactions do not have a DOM element, some of them do render
      * vectors and so are visible on the screen.
      *
      * @param options Options.
      * @api
      */
    def this(options: InteractionOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardZoom}.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.KeyboardPan")
  @js.native
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardZoom}.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class KeyboardPan ()
    extends typingsJapgolly.openlayers.mod.interaction.KeyboardPan {
    def this(opt_options: KeyboardPanOptions) = this()
  }
  object KeyboardPan {
    
    @JSGlobal("ol.interaction.KeyboardPan")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
      * `KeyEvent`, and decides the direction to pan to (if an arrow key was
      * pressed).
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardPan}.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.KeyboardZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardPan}.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class KeyboardZoom ()
    extends typingsJapgolly.openlayers.mod.interaction.KeyboardZoom {
    def this(opt_options: KeyboardZoomOptions) = this()
  }
  object KeyboardZoom {
    
    @JSGlobal("ol.interaction.KeyboardZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
      * `KeyEvent`, and decides whether to zoom in or out (depending on whether the
      * key pressed was '+' or '-').
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Interaction for modifying feature geometries.
    *
    * @param options Options.
    * @fires ol.interaction.ModifyEvent
    * @api
    */
  @JSGlobal("ol.interaction.Modify")
  @js.native
  open class Modify protected ()
    extends typingsJapgolly.openlayers.mod.interaction.Modify {
    /**
      * @classdesc
      * Interaction for modifying feature geometries.
      *
      * @param options Options.
      * @fires ol.interaction.ModifyEvent
      * @api
      */
    def this(options: ModifyOptions) = this()
  }
  object Modify {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Modify} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features modified.
      * @param mapBrowserPointerEvent Associated
      *     {@link ol.MapBrowserPointerEvent}.
      */
    @JSGlobal("ol.interaction.Modify.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.Modify.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Modify} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features modified.
        * @param mapBrowserPointerEvent Associated
        *     {@link ol.MapBrowserPointerEvent}.
        */
      def this(
        `type`: ModifyEventType,
        features: typingsJapgolly.openlayers.mod.Collection[typingsJapgolly.openlayers.mod.Feature],
        mapBrowserPointerEvent: typingsJapgolly.openlayers.mod.MapBrowserPointerEvent
      ) = this()
    }
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.MouseWheelZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class MouseWheelZoom ()
    extends typingsJapgolly.openlayers.mod.interaction.MouseWheelZoom {
    def this(opt_options: MouseWheelZoomOptions) = this()
  }
  object MouseWheelZoom {
    
    @JSGlobal("ol.interaction.MouseWheelZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
      * mousewheel-event) and eventually zooms the map.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.PinchRotate")
  @js.native
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class PinchRotate ()
    extends typingsJapgolly.openlayers.mod.interaction.PinchRotate {
    def this(opt_options: PinchRotateOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.interaction.PinchZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class PinchZoom ()
    extends typingsJapgolly.openlayers.mod.interaction.PinchZoom {
    def this(opt_options: PinchZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.interaction.Pointer")
  @js.native
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    *
    * @param opt_options Options.
    * @api
    */
  open class Pointer ()
    extends typingsJapgolly.openlayers.mod.interaction.Pointer {
    def this(opt_options: PointerOptions) = this()
  }
  object Pointer {
    
    @JSGlobal("ol.interaction.Pointer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} and may call into
      * other functions, if event sequences like e.g. 'drag' or 'down-up' etc. are
      * detected.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * Selected features are added to an internal unmanaged layer.
    *
    * @param opt_options Options.
    * @fires ol.interaction.SelectEvent
    * @api stable
    */
  @JSGlobal("ol.interaction.Select")
  @js.native
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * Selected features are added to an internal unmanaged layer.
    *
    * @param opt_options Options.
    * @fires ol.interaction.SelectEvent
    * @api stable
    */
  open class Select ()
    extends typingsJapgolly.openlayers.mod.interaction.Select {
    def this(opt_options: SelectOptions) = this()
  }
  object Select {
    
    @JSGlobal("ol.interaction.Select")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Select} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param selected Selected features.
      * @param deselected Deselected features.
      * @param mapBrowserEvent Associated
      *     {@link ol.MapBrowserEvent}.
      */
    @JSGlobal("ol.interaction.Select.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.Select.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Select} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param selected Selected features.
        * @param deselected Deselected features.
        * @param mapBrowserEvent Associated
        *     {@link ol.MapBrowserEvent}.
        */
      def this(
        `type`: String,
        selected: js.Array[typingsJapgolly.openlayers.mod.Feature],
        deselected: js.Array[typingsJapgolly.openlayers.mod.Feature],
        mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent
      ) = this()
    }
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} and may change the
      * selected state of features.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: typingsJapgolly.openlayers.mod.MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     var snap = new ol.interaction.Snap({
    *       source: source
    *     });
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.interaction.Snap")
  @js.native
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     var snap = new ol.interaction.Snap({
    *       source: source
    *     });
    *
    * @param opt_options Options.
    * @api
    */
  open class Snap ()
    extends typingsJapgolly.openlayers.mod.interaction.Snap {
    def this(opt_options: SnapOptions) = this()
  }
  
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    *
    * @fires ol.interaction.TranslateEvent
    * @param options Options.
    * @api
    */
  @JSGlobal("ol.interaction.Translate")
  @js.native
  open class Translate protected ()
    extends typingsJapgolly.openlayers.mod.interaction.Translate {
    /**
      * @classdesc
      * Interaction for translating (moving) features.
      *
      * @fires ol.interaction.TranslateEvent
      * @param options Options.
      * @api
      */
    def this(options: TranslateOptions) = this()
  }
  object Translate {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Translate} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features translated.
      * @param coordinate The event coordinate.
      */
    @JSGlobal("ol.interaction.Translate.Event")
    @js.native
    open class Event protected ()
      extends typingsJapgolly.openlayers.mod.interaction.Translate.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Translate} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features translated.
        * @param coordinate The event coordinate.
        */
      def this(
        `type`: TranslateEventType,
        features: typingsJapgolly.openlayers.mod.Collection[typingsJapgolly.openlayers.mod.Feature],
        coordinate: Coordinate_
      ) = this()
    }
  }
  
  /**
    * Set of interactions included in maps by default. Specific interactions can be
    * excluded by setting the appropriate option to false in the constructor
    * options, but the order of the interactions is fixed.  If you want to specify
    * a different order for interactions, you will need to create your own
    * {@link ol.interaction.Interaction} instances and insert them into a
    * {@link ol.Collection} in the order you want before creating your
    * {@link ol.Map} instance. The default set of interactions, in sequence, is:
    * * {@link ol.interaction.DragRotate}
    * * {@link ol.interaction.DoubleClickZoom}
    * * {@link ol.interaction.DragPan}
    * * {@link ol.interaction.PinchRotate}
    * * {@link ol.interaction.PinchZoom}
    * * {@link ol.interaction.KeyboardPan}
    * * {@link ol.interaction.KeyboardZoom}
    * * {@link ol.interaction.MouseWheelZoom}
    * * {@link ol.interaction.DragZoom}
    *
    * @param opt_options Defaults options.
    * @return A collection of
    * interactions to be used with the ol.Map constructor's interactions option.
    * @api stable
    */
  inline def defaults(): typingsJapgolly.openlayers.mod.Collection[typingsJapgolly.openlayers.mod.interaction.Interaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typingsJapgolly.openlayers.mod.Collection[typingsJapgolly.openlayers.mod.interaction.Interaction]]
  inline def defaults(opt_options: DefaultsOptions): typingsJapgolly.openlayers.mod.Collection[typingsJapgolly.openlayers.mod.interaction.Interaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openlayers.mod.Collection[typingsJapgolly.openlayers.mod.interaction.Interaction]]
}
