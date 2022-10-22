package typingsJapgolly.reactNative

import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventMap
  extends StObject
     with XMLHttpRequestEventTargetEventMap {
  
  var readystatechange: Event
}
object XMLHttpRequestEventMap {
  
  inline def apply(
    abort: ProgressEvent[EventTarget],
    error: ProgressEvent[EventTarget],
    load: ProgressEvent[EventTarget],
    loadend: ProgressEvent[EventTarget],
    loadstart: ProgressEvent[EventTarget],
    progress: ProgressEvent[EventTarget],
    readystatechange: Event,
    timeout: ProgressEvent[EventTarget]
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
  
  extension [Self <: XMLHttpRequestEventMap](x: Self) {
    
    inline def setReadystatechange(value: Event): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
  }
}
