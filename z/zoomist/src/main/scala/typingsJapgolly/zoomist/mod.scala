package typingsJapgolly.zoomist

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.WheelEvent
import typingsJapgolly.zoomist.anon.ContainerData
import typingsJapgolly.zoomist.anon.Destroy
import typingsJapgolly.zoomist.anon.Drag
import typingsJapgolly.zoomist.anon.El
import typingsJapgolly.zoomist.anon.InEl
import typingsJapgolly.zoomist.anon.Left
import typingsJapgolly.zoomist.anon.Slider
import typingsJapgolly.zoomist.anon.Width
import typingsJapgolly.zoomist.anon.X
import typingsJapgolly.zoomist.zoomistBooleans.`false`
import typingsJapgolly.zoomist.zoomistStrings.auto
import typingsJapgolly.zoomist.zoomistStrings.contain
import typingsJapgolly.zoomist.zoomistStrings.cover
import typingsJapgolly.zoomist.zoomistStrings.destroy
import typingsJapgolly.zoomist.zoomistStrings.drag
import typingsJapgolly.zoomist.zoomistStrings.dragEnd
import typingsJapgolly.zoomist.zoomistStrings.dragStart
import typingsJapgolly.zoomist.zoomistStrings.none
import typingsJapgolly.zoomist.zoomistStrings.pinch
import typingsJapgolly.zoomist.zoomistStrings.pinchEnd
import typingsJapgolly.zoomist.zoomistStrings.pinchStart
import typingsJapgolly.zoomist.zoomistStrings.ready
import typingsJapgolly.zoomist.zoomistStrings.reset
import typingsJapgolly.zoomist.zoomistStrings.resize
import typingsJapgolly.zoomist.zoomistStrings.slide
import typingsJapgolly.zoomist.zoomistStrings.slideEnd
import typingsJapgolly.zoomist.zoomistStrings.slideStart
import typingsJapgolly.zoomist.zoomistStrings.update
import typingsJapgolly.zoomist.zoomistStrings.wheel
import typingsJapgolly.zoomist.zoomistStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zoomist", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Zoomist {
    def this(element: Element) = this()
    def this(element: Element, options: ZoomistOptions) = this()
  }
  
  @js.native
  trait Zoomist extends StObject {
    
    var __events__ : Destroy = js.native
    
    var __modules__ : Slider = js.native
    
    def create(url: String): Unit = js.native
    
    var data: ContainerData = js.native
    
    def destroy(): Unit = js.native
    
    var dragging: Boolean = js.native
    
    var element: HTMLElement = js.native
    
    /* Methods */
    def getContainerData(): Width = js.native
    
    def getImageData(): Left = js.native
    
    def getSliderValue(): Double = js.native
    
    def getZoomRation(): Double = js.native
    
    var image: HTMLImageElement = js.native
    
    def init(): Unit = js.native
    
    def mount(): Unit = js.native
    
    var mounted: Boolean = js.native
    
    def move(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def on(event: ready | update | destroy | resize | reset, handler: js.Function0[Unit]): Unit = js.native
    def on(event: pinch | pinchStart | pinchEnd, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
    def on(
      event: drag | dragEnd | dragStart | slide | slideEnd | slideStart,
      handler: js.Function2[(/* value */ Double) | (/* transform */ X), /* event */ Event, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_wheel(event: wheel, handler: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_zoom(event: zoom, handler: js.Function1[/* ratio */ Double, Unit]): Unit = js.native
    
    var options: ZoomistOptions = js.native
    
    var pinching: Boolean = js.native
    
    var ratio: Double = js.native
    
    def render(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def slideTo(value: Double, isOnlySlide: Boolean): Unit = js.native
    
    def update(): Unit = js.native
    
    var url: String = js.native
    
    var wheeling: Boolean = js.native
    
    var wrapper: HTMLDivElement = js.native
    
    def zoom(ratio: Double): Unit = js.native
    
    def zoomTo(ratio: Double): Unit = js.native
  }
  
  trait ZoomistOptions extends StObject {
    
    var bounds: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[cover | contain | none] = js.undefined
    
    var height: js.UndefOr[auto | (/* template literal string: ${number}% */ String) | Double | `false`] = js.undefined
    
    var maxRatio: js.UndefOr[Double | `false`] = js.undefined
    
    var on: js.UndefOr[Drag] = js.undefined
    
    var pinchable: js.UndefOr[Boolean] = js.undefined
    
    var slider: js.UndefOr[El] = js.undefined
    
    var src: js.UndefOr[String | HTMLImageElement] = js.undefined
    
    var wheelable: js.UndefOr[Boolean] = js.undefined
    
    var zoomRatio: js.UndefOr[Double] = js.undefined
    
    var zoomer: js.UndefOr[InEl] = js.undefined
  }
  object ZoomistOptions {
    
    inline def apply(): ZoomistOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomistOptions]
    }
    
    extension [Self <: ZoomistOptions](x: Self) {
      
      inline def setBounds(value: Boolean): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFill(value: cover | contain | none): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeight(value: auto | (/* template literal string: ${number}% */ String) | Double | `false`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxRatio(value: Double | `false`): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
      
      inline def setOn(value: Drag): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setPinchable(value: Boolean): Self = StObject.set(x, "pinchable", value.asInstanceOf[js.Any])
      
      inline def setPinchableUndefined: Self = StObject.set(x, "pinchable", js.undefined)
      
      inline def setSlider(value: El): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSrc(value: String | HTMLImageElement): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWheelable(value: Boolean): Self = StObject.set(x, "wheelable", value.asInstanceOf[js.Any])
      
      inline def setWheelableUndefined: Self = StObject.set(x, "wheelable", js.undefined)
      
      inline def setZoomRatio(value: Double): Self = StObject.set(x, "zoomRatio", value.asInstanceOf[js.Any])
      
      inline def setZoomRatioUndefined: Self = StObject.set(x, "zoomRatio", js.undefined)
      
      inline def setZoomer(value: InEl): Self = StObject.set(x, "zoomer", value.asInstanceOf[js.Any])
      
      inline def setZoomerUndefined: Self = StObject.set(x, "zoomer", js.undefined)
    }
  }
}
