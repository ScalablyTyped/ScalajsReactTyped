package typingsJapgolly.reactEasyCrop.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.`auto-cover`
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.`horizontal-cover`
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.`vertical-cover`
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.contain
import typingsJapgolly.reactEasyCrop.typesMod.Area
import typingsJapgolly.reactEasyCrop.typesMod.MediaSize
import typingsJapgolly.reactEasyCrop.typesMod.Size
import typingsJapgolly.reactEasyCrop.typesMod.VideoSrc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CropperProps1525444750[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def cropSize(value: Size): this.type = set("cropSize", value.asInstanceOf[js.Any])
  
  inline def disableAutomaticStylesInjection(value: Boolean): this.type = set("disableAutomaticStylesInjection", value.asInstanceOf[js.Any])
  
  inline def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
  
  inline def initialCroppedAreaPercentages(value: Area): this.type = set("initialCroppedAreaPercentages", value.asInstanceOf[js.Any])
  
  inline def initialCroppedAreaPixels(value: Area): this.type = set("initialCroppedAreaPixels", value.asInstanceOf[js.Any])
  
  inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
  
  inline def objectFit(value: contain | `horizontal-cover` | `vertical-cover` | `auto-cover`): this.type = set("objectFit", value.asInstanceOf[js.Any])
  
  inline def onCropAreaChange(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Callback): this.type = set("onCropAreaChange", js.Any.fromFunction2((t0: /* croppedArea */ Area, t1: /* croppedAreaPixels */ Area) => (value(t0, t1)).runNow()))
  
  inline def onCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Callback): this.type = set("onCropComplete", js.Any.fromFunction2((t0: /* croppedArea */ Area, t1: /* croppedAreaPixels */ Area) => (value(t0, t1)).runNow()))
  
  inline def onCropSizeChange(value: /* cropSize */ Size => Callback): this.type = set("onCropSizeChange", js.Any.fromFunction1((t0: /* cropSize */ Size) => value(t0).runNow()))
  
  inline def onInteractionEnd(value: Callback): this.type = set("onInteractionEnd", value.toJsFn)
  
  inline def onInteractionStart(value: Callback): this.type = set("onInteractionStart", value.toJsFn)
  
  inline def onMediaLoaded(value: /* mediaSize */ MediaSize => Callback): this.type = set("onMediaLoaded", js.Any.fromFunction1((t0: /* mediaSize */ MediaSize) => value(t0).runNow()))
  
  inline def onRotationChange(value: /* rotation */ Double => Callback): this.type = set("onRotationChange", js.Any.fromFunction1((t0: /* rotation */ Double) => value(t0).runNow()))
  
  inline def onTouchRequest(value: /* e */ ReactTouchEventFrom[HTMLDivElement] => Boolean): this.type = set("onTouchRequest", js.Any.fromFunction1(value))
  
  inline def onWheelRequest(value: /* e */ WheelEvent => Boolean): this.type = set("onWheelRequest", js.Any.fromFunction1(value))
  
  inline def onZoomChange(value: /* zoom */ Double => Callback): this.type = set("onZoomChange", js.Any.fromFunction1((t0: /* zoom */ Double) => value(t0).runNow()))
  
  inline def setCropSize(value: /* size */ Size => Callback): this.type = set("setCropSize", js.Any.fromFunction1((t0: /* size */ Size) => value(t0).runNow()))
  
  inline def setImageRef(value: /* ref */ RefHandle[HTMLImageElement] => Callback): this.type = set("setImageRef", js.Any.fromFunction1((t0: /* ref */ RefHandle[HTMLImageElement]) => value(t0).runNow()))
  
  inline def setMediaSize(value: /* size */ MediaSize => Callback): this.type = set("setMediaSize", js.Any.fromFunction1((t0: /* size */ MediaSize) => value(t0).runNow()))
  
  inline def setVideoRef(value: /* ref */ RefHandle[HTMLVideoElement] => Callback): this.type = set("setVideoRef", js.Any.fromFunction1((t0: /* ref */ RefHandle[HTMLVideoElement]) => value(t0).runNow()))
  
  inline def showGrid(value: Boolean): this.type = set("showGrid", value.asInstanceOf[js.Any])
  
  inline def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
  
  inline def video(value: String | js.Array[VideoSrc]): this.type = set("video", value.asInstanceOf[js.Any])
  
  inline def videoVarargs(value: VideoSrc*): this.type = set("video", js.Array(value*))
  
  inline def zoomWithScroll(value: Boolean): this.type = set("zoomWithScroll", value.asInstanceOf[js.Any])
}
