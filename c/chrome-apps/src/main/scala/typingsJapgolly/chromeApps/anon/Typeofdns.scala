package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.dns.ResolveCallbackResolveInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdns extends StObject {
  
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(hostname: String, callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]): Unit
}
object Typeofdns {
  
  inline def apply(resolve: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Callback): Typeofdns = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2((t0: String, t1: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => (resolve(t0, t1)).runNow()))
    __obj.asInstanceOf[Typeofdns]
  }
  
  extension [Self <: Typeofdns](x: Self) {
    
    inline def setResolve(value: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction2((t0: String, t1: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => (value(t0, t1)).runNow()))
  }
}
