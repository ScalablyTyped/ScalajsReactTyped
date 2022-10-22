package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.system.network.NetworkInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnetwork extends StObject {
  
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit
}
object Typeofnetwork {
  
  inline def apply(
    getNetworkInterfaces: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Callback
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getNetworkInterfaces = js.Any.fromFunction1((t0: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]) => getNetworkInterfaces(t0).runNow()))
    __obj.asInstanceOf[Typeofnetwork]
  }
  
  extension [Self <: Typeofnetwork](x: Self) {
    
    inline def setGetNetworkInterfaces(value: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Callback): Self = StObject.set(x, "getNetworkInterfaces", js.Any.fromFunction1((t0: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]) => value(t0).runNow()))
  }
}
