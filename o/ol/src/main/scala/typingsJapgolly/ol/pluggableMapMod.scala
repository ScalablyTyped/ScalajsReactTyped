package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.UIEvent
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.layerLayerMod.State
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonlayerGroup
import typingsJapgolly.ol.olStrings.changeColonsize
import typingsJapgolly.ol.olStrings.changeColontarget
import typingsJapgolly.ol.olStrings.changeColonview
import typingsJapgolly.ol.olStrings.click
import typingsJapgolly.ol.olStrings.dblclick
import typingsJapgolly.ol.olStrings.moveend
import typingsJapgolly.ol.olStrings.movestart
import typingsJapgolly.ol.olStrings.pointerdrag
import typingsJapgolly.ol.olStrings.pointermove
import typingsJapgolly.ol.olStrings.postcompose
import typingsJapgolly.ol.olStrings.postrender
import typingsJapgolly.ol.olStrings.precompose
import typingsJapgolly.ol.olStrings.rendercomplete
import typingsJapgolly.ol.olStrings.singleclick
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluggableMapMod {
  
  @JSImport("ol/PluggableMap", JSImport.Default)
  @js.native
  open class default protected () extends PluggableMap {
    def this(options: MapOptions) = this()
  }
  
  trait AtPixelOptions extends StObject {
    
    var checkWrapped: js.UndefOr[Boolean] = js.undefined
    
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    var layerFilter: js.UndefOr[
        js.Function1[
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ]
      ] = js.undefined
  }
  object AtPixelOptions {
    
    inline def apply(): AtPixelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtPixelOptions]
    }
    
    extension [Self <: AtPixelOptions](x: Self) {
      
      inline def setCheckWrapped(value: Boolean): Self = StObject.set(x, "checkWrapped", value.asInstanceOf[js.Any])
      
      inline def setCheckWrappedUndefined: Self = StObject.set(x, "checkWrapped", js.undefined)
      
      inline def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      inline def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      inline def setLayerFilter(
        value: /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] => Boolean
      ): Self = StObject.set(x, "layerFilter", js.Any.fromFunction1(value))
      
      inline def setLayerFilterUndefined: Self = StObject.set(x, "layerFilter", js.undefined)
    }
  }
  
  trait FrameState extends StObject {
    
    var animate: Boolean
    
    var coordinateToPixelTransform: Transform
    
    var declutterTree: typingsJapgolly.rbush.mod.default[Any]
    
    var extent: Null | Extent
    
    var index: Double
    
    var layerIndex: Double
    
    var layerStatesArray: js.Array[State]
    
    var pixelRatio: Double
    
    var pixelToCoordinateTransform: Transform
    
    var postRenderFunctions: js.Array[PostRenderFunction]
    
    var size: Size
    
    var tileQueue: typingsJapgolly.ol.tileQueueMod.default
    
    var time: Double
    
    var usedTiles: StringDictionary[StringDictionary[Boolean]]
    
    var viewHints: js.Array[Double]
    
    var viewState: typingsJapgolly.ol.viewMod.State
    
    var wantedTiles: StringDictionary[StringDictionary[Boolean]]
  }
  object FrameState {
    
    inline def apply(
      animate: Boolean,
      coordinateToPixelTransform: Transform,
      declutterTree: typingsJapgolly.rbush.mod.default[Any],
      index: Double,
      layerIndex: Double,
      layerStatesArray: js.Array[State],
      pixelRatio: Double,
      pixelToCoordinateTransform: Transform,
      postRenderFunctions: js.Array[PostRenderFunction],
      size: Size,
      tileQueue: typingsJapgolly.ol.tileQueueMod.default,
      time: Double,
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      viewHints: js.Array[Double],
      viewState: typingsJapgolly.ol.viewMod.State,
      wantedTiles: StringDictionary[StringDictionary[Boolean]]
    ): FrameState = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], declutterTree = declutterTree.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerIndex = layerIndex.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any], extent = null)
      __obj.asInstanceOf[FrameState]
    }
    
    extension [Self <: FrameState](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateToPixelTransform(value: Transform): Self = StObject.set(x, "coordinateToPixelTransform", value.asInstanceOf[js.Any])
      
      inline def setCoordinateToPixelTransformVarargs(value: Double*): Self = StObject.set(x, "coordinateToPixelTransform", js.Array(value*))
      
      inline def setDeclutterTree(value: typingsJapgolly.rbush.mod.default[Any]): Self = StObject.set(x, "declutterTree", value.asInstanceOf[js.Any])
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentNull: Self = StObject.set(x, "extent", null)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLayerIndex(value: Double): Self = StObject.set(x, "layerIndex", value.asInstanceOf[js.Any])
      
      inline def setLayerStatesArray(value: js.Array[State]): Self = StObject.set(x, "layerStatesArray", value.asInstanceOf[js.Any])
      
      inline def setLayerStatesArrayVarargs(value: State*): Self = StObject.set(x, "layerStatesArray", js.Array(value*))
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelToCoordinateTransform(value: Transform): Self = StObject.set(x, "pixelToCoordinateTransform", value.asInstanceOf[js.Any])
      
      inline def setPixelToCoordinateTransformVarargs(value: Double*): Self = StObject.set(x, "pixelToCoordinateTransform", js.Array(value*))
      
      inline def setPostRenderFunctions(value: js.Array[PostRenderFunction]): Self = StObject.set(x, "postRenderFunctions", value.asInstanceOf[js.Any])
      
      inline def setPostRenderFunctionsVarargs(value: PostRenderFunction*): Self = StObject.set(x, "postRenderFunctions", js.Array(value*))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTileQueue(value: typingsJapgolly.ol.tileQueueMod.default): Self = StObject.set(x, "tileQueue", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUsedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "usedTiles", value.asInstanceOf[js.Any])
      
      inline def setViewHints(value: js.Array[Double]): Self = StObject.set(x, "viewHints", value.asInstanceOf[js.Any])
      
      inline def setViewHintsVarargs(value: Double*): Self = StObject.set(x, "viewHints", js.Array(value*))
      
      inline def setViewState(value: typingsJapgolly.ol.viewMod.State): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
      
      inline def setWantedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "wantedTiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapOptions extends StObject {
    
    var controls: js.UndefOr[
        typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] | js.Array[typingsJapgolly.ol.controlControlMod.default]
      ] = js.undefined
    
    var interactions: js.UndefOr[
        typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] | js.Array[typingsJapgolly.ol.interactionInteractionMod.default]
      ] = js.undefined
    
    var keyboardEventTarget: js.UndefOr[HTMLElement | Document | String] = js.undefined
    
    var layers: js.UndefOr[
        js.Array[typingsJapgolly.ol.layerBaseMod.default] | typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.layerBaseMod.default] | typingsJapgolly.ol.layerGroupMod.default
      ] = js.undefined
    
    var maxTilesLoading: js.UndefOr[Double] = js.undefined
    
    var moveTolerance: js.UndefOr[Double] = js.undefined
    
    var overlays: js.UndefOr[
        typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default] | js.Array[typingsJapgolly.ol.overlayMod.default]
      ] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var view: js.UndefOr[typingsJapgolly.ol.viewMod.default] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    extension [Self <: MapOptions](x: Self) {
      
      inline def setControls(
        value: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] | js.Array[typingsJapgolly.ol.controlControlMod.default]
      ): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: typingsJapgolly.ol.controlControlMod.default*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setInteractions(
        value: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] | js.Array[typingsJapgolly.ol.interactionInteractionMod.default]
      ): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: typingsJapgolly.ol.interactionInteractionMod.default*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setKeyboardEventTarget(value: HTMLElement | Document | String): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setKeyboardEventTargetUndefined: Self = StObject.set(x, "keyboardEventTarget", js.undefined)
      
      inline def setLayers(
        value: js.Array[typingsJapgolly.ol.layerBaseMod.default] | typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.layerBaseMod.default] | typingsJapgolly.ol.layerGroupMod.default
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: typingsJapgolly.ol.layerBaseMod.default*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMaxTilesLoading(value: Double): Self = StObject.set(x, "maxTilesLoading", value.asInstanceOf[js.Any])
      
      inline def setMaxTilesLoadingUndefined: Self = StObject.set(x, "maxTilesLoading", js.undefined)
      
      inline def setMoveTolerance(value: Double): Self = StObject.set(x, "moveTolerance", value.asInstanceOf[js.Any])
      
      inline def setMoveToleranceUndefined: Self = StObject.set(x, "moveTolerance", js.undefined)
      
      inline def setOverlays(
        value: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default] | js.Array[typingsJapgolly.ol.overlayMod.default]
      ): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      inline def setOverlaysVarargs(value: typingsJapgolly.ol.overlayMod.default*): Self = StObject.set(x, "overlays", js.Array(value*))
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setView(value: typingsJapgolly.ol.viewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait MapOptionsInternal extends StObject {
    
    var controls: js.UndefOr[
        typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default]
      ] = js.undefined
    
    var interactions: js.UndefOr[
        typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default]
      ] = js.undefined
    
    var keyboardEventTarget: HTMLElement | Document
    
    var overlays: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default]
    
    var values: StringDictionary[Any]
  }
  object MapOptionsInternal {
    
    inline def apply(
      keyboardEventTarget: HTMLElement | Document,
      overlays: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default],
      values: StringDictionary[Any]
    ): MapOptionsInternal = {
      val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptionsInternal]
    }
    
    extension [Self <: MapOptionsInternal](x: Self) {
      
      inline def setControls(value: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setInteractions(
        value: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default]
      ): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setKeyboardEventTarget(value: HTMLElement | Document): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setOverlays(value: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setValues(value: StringDictionary[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PluggableMap
    extends typingsJapgolly.ol.objectMod.default {
    
    /**
      * Add the given control to the map.
      */
    def addControl(control: typingsJapgolly.ol.controlControlMod.default): Unit = js.native
    
    /**
      * Add the given interaction to the map. If you want to add an interaction
      * at another point of the collection use getInteraction() and the methods
      * available on {@link module:ol/Collection~Collection}. This can be used to
      * stop the event propagation from the handleEvent function. The interactions
      * get to handle the events in the reverse order of this collection.
      */
    def addInteraction(interaction: typingsJapgolly.ol.interactionInteractionMod.default): Unit = js.native
    
    /**
      * Adds the given layer to the top of this map. If you want to add a layer
      * elsewhere in the stack, use getLayers() and the methods available on
      * {@link module:ol/Collection~Collection}.
      */
    def addLayer(layer: typingsJapgolly.ol.layerBaseMod.default): Unit = js.native
    
    /**
      * Add the given overlay to the map.
      */
    def addOverlay(overlay: typingsJapgolly.ol.overlayMod.default): Unit = js.native
    
    /* protected */ var controls: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = js.native
    
    def createRenderer(): typingsJapgolly.ol.rendererMapMod.default = js.native
    
    /**
      * Detect features that intersect a pixel on the viewport, and execute a
      * callback with each intersecting feature. Layers included in the detection can
      * be configured through the layerFilter option in opt_options.
      */
    def forEachFeatureAtPixel[S, T](
      pixel: Pixel,
      callback: js.Function3[
          /* p0 */ FeatureLike, 
          /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          /* p2 */ typingsJapgolly.ol.geomSimpleGeometryMod.default, 
          T
        ]
    ): js.UndefOr[T] = js.native
    def forEachFeatureAtPixel[S, T](
      pixel: Pixel,
      callback: js.Function3[
          /* p0 */ FeatureLike, 
          /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          /* p2 */ typingsJapgolly.ol.geomSimpleGeometryMod.default, 
          T
        ],
      opt_options: AtPixelOptions
    ): js.UndefOr[T] = js.native
    
    /**
      * Detect layers that have a color value at a pixel on the viewport, and
      * execute a callback with each matching layer. Layers included in the
      * detection can be configured through opt_layerFilter.
      * Note: this may give false positives unless the map layers have had different className
      * properties assigned to them.
      */
    def forEachLayerAtPixel[S, T](
      pixel: Pixel,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          /* p1 */ js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array, 
          T
        ]
    ): js.UndefOr[T] = js.native
    def forEachLayerAtPixel[S, T](
      pixel: Pixel,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          /* p1 */ js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array, 
          T
        ],
      opt_options: AtPixelOptions
    ): js.UndefOr[T] = js.native
    
    /**
      * Get the map controls. Modifying this collection changes the controls
      * associated with the map.
      */
    def getControls(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = js.native
    
    /**
      * Get the coordinate for a given pixel.  This returns a coordinate in the
      * user projection.
      */
    def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
    
    /**
      * Get the coordinate for a given pixel.  This returns a coordinate in the
      * map view projection.
      */
    def getCoordinateFromPixelInternal(pixel: Pixel): Coordinate = js.native
    
    /**
      * Returns the coordinate in user projection for a browser event.
      */
    def getEventCoordinate(event: MouseEvent): Coordinate = js.native
    
    /**
      * Returns the coordinate in view projection for a browser event.
      */
    def getEventCoordinateInternal(event: MouseEvent): Coordinate = js.native
    
    /**
      * Returns the map pixel position for a browser event relative to the viewport.
      */
    def getEventPixel(event: UIEvent): Pixel = js.native
    
    /**
      * Get all features that intersect a pixel on the viewport.
      */
    def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
    def getFeaturesAtPixel(pixel: Pixel, opt_options: AtPixelOptions): js.Array[FeatureLike] = js.native
    
    /**
      * Get the map interactions. Modifying this collection changes the interactions
      * associated with the map.
      * Interactions are used for e.g. pan, zoom and rotate.
      */
    def getInteractions(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] = js.native
    
    /**
      * Get the layergroup associated with this map.
      */
    def getLayerGroup(): typingsJapgolly.ol.layerGroupMod.default = js.native
    
    /**
      * Get the collection of layers associated with this map.
      */
    def getLayers(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.layerBaseMod.default] = js.native
    
    def getLoading(): Boolean = js.native
    
    /**
      * Get an overlay by its identifier (the value returned by overlay.getId()).
      * Note that the index treats string and numeric identifiers as the same. So
      * map.getOverlayById(2) will return an overlay with id '2' or 2.
      */
    def getOverlayById(id: String): typingsJapgolly.ol.overlayMod.default = js.native
    def getOverlayById(id: Double): typingsJapgolly.ol.overlayMod.default = js.native
    
    /**
      * Get the element that serves as the container for overlays.  Elements added to
      * this container will let mousedown and touchstart events through to the map,
      * so clicks and gestures on an overlay will trigger {@link module:ol/MapBrowserEvent~MapBrowserEvent}
      * events.
      */
    def getOverlayContainer(): HTMLElement = js.native
    
    /**
      * Get the element that serves as a container for overlays that don't allow
      * event propagation. Elements added to this container won't let mousedown and
      * touchstart events through to the map, so clicks and gestures on an overlay
      * don't trigger any {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      */
    def getOverlayContainerStopEvent(): HTMLElement = js.native
    
    /**
      * Get the map overlays. Modifying this collection changes the overlays
      * associated with the map.
      */
    def getOverlays(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default] = js.native
    
    def getOwnerDocument(): Document = js.native
    
    /**
      * Get the pixel for a coordinate.  This takes a coordinate in the user
      * projection and returns the corresponding pixel.
      */
    def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
    
    /**
      * Get the pixel for a coordinate.  This takes a coordinate in the map view
      * projection and returns the corresponding pixel.
      */
    def getPixelFromCoordinateInternal(coordinate: Coordinate): Pixel = js.native
    
    /**
      * Get the map renderer.
      */
    def getRenderer(): typingsJapgolly.ol.rendererMapMod.default = js.native
    
    /**
      * Get the size of this map.
      */
    def getSize(): js.UndefOr[Size] = js.native
    
    /**
      * Get the target in which this map is rendered.
      * Note that this returns what is entered as an option or in setTarget:
      * if that was an element, it returns an element; if a string, it returns that.
      */
    def getTarget(): js.UndefOr[HTMLElement | String] = js.native
    
    /**
      * Get the DOM element into which this map is rendered. In contrast to
      * getTarget this method always return an Element, or null if the
      * map has no target.
      */
    def getTargetElement(): HTMLElement = js.native
    
    def getTilePriority(
      tile: typingsJapgolly.ol.tileMod.default,
      tileSourceKey: String,
      tileCenter: Coordinate,
      tileResolution: Double
    ): Double = js.native
    
    /**
      * Get the view associated with this map. A view manages properties such as
      * center and resolution.
      */
    def getView(): typingsJapgolly.ol.viewMod.default = js.native
    
    /**
      * Get the element that serves as the map viewport.
      */
    def getViewport(): HTMLElement = js.native
    
    def handleBrowserEvent(browserEvent: UIEvent): Unit = js.native
    def handleBrowserEvent(browserEvent: UIEvent, opt_type: String): Unit = js.native
    
    def handleMapBrowserEvent(mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    /* protected */ def handlePostRender(): Unit = js.native
    
    /**
      * Detect if features intersect a pixel on the viewport. Layers included in the
      * detection can be configured through opt_layerFilter.
      */
    def hasFeatureAtPixel(pixel: Pixel): Boolean = js.native
    def hasFeatureAtPixel(pixel: Pixel, opt_options: AtPixelOptions): Boolean = js.native
    
    /* protected */ var interactions: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] = js.native
    
    def isRendered(): Boolean = js.native
    
    @JSName("on")
    def on_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_click(
      `type`: click,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_dblclick(
      `type`: dblclick,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_pointerdrag(
      `type`: pointerdrag,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_postcompose(
      `type`: postcompose,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_precompose(
      `type`: precompose,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_rendercomplete(
      `type`: rendercomplete,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_singleclick(
      `type`: singleclick,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    
    @JSName("once")
    def once_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_click(
      `type`: click,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_dblclick(
      `type`: dblclick,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_pointerdrag(
      `type`: pointerdrag,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_postcompose(
      `type`: postcompose,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_precompose(
      `type`: precompose,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_rendercomplete(
      `type`: rendercomplete,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_singleclick(
      `type`: singleclick,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    
    /**
      * Redraws all text after new fonts have loaded
      */
    def redrawText(): Unit = js.native
    
    /**
      * Remove the given control from the map.
      */
    def removeControl(control: typingsJapgolly.ol.controlControlMod.default): js.UndefOr[typingsJapgolly.ol.controlControlMod.default] = js.native
    
    /**
      * Remove the given interaction from the map.
      */
    def removeInteraction(interaction: typingsJapgolly.ol.interactionInteractionMod.default): js.UndefOr[typingsJapgolly.ol.interactionInteractionMod.default] = js.native
    
    /**
      * Removes the given layer from the map.
      */
    def removeLayer(layer: typingsJapgolly.ol.layerBaseMod.default): js.UndefOr[typingsJapgolly.ol.layerBaseMod.default] = js.native
    
    /**
      * Remove the given overlay from the map.
      */
    def removeOverlay(overlay: typingsJapgolly.ol.overlayMod.default): js.UndefOr[typingsJapgolly.ol.overlayMod.default] = js.native
    
    /**
      * Request a map rendering (at the next animation frame).
      */
    def render(): Unit = js.native
    
    /**
      * Requests an immediate render in a synchronous manner.
      */
    def renderSync(): Unit = js.native
    
    /**
      * Sets the layergroup of this map.
      */
    def setLayerGroup(layerGroup: typingsJapgolly.ol.layerGroupMod.default): Unit = js.native
    
    /**
      * Set the size of this map.
      */
    def setSize(): Unit = js.native
    def setSize(size: Size): Unit = js.native
    
    /**
      * Set the target element to render this map into.
      */
    def setTarget(): Unit = js.native
    def setTarget(target: String): Unit = js.native
    def setTarget(target: HTMLElement): Unit = js.native
    
    /**
      * Set the view for this map.
      */
    def setView(view: typingsJapgolly.ol.viewMod.default): Unit = js.native
    
    @JSName("un")
    def un_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_click(
      `type`: click,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_dblclick(
      `type`: dblclick,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_pointerdrag(
      `type`: pointerdrag,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_postcompose(
      `type`: postcompose,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): Unit = js.native
    @JSName("un")
    def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsJapgolly.ol.mapEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_precompose(
      `type`: precompose,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): Unit = js.native
    @JSName("un")
    def un_rendercomplete(
      `type`: rendercomplete,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.renderEventMod.default, Unit]
    ): Unit = js.native
    @JSName("un")
    def un_singleclick(
      `type`: singleclick,
      listener: js.Function1[/* evt */ typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    
    /**
      * Force a recalculation of the map viewport size.  This should be called when
      * third-party code changes the size of the map viewport.
      */
    def updateSize(): Unit = js.native
  }
  
  type PostRenderFunction = js.Function2[/* p0 */ PluggableMap, /* p1 */ FrameState, Any]
}
