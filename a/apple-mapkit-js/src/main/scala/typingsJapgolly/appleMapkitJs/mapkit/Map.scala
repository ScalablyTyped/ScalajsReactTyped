package typingsJapgolly.appleMapkitJs.mapkit

import org.scalajs.dom.raw.Element
import typingsJapgolly.appleMapkitJs.AnonAdaptive
import typingsJapgolly.appleMapkitJs.AnonAnnotation
import typingsJapgolly.appleMapkitJs.AnonAnnotationAnnotation
import typingsJapgolly.appleMapkitJs.AnonCode
import typingsJapgolly.appleMapkitJs.AnonCoordinate
import typingsJapgolly.appleMapkitJs.AnonDark
import typingsJapgolly.appleMapkitJs.AnonHybrid
import typingsJapgolly.appleMapkitJs.AnonTimestamp
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`double-tap`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`drag-end`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`drag-start`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`long-press`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`map-type-change`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`region-change-end`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`region-change-start`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`scroll-end`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`scroll-start`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`single-tap`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`user-location-change`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`user-location-error`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`zoom-end`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`zoom-start`
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.deselect
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.dragging
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.select
import typingsJapgolly.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An embeddable interactive map that you add to a webpage.
  */
@JSGlobal("mapkit.Map")
@js.native
class Map protected () extends js.Object {
  /**
    * Creates a map that you embed on a webpage, and initializes its display
    * properties and other options.
    *
    * @parent parent A DOM element or the ID of a DOM element to use as this
    * map's container.
    * @param options An object that contains options for initializing a map's
    * features.
    */
  def this(parent: String) = this()
  def this(parent: Element) = this()
  def this(parent: String, options: MapConstructorOptions) = this()
  def this(parent: Element, options: MapConstructorOptions) = this()
  // Annotating the Map
  /**
    * An array of all the annotations on the map.
    */
  var annotations: js.Array[Annotation] = js.native
  // Manipulating the Visible Portion of the Map
  /**
    * The map coordinate at the center of the map view.
    */
  var center: Coordinate = js.native
  /**
    * The map’s color scheme when displaying standard or muted standard map types.
    */
  var colorScheme: String = js.native
  /**
    * The system of measurement displayed on the map.
    */
  var distances: String = js.native
  /**
    * The map's DOM element.
    */
  val element: Element = js.native
  // Accessing Interaction Properties
  /**
    * A Boolean value that indicates if map rotation is available.
    */
  var isRotationAvailable: Boolean = js.native
  /**
    * A Boolean value that determines whether the user may rotate the map using
    * the compass control or a rotate gesture.
    */
  var isRotationEnabled: Boolean = js.native
  /**
    * A Boolean value that determines whether the user may scroll the map with
    * a pointing device or with gestures on a touchscreen.
    */
  var isScrollEnabled: Boolean = js.native
  /**
    * A Boolean value that determines whether the user may zoom in and out on
    * the map using pinch gestures or the zoom control.
    */
  var isZoomEnabled: Boolean = js.native
  /**
    * The type of data displayed by the map view.
    */
  var mapType: String = js.native
  // Adding and Removing Overlays
  /**
    * An array of all of the map's overlays.
    */
  var overlays: js.Array[Overlay] = js.native
  /**
    * The map's inset margins.
    */
  var padding: Padding = js.native
  /**
    * The area currently displayed by the map.
    */
  var region: CoordinateRegion = js.native
  /**
    * The map's rotation, in degrees.
    */
  var rotation: Double = js.native
  /**
    * The annotation that is selected.
    */
  var selectedAnnotation: Annotation | Null = js.native
  /**
    * The overlay on the map that is selected.
    */
  var selectedOverlay: Overlay | Null = js.native
  /**
    * A feature visibility setting that determines when the compass is visible.
    */
  var showsCompass: String = js.native
  /**
    * A Boolean value that determines whether to display a control that lets
    * users choose the map type.
    */
  var showsMapTypeControl: Boolean = js.native
  /**
    * A Boolean value that determines whether the map displays points of interest.
    */
  var showsPointsOfInterest: Boolean = js.native
  /**
    * A feature visibility setting that determines when the map's scale is displayed.
    */
  var showsScale: String = js.native
  // Displaying the User's Location
  /**
    * A Boolean value that determines whether to show the user's location on
    * the map.
    */
  var showsUserLocation: Boolean = js.native
  /**
    * A Boolean value that determines whether the user location control is visible.
    */
  var showsUserLocationControl: Boolean = js.native
  /**
    * A Boolean value that determines whether to display a control for zooming
    * in and zooming out on a map.
    */
  var showsZoomControl: Boolean = js.native
  // Adding and Removing Tile Overlays
  /**
    * An array of all of the map's tile overlays.
    */
  var tileOverlays: js.Array[TileOverlay] = js.native
  /**
    * The CSS color that is used to paint the user interface controls on the map.
    */
  var tintColor: String = js.native
  /**
    * A Boolean value that determines whether to center the map on the user's
    * location.
    */
  var tracksUserLocation: Boolean = js.native
  /**
    * An annotation that indicates the user's location on the map.
    */
  val userLocationAnnotation: Annotation | Null = js.native
  /**
    * The visible area of the map defined in map units.
    */
  var visibleMapRect: MapRect = js.native
  /**
    * Adds an annotation to the map.
    */
  def addAnnotation(annotation: Annotation): Annotation = js.native
  /**
    * Adds multiple annotations to the map.
    */
  def addAnnotations(annotations: js.Array[Annotation]): js.Array[Annotation] = js.native
  @JSName("addEventListener")
  def addEventListener_deselect[T](
    `type`: deselect,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deselect[T](
    `type`: deselect,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_doubletap[T](
    `type`: `double-tap`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_doubletap[T](
    `type`: `double-tap`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend[T](
    `type`: `drag-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend[T](
    `type`: `drag-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragging[T](
    `type`: dragging,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonCoordinate, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragging[T](
    `type`: dragging,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonCoordinate, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart[T](
    `type`: `drag-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart[T](
    `type`: `drag-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_longpress[T](
    `type`: `long-press`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_longpress[T](
    `type`: `long-press`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maptypechange[T](
    `type`: `map-type-change`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maptypechange[T](
    `type`: `map-type-change`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_regionchangeend[T](
    `type`: `region-change-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_regionchangeend[T](
    `type`: `region-change-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  /**
    * Adds an event listener to handle events triggered by user interactions
    * and the framework.
    *
    * @param type The event type of interest (e.g., "select").
    * @param listener The callback function to invoke. Listener is passed a
    * Map event as its sole argument.
    * @param thisObject An object to be set as the this keyword on the listener
    * function.
    */
  @JSName("addEventListener")
  def addEventListener_regionchangestart[T](
    `type`: `region-change-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_regionchangestart[T](
    `type`: `region-change-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend[T](
    `type`: `scroll-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend[T](
    `type`: `scroll-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollstart[T](
    `type`: `scroll-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollstart[T](
    `type`: `scroll-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select[T](
    `type`: select,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select[T](
    `type`: select,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_singletap[T](
    `type`: `single-tap`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_singletap[T](
    `type`: `single-tap`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userlocationchange[T](
    `type`: `user-location-change`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonTimestamp, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userlocationchange[T](
    `type`: `user-location-change`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonTimestamp, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userlocationerror[T](
    `type`: `user-location-error`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonCode, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userlocationerror[T](
    `type`: `user-location-error`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type] with AnonCode, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomend[T](
    `type`: `zoom-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomend[T](
    `type`: `zoom-end`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomstart[T](
    `type`: `zoom-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomstart[T](
    `type`: `zoom-start`,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  /**
    * Adds an overlay to the map.
    */
  def addOverlay(overlay: Overlay): Overlay = js.native
  /**
    * Adds multiple overlays to the map.
    */
  def addOverlays(overlays: js.Array[Overlay]): js.Array[Overlay] = js.native
  /**
    * Adds a tile overlay to the map.
    */
  def addTileOverlay(tileOverlay: TileOverlay): TileOverlay = js.native
  /**
    * Adds an array of tile overlays to the map.
    */
  def addTileOverlays(tileOverlays: js.Array[TileOverlay]): js.Array[TileOverlay] = js.native
  /**
    * A delegate method for modifying an annotation that represents a group of
    * annotations that are combined into a cluster.
    */
  def annotationForCluster(clusterAnnotation: Annotation): Unit = js.native
  /**
    * Returns the list of annotation objects located in the specified map
    * rectangle.
    */
  def annotationsInMapRect(mapRect: MapRect): js.Array[Annotation] = js.native
  // Converting Map Coordinates
  /**
    * Converts a coordinate on the map to a point in the page's coordinate system.
    */
  def convertCoordinateToPointOnPage(coordinate: Coordinate): DOMPoint = js.native
  /**
    * Converts a point in page coordinates to the corresponding map coordinate.
    */
  def convertPointOnPageToCoordinate(point: DOMPoint): Coordinate = js.native
  /**
    * Removes the map's element from the DOM and releases internal references to
    * this map to free up memory.
    */
  def destroy(): Unit = js.native
  /**
    * Returns an array of overlays at a given point on the webpage.
    */
  def overlaysAtPoint(point: DOMPoint): js.Array[Overlay] = js.native
  /**
    * Removes an annotation from the map.
    */
  def removeAnnotation(annotation: Annotation): Annotation = js.native
  /**
    * Removes multiple annotations from the map.
    */
  def removeAnnotations(annotations: js.Array[Annotation]): js.Array[Annotation] = js.native
  @JSName("removeEventListener")
  def removeEventListener_deselect[T](
    `type`: deselect,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deselect[T](
    `type`: deselect,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_doubletap[T](`type`: `double-tap`, listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_doubletap[T](
    `type`: `double-tap`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend[T](
    `type`: `drag-end`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend[T](
    `type`: `drag-end`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragging[T](
    `type`: dragging,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonCoordinate, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragging[T](
    `type`: dragging,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonCoordinate, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart[T](
    `type`: `drag-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart[T](
    `type`: `drag-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotationAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_longpress[T](`type`: `long-press`, listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_longpress[T](
    `type`: `long-press`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_maptypechange[T](
    `type`: `map-type-change`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_maptypechange[T](
    `type`: `map-type-change`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_regionchangeend[T](
    `type`: `region-change-end`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_regionchangeend[T](
    `type`: `region-change-end`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  /**
    * Removes an event listener.
    */
  @JSName("removeEventListener")
  def removeEventListener_regionchangestart[T](
    `type`: `region-change-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_regionchangestart[T](
    `type`: `region-change-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend[T](`type`: `scroll-end`, listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend[T](
    `type`: `scroll-end`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollstart[T](
    `type`: `scroll-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollstart[T](
    `type`: `scroll-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select[T](
    `type`: select,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select[T](
    `type`: select,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonAnnotation, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_singletap[T](`type`: `single-tap`, listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_singletap[T](
    `type`: `single-tap`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userlocationchange[T](
    `type`: `user-location-change`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonTimestamp, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userlocationchange[T](
    `type`: `user-location-change`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonTimestamp, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userlocationerror[T](
    `type`: `user-location-error`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonCode, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userlocationerror[T](
    `type`: `user-location-error`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type] with AnonCode, Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomend[T](`type`: `zoom-end`, listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomend[T](
    `type`: `zoom-end`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomstart[T](`type`: `zoom-start`, listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomstart[T](
    `type`: `zoom-start`,
    listener: js.Function2[/* type */ T, /* event */ EventBase[this.type], Unit],
    thisObject: T
  ): Unit = js.native
  /**
    * Removes an overlay from the map.
    */
  def removeOverlay(overlay: Overlay): Overlay = js.native
  /**
    * Removes multiple overlays from the map.
    */
  def removeOverlays(overlays: js.Array[Overlay]): js.Array[Overlay] = js.native
  /**
    * Removes a tile overlay from the map.
    */
  def removeTileOverlay(tileOverlay: TileOverlay): TileOverlay = js.native
  /**
    * Removes an array of tile overlays from the map.
    */
  def removeTileOverlays(tileOverlays: js.Array[TileOverlay]): js.Array[TileOverlay] = js.native
  /**
    * Centers the map to the provided coordinate, with optional animation.
    */
  def setCenterAnimated(coordinate: Coordinate): this.type = js.native
  def setCenterAnimated(coordinate: Coordinate, animate: Boolean): this.type = js.native
  /**
    * Changes the map's region to the region provided, with optional animation.
    */
  def setRegionAnimated(region: CoordinateRegion): this.type = js.native
  def setRegionAnimated(region: CoordinateRegion, animate: Boolean): this.type = js.native
  /**
    * Changes the map's rotation setting to the number of degrees specified.
    */
  def setRotationAnimated(degrees: Double): this.type = js.native
  def setRotationAnimated(degrees: Double, animate: Boolean): this.type = js.native
  /**
    * Changes the map's visible map rectangle to the specified map rectangle.
    */
  def setVisibleMapRectAnimated(mapRect: MapRect): this.type = js.native
  def setVisibleMapRectAnimated(mapRect: MapRect, animate: Boolean): this.type = js.native
  /**
    * Adjusts the maps visible region to bring the specified overlays and
    * annotations into view.
    */
  def showItems[I](items: I): I = js.native
  def showItems[I](items: I, options: MapShowItemsOptions): I = js.native
  /**
    * Returns the topmost overlay at a given point on the webpage.
    */
  def topOverlayAtPoint(point: DOMPoint): Overlay | Null = js.native
}

/* static members */
@JSGlobal("mapkit.Map")
@js.native
object Map extends js.Object {
  // Configuring the Map's Appearance
  /**
    * Constants indicating the color scheme of the map.
    */
  val ColorSchemes: AnonDark = js.native
  /**
    * Constants indicating the system of measurement displayed on the map.
    */
  val Distances: AnonAdaptive = js.native
  /**
    * Constants representing the type of map to display.
    */
  val MapTypes: AnonHybrid = js.native
}

