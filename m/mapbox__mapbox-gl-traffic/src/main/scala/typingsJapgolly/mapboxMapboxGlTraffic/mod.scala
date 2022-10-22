package typingsJapgolly.mapboxMapboxGlTraffic

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.mapboxGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/mapbox-gl-traffic", JSImport.Namespace)
  @js.native
  /**
    * Create a new [Mapbox GL JS plugin](https://www.mapbox.com/blog/build-mapbox-gl-js-plugins/) that allows you to hide and show
    * traffic layers in your map and an optional toggle button.
    *
    * @param options - Options to configure the plugin.
    */
  open class ^ ()
    extends StObject
       with MapboxTraffic {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def _hasTraffic(): Boolean = js.native
    
    /* CompleteClass */
    override def _hideTraffic(): Unit = js.native
    
    /* CompleteClass */
    override def _showTraffic(): Unit = js.native
    
    /* CompleteClass */
    override def onAdd(map: Map): HTMLDivElement = js.native
    
    /* CompleteClass */
    override def onRemove(): Unit = js.native
    
    /* CompleteClass */
    override def render(): Unit = js.native
    
    /**
      * Toggle visibility of traffic layer.
      */
    /* CompleteClass */
    override def toggleTraffic(): Unit = js.native
  }
  
  trait MapboxTraffic extends StObject {
    
    def _hasTraffic(): Boolean
    
    def _hideTraffic(): Unit
    
    def _showTraffic(): Unit
    
    def onAdd(map: Map): HTMLDivElement
    
    def onRemove(): Unit
    
    def render(): Unit
    
    /**
      * Toggle visibility of traffic layer.
      */
    def toggleTraffic(): Unit
  }
  object MapboxTraffic {
    
    inline def apply(
      _hasTraffic: CallbackTo[Boolean],
      _hideTraffic: Callback,
      _showTraffic: Callback,
      onAdd: Map => HTMLDivElement,
      onRemove: Callback,
      render: Callback,
      toggleTraffic: Callback
    ): MapboxTraffic = {
      val __obj = js.Dynamic.literal(_hasTraffic = _hasTraffic.toJsFn, _hideTraffic = _hideTraffic.toJsFn, _showTraffic = _showTraffic.toJsFn, onAdd = js.Any.fromFunction1(onAdd), onRemove = onRemove.toJsFn, render = render.toJsFn, toggleTraffic = toggleTraffic.toJsFn)
      __obj.asInstanceOf[MapboxTraffic]
    }
    
    extension [Self <: MapboxTraffic](x: Self) {
      
      inline def setOnAdd(value: Map => HTMLDivElement): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
      
      inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
      
      inline def setToggleTraffic(value: Callback): Self = StObject.set(x, "toggleTraffic", value.toJsFn)
      
      inline def set_hasTraffic(value: CallbackTo[Boolean]): Self = StObject.set(x, "_hasTraffic", value.toJsFn)
      
      inline def set_hideTraffic(value: Callback): Self = StObject.set(x, "_hideTraffic", value.toJsFn)
      
      inline def set_showTraffic(value: Callback): Self = StObject.set(x, "_showTraffic", value.toJsFn)
    }
  }
  
  /** Options to configure the `MapboxTraffic` plugin. */
  trait Options extends StObject {
    
    /**
      * Show or hide traffic overlay by default.
      *
      * @default false
      */
    var showTraffic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show a toggle button to turn traffic on and off.
      *
      * @default true
      */
    var showTrafficButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The traffic source regex used to determine whether a layer displays traffic or not.
      *
      * @default /mapbox-traffic-v\d/
      */
    var trafficSource: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
      
      inline def setShowTrafficButton(value: Boolean): Self = StObject.set(x, "showTrafficButton", value.asInstanceOf[js.Any])
      
      inline def setShowTrafficButtonUndefined: Self = StObject.set(x, "showTrafficButton", js.undefined)
      
      inline def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
      
      inline def setTrafficSource(value: js.RegExp): Self = StObject.set(x, "trafficSource", value.asInstanceOf[js.Any])
      
      inline def setTrafficSourceUndefined: Self = StObject.set(x, "trafficSource", js.undefined)
    }
  }
}
