package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MediaStream
import typingsJapgolly.chrome.chrome.tabCapture.CaptureInfo
import typingsJapgolly.chrome.chrome.tabCapture.CaptureOptions
import typingsJapgolly.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typingsJapgolly.chrome.chrome.tabCapture.GetMediaStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftabCapture extends StObject {
  
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit
  
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit
  
  def getMediaStreamId(options: GetMediaStreamOptions, callback: js.Function1[/* streamId */ String, Unit]): Unit
  
  var onStatusChanged: CaptureStatusChangedEvent
}
object TypeoftabCapture {
  
  inline def apply(
    capture: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Callback,
    getCapturedTabs: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Callback,
    getMediaStreamId: (GetMediaStreamOptions, js.Function1[/* streamId */ String, Unit]) => Callback,
    onStatusChanged: CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2((t0: CaptureOptions, t1: js.Function1[/* stream */ MediaStream | Null, Unit]) => (capture(t0, t1)).runNow()), getCapturedTabs = js.Any.fromFunction1((t0: js.Function1[/* result */ js.Array[CaptureInfo], Unit]) => getCapturedTabs(t0).runNow()), getMediaStreamId = js.Any.fromFunction2((t0: GetMediaStreamOptions, t1: js.Function1[/* streamId */ String, Unit]) => (getMediaStreamId(t0, t1)).runNow()), onStatusChanged = onStatusChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftabCapture]
  }
  
  extension [Self <: TypeoftabCapture](x: Self) {
    
    inline def setCapture(value: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Callback): Self = StObject.set(x, "capture", js.Any.fromFunction2((t0: CaptureOptions, t1: js.Function1[/* stream */ MediaStream | Null, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetCapturedTabs(value: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Callback): Self = StObject.set(x, "getCapturedTabs", js.Any.fromFunction1((t0: js.Function1[/* result */ js.Array[CaptureInfo], Unit]) => value(t0).runNow()))
    
    inline def setGetMediaStreamId(value: (GetMediaStreamOptions, js.Function1[/* streamId */ String, Unit]) => Callback): Self = StObject.set(x, "getMediaStreamId", js.Any.fromFunction2((t0: GetMediaStreamOptions, t1: js.Function1[/* streamId */ String, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setOnStatusChanged(value: CaptureStatusChangedEvent): Self = StObject.set(x, "onStatusChanged", value.asInstanceOf[js.Any])
  }
}
