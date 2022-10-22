package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.devtools.network.HARLog
import typingsJapgolly.chrome.chrome.devtools.network.NavigatedEvent
import typingsJapgolly.chrome.chrome.devtools.network.RequestFinishedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnetwork extends StObject {
  
  def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit
  
  var onNavigated: NavigatedEvent
  
  var onRequestFinished: RequestFinishedEvent
}
object Typeofnetwork {
  
  inline def apply(
    getHAR: js.Function1[/* harLog */ HARLog, Unit] => Callback,
    onNavigated: NavigatedEvent,
    onRequestFinished: RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1((t0: js.Function1[/* harLog */ HARLog, Unit]) => getHAR(t0).runNow()), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetwork]
  }
  
  extension [Self <: Typeofnetwork](x: Self) {
    
    inline def setGetHAR(value: js.Function1[/* harLog */ HARLog, Unit] => Callback): Self = StObject.set(x, "getHAR", js.Any.fromFunction1((t0: js.Function1[/* harLog */ HARLog, Unit]) => value(t0).runNow()))
    
    inline def setOnNavigated(value: NavigatedEvent): Self = StObject.set(x, "onNavigated", value.asInstanceOf[js.Any])
    
    inline def setOnRequestFinished(value: RequestFinishedEvent): Self = StObject.set(x, "onRequestFinished", value.asInstanceOf[js.Any])
  }
}
