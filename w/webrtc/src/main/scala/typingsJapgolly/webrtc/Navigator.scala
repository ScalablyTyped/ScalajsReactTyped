package typingsJapgolly.webrtc

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("getUserMedia")
  var getUserMedia_Original: NavigatorGetUserMedia
  
  val mediaDevices: MediaDevices
  
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("mozGetUserMedia")
  var mozGetUserMedia_Original: NavigatorGetUserMedia
  
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("msGetUserMedia")
  var msGetUserMedia_Original: NavigatorGetUserMedia
  
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("webkitGetUserMedia")
  var webkitGetUserMedia_Original: NavigatorGetUserMedia
}
object Navigator {
  
  inline def apply(
    getUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback,
    mediaDevices: MediaDevices,
    mozGetUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback,
    msGetUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback,
    webkitGetUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback
  ): Navigator = {
    val __obj = js.Dynamic.literal(getUserMedia = js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (getUserMedia(t0, t1, t2)).runNow()), mediaDevices = mediaDevices.asInstanceOf[js.Any], mozGetUserMedia = js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (mozGetUserMedia(t0, t1, t2)).runNow()), msGetUserMedia = js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (msGetUserMedia(t0, t1, t2)).runNow()), webkitGetUserMedia = js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (webkitGetUserMedia(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback
    ): Self = StObject.set(x, "getUserMedia", js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setMediaDevices(value: MediaDevices): Self = StObject.set(x, "mediaDevices", value.asInstanceOf[js.Any])
    
    inline def setMozGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback
    ): Self = StObject.set(x, "mozGetUserMedia", js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setMsGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback
    ): Self = StObject.set(x, "msGetUserMedia", js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setWebkitGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Callback
    ): Self = StObject.set(x, "webkitGetUserMedia", js.Any.fromFunction3((t0: /* constraints */ MediaStreamConstraints, t1: /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], t2: /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
