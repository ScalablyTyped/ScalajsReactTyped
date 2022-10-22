package typingsJapgolly.testcafe.mod.global

import japgolly.scalajs.react.Callback
import typingsJapgolly.testcafe.testcafeStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserConnection
  extends StObject
     with _BrowserOption {
  
  /**
    * Fires when a remote browser connects to the TestCafe server.
    */
  @JSName("once")
  def once_ready(event: ready, callback: js.Function): Unit
  
  /**
    * A URL that should be visited from a remote browser in order to connect it to the TestCafe server.
    */
  var url: String
}
object BrowserConnection {
  
  inline def apply(once: (ready, js.Function) => Callback, url: String): BrowserConnection = {
    val __obj = js.Dynamic.literal(once = js.Any.fromFunction2((t0: ready, t1: js.Function) => (once(t0, t1)).runNow()), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserConnection]
  }
  
  extension [Self <: BrowserConnection](x: Self) {
    
    inline def setOnce(value: (ready, js.Function) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: ready, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
