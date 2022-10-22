package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesRootContainerTypesMod {
  
  trait IRootContainer extends StObject {
    
    def appendComponentElement(element: HTMLElement): Unit
    
    def attachToElement(element: HTMLElement): Unit
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def getHeight(): Double
    
    def getWidth(): Double
    
    def hide(): Unit
    
    def setFillAllSpace(flag: Boolean): Unit
    
    def setHeight(height: Double): Unit
    
    def setRtl(rtl: Boolean): Unit
    
    def setWidth(width: Double): Unit
    
    def show(): Unit
  }
  object IRootContainer {
    
    inline def apply(
      appendComponentElement: HTMLElement => Callback,
      attachToElement: HTMLElement => Callback,
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      getHeight: CallbackTo[Double],
      getWidth: CallbackTo[Double],
      hide: Callback,
      setFillAllSpace: Boolean => Callback,
      setHeight: Double => Callback,
      setRtl: Boolean => Callback,
      setWidth: Double => Callback,
      show: Callback
    ): IRootContainer = {
      val __obj = js.Dynamic.literal(appendComponentElement = js.Any.fromFunction1((t0: HTMLElement) => appendComponentElement(t0).runNow()), attachToElement = js.Any.fromFunction1((t0: HTMLElement) => attachToElement(t0).runNow()), destroy = destroy.toJsFn, getElement = getElement.toJsFn, getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn, hide = hide.toJsFn, setFillAllSpace = js.Any.fromFunction1((t0: Boolean) => setFillAllSpace(t0).runNow()), setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setRtl = js.Any.fromFunction1((t0: Boolean) => setRtl(t0).runNow()), setWidth = js.Any.fromFunction1((t0: Double) => setWidth(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[IRootContainer]
    }
    
    extension [Self <: IRootContainer](x: Self) {
      
      inline def setAppendComponentElement(value: HTMLElement => Callback): Self = StObject.set(x, "appendComponentElement", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setAttachToElement(value: HTMLElement => Callback): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSetFillAllSpace(value: Boolean => Callback): Self = StObject.set(x, "setFillAllSpace", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetHeight(value: Double => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetRtl(value: Boolean => Callback): Self = StObject.set(x, "setRtl", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetWidth(value: Double => Callback): Self = StObject.set(x, "setWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IRootContainerAPI extends StObject {
    
    var attachToElement: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.undefined
    
    var getElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var getHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setFillAllSpace: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.undefined
    
    var setHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
    
    var setRtl: js.UndefOr[js.Function1[/* rtl */ Boolean, Unit]] = js.undefined
    
    var setWidth: js.UndefOr[js.Function1[/* width */ Double, Unit]] = js.undefined
    
    var show: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IRootContainerAPI {
    
    inline def apply(): IRootContainerAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRootContainerAPI]
    }
    
    extension [Self <: IRootContainerAPI](x: Self) {
      
      inline def setAttachToElement(value: /* element */ HTMLElement => Callback): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1((t0: /* element */ HTMLElement) => value(t0).runNow()))
      
      inline def setAttachToElementUndefined: Self = StObject.set(x, "attachToElement", js.undefined)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setSetFillAllSpace(value: /* flag */ Boolean => Callback): Self = StObject.set(x, "setFillAllSpace", js.Any.fromFunction1((t0: /* flag */ Boolean) => value(t0).runNow()))
      
      inline def setSetFillAllSpaceUndefined: Self = StObject.set(x, "setFillAllSpace", js.undefined)
      
      inline def setSetHeight(value: /* height */ Double => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: /* height */ Double) => value(t0).runNow()))
      
      inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      inline def setSetRtl(value: /* rtl */ Boolean => Callback): Self = StObject.set(x, "setRtl", js.Any.fromFunction1((t0: /* rtl */ Boolean) => value(t0).runNow()))
      
      inline def setSetRtlUndefined: Self = StObject.set(x, "setRtl", js.undefined)
      
      inline def setSetWidth(value: /* width */ Double => Callback): Self = StObject.set(x, "setWidth", js.Any.fromFunction1((t0: /* width */ Double) => value(t0).runNow()))
      
      inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  trait IRootContainerViewCallbacks extends StObject {
    
    def onMouseEnter(evt: Event): Unit
    @JSName("onMouseEnter")
    var onMouseEnter_Original: EventListener
    
    def onMouseLeave(evt: Event): Unit
    @JSName("onMouseLeave")
    var onMouseLeave_Original: EventListener
    
    def onMouseMove(evt: Event): Unit
    @JSName("onMouseMove")
    var onMouseMove_Original: EventListener
  }
  object IRootContainerViewCallbacks {
    
    inline def apply(
      onMouseEnter: /* evt */ Event => Callback,
      onMouseLeave: /* evt */ Event => Callback,
      onMouseMove: /* evt */ Event => Callback
    ): IRootContainerViewCallbacks = {
      val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction1((t0: /* evt */ Event) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: /* evt */ Event) => onMouseLeave(t0).runNow()), onMouseMove = js.Any.fromFunction1((t0: /* evt */ Event) => onMouseMove(t0).runNow()))
      __obj.asInstanceOf[IRootContainerViewCallbacks]
    }
    
    extension [Self <: IRootContainerViewCallbacks](x: Self) {
      
      inline def setOnMouseEnter(value: /* evt */ Event => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: /* evt */ Event => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnMouseMove(value: /* evt */ Event => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait IRootContainerViewConfig extends StObject {
    
    var callbacks: IRootContainerViewCallbacks
    
    var fillAllSpace: Boolean
    
    var height: Double
    
    var rtl: Boolean
    
    var width: Double
  }
  object IRootContainerViewConfig {
    
    inline def apply(
      callbacks: IRootContainerViewCallbacks,
      fillAllSpace: Boolean,
      height: Double,
      rtl: Boolean,
      width: Double
    ): IRootContainerViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRootContainerViewConfig]
    }
    
    extension [Self <: IRootContainerViewConfig](x: Self) {
      
      inline def setCallbacks(value: IRootContainerViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRootContainerViewStyles extends StObject {
    
    var container: String
    
    var fillAllSpace: String
    
    var fullScreen: String
    
    var hidden: String
    
    var rtl: Boolean
  }
  object IRootContainerViewStyles {
    
    inline def apply(container: String, fillAllSpace: String, fullScreen: String, hidden: String, rtl: Boolean): IRootContainerViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRootContainerViewStyles]
    }
    
    extension [Self <: IRootContainerViewStyles](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFillAllSpace(value: String): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      inline def setFullScreen(value: String): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    }
  }
}
