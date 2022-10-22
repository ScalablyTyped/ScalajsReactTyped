package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.anon.ConfigEventEmitter
import typingsJapgolly.playable.distSrcModulesRootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesRootContainerRootContainerMod {
  
  @JSImport("playable/dist/src/modules/root-container/root-container", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RootContainer {
    def this(hasEventEmitterConfig: ConfigEventEmitter) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastFocusEnter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastFocusLeave: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastMouseEnter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastMouseLeave: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastMouseMove: Any = js.native
    
    /* private */ /* CompleteClass */
    var _disableFocusInterceptors: Any = js.native
    
    /* private */ /* CompleteClass */
    var _disengageFocusSource: Any = js.native
    
    /* private */ /* CompleteClass */
    var _disengageFocusWithin: Any = js.native
    
    /* private */ /* CompleteClass */
    var _elementQueries: Any = js.native
    
    /* private */ /* CompleteClass */
    var _enableFocusInterceptors: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onResized: Any = js.native
    
    /* private */ /* CompleteClass */
    var _resizeObserver: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* CompleteClass */
    override def appendComponentElement(element: HTMLElement): Unit = js.native
    
    /**
      * Method for attaching player node to your container
      *
      * @example
      * document.addEventListener('DOMContentLoaded', function() {
      *   const config = { src: 'http://my-url/video.mp4' }
      *   const player = Playable.create(config);
      *
      *   player.attachToElement(document.getElementById('content'));
      * });
      */
    /* CompleteClass */
    override def attachToElement(element: Element): Unit = js.native
    /* CompleteClass */
    override def attachToElement(element: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setFillAllSpace(flag: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setHeight(height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setRtl(rtl: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setWidth(width: Double): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typingsJapgolly.playable.distSrcModulesRootContainerRootContainerDotviewMod.default = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/root-container/root-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/root-container/root-container", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/root-container/root-container", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait RootContainer
    extends StObject
       with IRootContainer {
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _broadcastFocusEnter: Any
    
    /* private */ var _broadcastFocusLeave: Any
    
    /* private */ var _broadcastMouseEnter: Any
    
    /* private */ var _broadcastMouseLeave: Any
    
    /* private */ var _broadcastMouseMove: Any
    
    /* private */ var _disableFocusInterceptors: Any
    
    /* private */ var _disengageFocusSource: Any
    
    /* private */ var _disengageFocusWithin: Any
    
    /* private */ var _elementQueries: Any
    
    /* private */ var _enableFocusInterceptors: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _onResized: Any
    
    /* private */ var _resizeObserver: Any
    
    /* private */ var _unbindEvents: Any
    
    /**
      * Method for attaching player node to your container
      *
      * @example
      * document.addEventListener('DOMContentLoaded', function() {
      *   const config = { src: 'http://my-url/video.mp4' }
      *   const player = Playable.create(config);
      *
      *   player.attachToElement(document.getElementById('content'));
      * });
      */
    def attachToElement(element: Element): Unit
    
    var isHidden: Boolean
    
    var view: typingsJapgolly.playable.distSrcModulesRootContainerRootContainerDotviewMod.default
  }
  object RootContainer {
    
    inline def apply(
      _bindCallbacks: Any,
      _bindEvents: Any,
      _broadcastFocusEnter: Any,
      _broadcastFocusLeave: Any,
      _broadcastMouseEnter: Any,
      _broadcastMouseLeave: Any,
      _broadcastMouseMove: Any,
      _disableFocusInterceptors: Any,
      _disengageFocusSource: Any,
      _disengageFocusWithin: Any,
      _elementQueries: Any,
      _enableFocusInterceptors: Any,
      _eventEmitter: Any,
      _initUI: Any,
      _onResized: Any,
      _resizeObserver: Any,
      _unbindEvents: Any,
      appendComponentElement: HTMLElement => Callback,
      attachToElement: Element => Callback,
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      getHeight: CallbackTo[Double],
      getWidth: CallbackTo[Double],
      hide: Callback,
      isHidden: Boolean,
      setFillAllSpace: Boolean => Callback,
      setHeight: Double => Callback,
      setRtl: Boolean => Callback,
      setWidth: Double => Callback,
      show: Callback,
      view: typingsJapgolly.playable.distSrcModulesRootContainerRootContainerDotviewMod.default
    ): RootContainer = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _broadcastFocusEnter = _broadcastFocusEnter.asInstanceOf[js.Any], _broadcastFocusLeave = _broadcastFocusLeave.asInstanceOf[js.Any], _broadcastMouseEnter = _broadcastMouseEnter.asInstanceOf[js.Any], _broadcastMouseLeave = _broadcastMouseLeave.asInstanceOf[js.Any], _broadcastMouseMove = _broadcastMouseMove.asInstanceOf[js.Any], _disableFocusInterceptors = _disableFocusInterceptors.asInstanceOf[js.Any], _disengageFocusSource = _disengageFocusSource.asInstanceOf[js.Any], _disengageFocusWithin = _disengageFocusWithin.asInstanceOf[js.Any], _elementQueries = _elementQueries.asInstanceOf[js.Any], _enableFocusInterceptors = _enableFocusInterceptors.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _onResized = _onResized.asInstanceOf[js.Any], _resizeObserver = _resizeObserver.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], appendComponentElement = js.Any.fromFunction1((t0: HTMLElement) => appendComponentElement(t0).runNow()), attachToElement = js.Any.fromFunction1((t0: Element) => attachToElement(t0).runNow()), destroy = destroy.toJsFn, getElement = getElement.toJsFn, getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn, hide = hide.toJsFn, isHidden = isHidden.asInstanceOf[js.Any], setFillAllSpace = js.Any.fromFunction1((t0: Boolean) => setFillAllSpace(t0).runNow()), setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setRtl = js.Any.fromFunction1((t0: Boolean) => setRtl(t0).runNow()), setWidth = js.Any.fromFunction1((t0: Double) => setWidth(t0).runNow()), show = show.toJsFn, view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootContainer]
    }
    
    extension [Self <: RootContainer](x: Self) {
      
      inline def setAttachToElement(value: Element => Callback): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typingsJapgolly.playable.distSrcModulesRootContainerRootContainerDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_broadcastFocusEnter(value: Any): Self = StObject.set(x, "_broadcastFocusEnter", value.asInstanceOf[js.Any])
      
      inline def set_broadcastFocusLeave(value: Any): Self = StObject.set(x, "_broadcastFocusLeave", value.asInstanceOf[js.Any])
      
      inline def set_broadcastMouseEnter(value: Any): Self = StObject.set(x, "_broadcastMouseEnter", value.asInstanceOf[js.Any])
      
      inline def set_broadcastMouseLeave(value: Any): Self = StObject.set(x, "_broadcastMouseLeave", value.asInstanceOf[js.Any])
      
      inline def set_broadcastMouseMove(value: Any): Self = StObject.set(x, "_broadcastMouseMove", value.asInstanceOf[js.Any])
      
      inline def set_disableFocusInterceptors(value: Any): Self = StObject.set(x, "_disableFocusInterceptors", value.asInstanceOf[js.Any])
      
      inline def set_disengageFocusSource(value: Any): Self = StObject.set(x, "_disengageFocusSource", value.asInstanceOf[js.Any])
      
      inline def set_disengageFocusWithin(value: Any): Self = StObject.set(x, "_disengageFocusWithin", value.asInstanceOf[js.Any])
      
      inline def set_elementQueries(value: Any): Self = StObject.set(x, "_elementQueries", value.asInstanceOf[js.Any])
      
      inline def set_enableFocusInterceptors(value: Any): Self = StObject.set(x, "_enableFocusInterceptors", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_onResized(value: Any): Self = StObject.set(x, "_onResized", value.asInstanceOf[js.Any])
      
      inline def set_resizeObserver(value: Any): Self = StObject.set(x, "_resizeObserver", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
