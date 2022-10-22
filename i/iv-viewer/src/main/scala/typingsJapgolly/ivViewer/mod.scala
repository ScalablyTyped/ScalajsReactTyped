package typingsJapgolly.ivViewer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.ivViewer.anon.Container
import typingsJapgolly.ivViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iv-viewer", JSImport.Namespace)
  @js.native
  open class ^ () extends ImageViewer {
    def this(element: Element) = this()
    def this(element: Element, options: Options) = this()
    def this(element: Null, options: Options) = this()
  }
  @JSImport("iv-viewer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iv-viewer", "FullScreenViewer")
  @js.native
  open class FullScreenViewer () extends ImageViewer {
    def this(options: Options) = this()
    
    /* protected */ @JSName("_elements")
    var _elements_FullScreenViewer: FullScreenElements = js.native
    
    /* protected */ @JSName("_events")
    var _events_FullScreenViewer: FullScreenEvents = js.native
    
    /* protected */ def _initFullScreenEvents(): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(imageSrc: String): Unit = js.native
    def show(imageSrc: String, hiResImageSrc: String): Unit = js.native
  }
  
  @JSImport("iv-viewer", "ImageViewer")
  @js.native
  open class ImageViewer () extends StObject {
    def this(element: Element) = this()
    def this(element: Element, options: Options) = this()
    def this(element: Null, options: Options) = this()
    
    /* protected */ def _calculateDimensions(): Unit = js.native
    
    /* protected */ def _doubleTapToZoom(): Unit = js.native
    
    /* protected */ var _elements: Elements = js.native
    
    /* protected */ var _events: Events = js.native
    
    /* protected */ def _findContainerAndImageSrc(): Container = js.native
    /* protected */ def _findContainerAndImageSrc(element: String): Container = js.native
    /* protected */ def _findContainerAndImageSrc(element: Element): Container = js.native
    
    /* protected */ var _frames: Frames = js.native
    
    /* protected */ def _getImageCurrentDim(): Unit = js.native
    
    /* protected */ var _images: Images = js.native
    
    /* protected */ def _init(): Unit = js.native
    
    /* protected */ def _initDom(): Unit = js.native
    
    /* protected */ def _initEvents(): Unit = js.native
    
    /* protected */ def _initImageSlider(): Unit = js.native
    
    /* protected */ def _initSnapSlider(): Unit = js.native
    
    /* protected */ def _initZoomSlider(): Unit = js.native
    
    /* protected */ def _loadHighResImage(): Unit = js.native
    
    /* protected */ def _loadImages(): Unit = js.native
    
    /* protected */ var _options: Options = js.native
    
    /* protected */ def _pinchAndZoom(): Unit = js.native
    
    /* protected */ def _scrollZoom(): Unit = js.native
    
    /* protected */ var _sliders: Sliders = js.native
    
    /* protected */ def _snapViewEvents(): Unit = js.native
    
    /* protected */ var _state: State = js.native
    
    def destroy(): Unit = js.native
    
    def hideSnapView(): Unit = js.native
    
    def load(imageSrc: String): Unit = js.native
    def load(imageSrc: String, hiResImageSrc: String): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def resetZoom(): Unit = js.native
    def resetZoom(animate: Boolean): Unit = js.native
    
    def showSnapView(): Unit = js.native
    def showSnapView(noTimeout: Boolean): Unit = js.native
    
    def zoom(perc: Double): Unit = js.native
    def zoom(perc: Double, point: X): Unit = js.native
  }
  
  /* static member */
  @JSImport("iv-viewer", "defaults")
  @js.native
  def defaults: Options = js.native
  inline def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  trait Dim extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object Dim {
    
    inline def apply(h: Double, w: Double): Dim = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dim]
    }
    
    extension [Self <: Dim](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements extends StObject {
    
    var container: Element | Null
    
    var domElement: Element | Null
    
    var image: js.UndefOr[Element | Null] = js.undefined
    
    var imageWrap: js.UndefOr[Element | Null] = js.undefined
    
    var snapHandle: js.UndefOr[Element | Null] = js.undefined
    
    var snapImage: js.UndefOr[Element | Null] = js.undefined
    
    var snapImageWrap: js.UndefOr[Element | Null] = js.undefined
    
    var snapView: js.UndefOr[Element | Null] = js.undefined
    
    var zoomHandle: js.UndefOr[Element | Null] = js.undefined
  }
  object Elements {
    
    inline def apply(): Elements = {
      val __obj = js.Dynamic.literal(container = null, domElement = null)
      __obj.asInstanceOf[Elements]
    }
    
    extension [Self <: Elements](x: Self) {
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setDomElement(value: Element): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
      
      inline def setDomElementNull: Self = StObject.set(x, "domElement", null)
      
      inline def setImage(value: Element): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageWrap(value: Element): Self = StObject.set(x, "imageWrap", value.asInstanceOf[js.Any])
      
      inline def setImageWrapNull: Self = StObject.set(x, "imageWrap", null)
      
      inline def setImageWrapUndefined: Self = StObject.set(x, "imageWrap", js.undefined)
      
      inline def setSnapHandle(value: Element): Self = StObject.set(x, "snapHandle", value.asInstanceOf[js.Any])
      
      inline def setSnapHandleNull: Self = StObject.set(x, "snapHandle", null)
      
      inline def setSnapHandleUndefined: Self = StObject.set(x, "snapHandle", js.undefined)
      
      inline def setSnapImage(value: Element): Self = StObject.set(x, "snapImage", value.asInstanceOf[js.Any])
      
      inline def setSnapImageNull: Self = StObject.set(x, "snapImage", null)
      
      inline def setSnapImageUndefined: Self = StObject.set(x, "snapImage", js.undefined)
      
      inline def setSnapImageWrap(value: Element): Self = StObject.set(x, "snapImageWrap", value.asInstanceOf[js.Any])
      
      inline def setSnapImageWrapNull: Self = StObject.set(x, "snapImageWrap", null)
      
      inline def setSnapImageWrapUndefined: Self = StObject.set(x, "snapImageWrap", js.undefined)
      
      inline def setSnapView(value: Element): Self = StObject.set(x, "snapView", value.asInstanceOf[js.Any])
      
      inline def setSnapViewNull: Self = StObject.set(x, "snapView", null)
      
      inline def setSnapViewUndefined: Self = StObject.set(x, "snapView", js.undefined)
      
      inline def setZoomHandle(value: Element): Self = StObject.set(x, "zoomHandle", value.asInstanceOf[js.Any])
      
      inline def setZoomHandleNull: Self = StObject.set(x, "zoomHandle", null)
      
      inline def setZoomHandleUndefined: Self = StObject.set(x, "zoomHandle", js.undefined)
    }
  }
  
  trait Events extends StObject {
    
    var hiResImageLoad: js.UndefOr[IVEvent] = js.undefined
    
    var imageLoad: js.UndefOr[IVEvent] = js.undefined
    
    var mouseEnterSnapView: js.UndefOr[IVEvent] = js.undefined
    
    var mouseLeaveSnapView: js.UndefOr[IVEvent] = js.undefined
    
    var onWindowResize: js.UndefOr[IVEvent] = js.undefined
    
    var pinchStart: js.UndefOr[IVEvent] = js.undefined
    
    var snapViewOnMouseMove: js.UndefOr[IVEvent] = js.undefined
  }
  object Events {
    
    inline def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setHiResImageLoad(value: Callback): Self = StObject.set(x, "hiResImageLoad", value.toJsFn)
      
      inline def setHiResImageLoadUndefined: Self = StObject.set(x, "hiResImageLoad", js.undefined)
      
      inline def setImageLoad(value: Callback): Self = StObject.set(x, "imageLoad", value.toJsFn)
      
      inline def setImageLoadUndefined: Self = StObject.set(x, "imageLoad", js.undefined)
      
      inline def setMouseEnterSnapView(value: Callback): Self = StObject.set(x, "mouseEnterSnapView", value.toJsFn)
      
      inline def setMouseEnterSnapViewUndefined: Self = StObject.set(x, "mouseEnterSnapView", js.undefined)
      
      inline def setMouseLeaveSnapView(value: Callback): Self = StObject.set(x, "mouseLeaveSnapView", value.toJsFn)
      
      inline def setMouseLeaveSnapViewUndefined: Self = StObject.set(x, "mouseLeaveSnapView", js.undefined)
      
      inline def setOnWindowResize(value: Callback): Self = StObject.set(x, "onWindowResize", value.toJsFn)
      
      inline def setOnWindowResizeUndefined: Self = StObject.set(x, "onWindowResize", js.undefined)
      
      inline def setPinchStart(value: Callback): Self = StObject.set(x, "pinchStart", value.toJsFn)
      
      inline def setPinchStartUndefined: Self = StObject.set(x, "pinchStart", js.undefined)
      
      inline def setSnapViewOnMouseMove(value: Callback): Self = StObject.set(x, "snapViewOnMouseMove", value.toJsFn)
      
      inline def setSnapViewOnMouseMoveUndefined: Self = StObject.set(x, "snapViewOnMouseMove", js.undefined)
    }
  }
  
  trait Frames extends StObject {
    
    var slideMomentumCheck: js.UndefOr[Double] = js.undefined
    
    var sliderMomentumFrame: js.UndefOr[Double] = js.undefined
    
    var snapViewTimeout: js.UndefOr[Double] = js.undefined
    
    var zoomFrame: js.UndefOr[Double] = js.undefined
  }
  object Frames {
    
    inline def apply(): Frames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Frames]
    }
    
    extension [Self <: Frames](x: Self) {
      
      inline def setSlideMomentumCheck(value: Double): Self = StObject.set(x, "slideMomentumCheck", value.asInstanceOf[js.Any])
      
      inline def setSlideMomentumCheckUndefined: Self = StObject.set(x, "slideMomentumCheck", js.undefined)
      
      inline def setSliderMomentumFrame(value: Double): Self = StObject.set(x, "sliderMomentumFrame", value.asInstanceOf[js.Any])
      
      inline def setSliderMomentumFrameUndefined: Self = StObject.set(x, "sliderMomentumFrame", js.undefined)
      
      inline def setSnapViewTimeout(value: Double): Self = StObject.set(x, "snapViewTimeout", value.asInstanceOf[js.Any])
      
      inline def setSnapViewTimeoutUndefined: Self = StObject.set(x, "snapViewTimeout", js.undefined)
      
      inline def setZoomFrame(value: Double): Self = StObject.set(x, "zoomFrame", value.asInstanceOf[js.Any])
      
      inline def setZoomFrameUndefined: Self = StObject.set(x, "zoomFrame", js.undefined)
    }
  }
  
  trait FullScreenElements
    extends StObject
       with Elements {
    
    var fullScreen: Element | Null
  }
  object FullScreenElements {
    
    inline def apply(): FullScreenElements = {
      val __obj = js.Dynamic.literal(container = null, domElement = null, fullScreen = null)
      __obj.asInstanceOf[FullScreenElements]
    }
    
    extension [Self <: FullScreenElements](x: Self) {
      
      inline def setFullScreen(value: Element): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenNull: Self = StObject.set(x, "fullScreen", null)
    }
  }
  
  trait FullScreenEvents
    extends StObject
       with Events {
    
    var onCloseBtnClick: js.UndefOr[IVEvent] = js.undefined
  }
  object FullScreenEvents {
    
    inline def apply(): FullScreenEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullScreenEvents]
    }
    
    extension [Self <: FullScreenEvents](x: Self) {
      
      inline def setOnCloseBtnClick(value: Callback): Self = StObject.set(x, "onCloseBtnClick", value.toJsFn)
      
      inline def setOnCloseBtnClickUndefined: Self = StObject.set(x, "onCloseBtnClick", js.undefined)
    }
  }
  
  type IVEvent = js.Function0[Unit]
  
  type IVImage = String | Null
  
  trait Images extends StObject {
    
    var hiResImageSrc: IVImage
    
    var imageSrc: IVImage
  }
  object Images {
    
    inline def apply(): Images = {
      val __obj = js.Dynamic.literal(hiResImageSrc = null, imageSrc = null)
      __obj.asInstanceOf[Images]
    }
    
    extension [Self <: Images](x: Self) {
      
      inline def setHiResImageSrc(value: IVImage): Self = StObject.set(x, "hiResImageSrc", value.asInstanceOf[js.Any])
      
      inline def setHiResImageSrcNull: Self = StObject.set(x, "hiResImageSrc", null)
      
      inline def setImageSrc(value: IVImage): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setImageSrcNull: Self = StObject.set(x, "imageSrc", null)
    }
  }
  
  trait Options extends StObject {
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var refreshOnResize: js.UndefOr[Boolean] = js.undefined
    
    var snapView: js.UndefOr[Boolean] = js.undefined
    
    var zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined
    
    var zoomValue: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
      
      inline def setRefreshOnResizeUndefined: Self = StObject.set(x, "refreshOnResize", js.undefined)
      
      inline def setSnapView(value: Boolean): Self = StObject.set(x, "snapView", value.asInstanceOf[js.Any])
      
      inline def setSnapViewUndefined: Self = StObject.set(x, "snapView", js.undefined)
      
      inline def setZoomOnMouseWheel(value: Boolean): Self = StObject.set(x, "zoomOnMouseWheel", value.asInstanceOf[js.Any])
      
      inline def setZoomOnMouseWheelUndefined: Self = StObject.set(x, "zoomOnMouseWheel", js.undefined)
      
      inline def setZoomValue(value: Double): Self = StObject.set(x, "zoomValue", value.asInstanceOf[js.Any])
      
      inline def setZoomValueUndefined: Self = StObject.set(x, "zoomValue", js.undefined)
    }
  }
  
  trait Slider extends StObject {
    
    var container: Element | Null
    
    def destroy(): Unit
    
    def endHandler(): Unit
    
    def init(): Unit
    
    def isSliderEnabled(): Boolean
    
    def moveHandler(event: Event): Unit
    
    def onEnd(): Unit
    
    def onMove(): Unit
    
    def onStart(): Unit
    
    def removeListeners(): Unit
    
    def startHandler(event: Event): Unit
  }
  object Slider {
    
    inline def apply(
      destroy: Callback,
      endHandler: Callback,
      init: Callback,
      isSliderEnabled: CallbackTo[Boolean],
      moveHandler: Event => Callback,
      onEnd: Callback,
      onMove: Callback,
      onStart: Callback,
      removeListeners: Callback,
      startHandler: Event => Callback
    ): Slider = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, endHandler = endHandler.toJsFn, init = init.toJsFn, isSliderEnabled = isSliderEnabled.toJsFn, moveHandler = js.Any.fromFunction1((t0: Event) => moveHandler(t0).runNow()), onEnd = onEnd.toJsFn, onMove = onMove.toJsFn, onStart = onStart.toJsFn, removeListeners = removeListeners.toJsFn, startHandler = js.Any.fromFunction1((t0: Event) => startHandler(t0).runNow()), container = null)
      __obj.asInstanceOf[Slider]
    }
    
    extension [Self <: Slider](x: Self) {
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setEndHandler(value: Callback): Self = StObject.set(x, "endHandler", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setIsSliderEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSliderEnabled", value.toJsFn)
      
      inline def setMoveHandler(value: Event => Callback): Self = StObject.set(x, "moveHandler", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnMove(value: Callback): Self = StObject.set(x, "onMove", value.toJsFn)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setRemoveListeners(value: Callback): Self = StObject.set(x, "removeListeners", value.toJsFn)
      
      inline def setStartHandler(value: Event => Callback): Self = StObject.set(x, "startHandler", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    }
  }
  
  trait SliderOptions extends StObject {
    
    def isSliderEnabled(): Boolean
    
    def onEnd(): Unit
    
    def onMove(): Unit
    
    def onStart(): Unit
  }
  object SliderOptions {
    
    inline def apply(isSliderEnabled: CallbackTo[Boolean], onEnd: Callback, onMove: Callback, onStart: Callback): SliderOptions = {
      val __obj = js.Dynamic.literal(isSliderEnabled = isSliderEnabled.toJsFn, onEnd = onEnd.toJsFn, onMove = onMove.toJsFn, onStart = onStart.toJsFn)
      __obj.asInstanceOf[SliderOptions]
    }
    
    extension [Self <: SliderOptions](x: Self) {
      
      inline def setIsSliderEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSliderEnabled", value.toJsFn)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnMove(value: Callback): Self = StObject.set(x, "onMove", value.toJsFn)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
    }
  }
  
  trait Sliders extends StObject {
    
    var imageSlider: js.UndefOr[Slider] = js.undefined
    
    var snapSlider: js.UndefOr[Slider] = js.undefined
    
    var zoomSlider: js.UndefOr[Slider] = js.undefined
  }
  object Sliders {
    
    inline def apply(): Sliders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sliders]
    }
    
    extension [Self <: Sliders](x: Self) {
      
      inline def setImageSlider(value: Slider): Self = StObject.set(x, "imageSlider", value.asInstanceOf[js.Any])
      
      inline def setImageSliderUndefined: Self = StObject.set(x, "imageSlider", js.undefined)
      
      inline def setSnapSlider(value: Slider): Self = StObject.set(x, "snapSlider", value.asInstanceOf[js.Any])
      
      inline def setSnapSliderUndefined: Self = StObject.set(x, "snapSlider", js.undefined)
      
      inline def setZoomSlider(value: Slider): Self = StObject.set(x, "zoomSlider", value.asInstanceOf[js.Any])
      
      inline def setZoomSliderUndefined: Self = StObject.set(x, "zoomSlider", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var containerDim: js.UndefOr[Dim] = js.undefined
    
    var imageDim: js.UndefOr[Dim] = js.undefined
    
    var loaded: js.UndefOr[Boolean] = js.undefined
    
    var snapHandleDim: js.UndefOr[Dim] = js.undefined
    
    var snapImageDim: js.UndefOr[Dim] = js.undefined
    
    var snapViewVisible: js.UndefOr[Boolean] = js.undefined
    
    var zoomSliderLength: js.UndefOr[Double] = js.undefined
    
    var zoomValue: js.UndefOr[Double] = js.undefined
    
    var zooming: js.UndefOr[Boolean] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setContainerDim(value: Dim): Self = StObject.set(x, "containerDim", value.asInstanceOf[js.Any])
      
      inline def setContainerDimUndefined: Self = StObject.set(x, "containerDim", js.undefined)
      
      inline def setImageDim(value: Dim): Self = StObject.set(x, "imageDim", value.asInstanceOf[js.Any])
      
      inline def setImageDimUndefined: Self = StObject.set(x, "imageDim", js.undefined)
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setSnapHandleDim(value: Dim): Self = StObject.set(x, "snapHandleDim", value.asInstanceOf[js.Any])
      
      inline def setSnapHandleDimUndefined: Self = StObject.set(x, "snapHandleDim", js.undefined)
      
      inline def setSnapImageDim(value: Dim): Self = StObject.set(x, "snapImageDim", value.asInstanceOf[js.Any])
      
      inline def setSnapImageDimUndefined: Self = StObject.set(x, "snapImageDim", js.undefined)
      
      inline def setSnapViewVisible(value: Boolean): Self = StObject.set(x, "snapViewVisible", value.asInstanceOf[js.Any])
      
      inline def setSnapViewVisibleUndefined: Self = StObject.set(x, "snapViewVisible", js.undefined)
      
      inline def setZoomSliderLength(value: Double): Self = StObject.set(x, "zoomSliderLength", value.asInstanceOf[js.Any])
      
      inline def setZoomSliderLengthUndefined: Self = StObject.set(x, "zoomSliderLength", js.undefined)
      
      inline def setZoomValue(value: Double): Self = StObject.set(x, "zoomValue", value.asInstanceOf[js.Any])
      
      inline def setZoomValueUndefined: Self = StObject.set(x, "zoomValue", js.undefined)
      
      inline def setZooming(value: Boolean): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
}
