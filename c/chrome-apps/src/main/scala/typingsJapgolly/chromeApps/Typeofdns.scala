package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.dns.ResolveCallbackResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdns extends js.Object {
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(hostname: String, callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]): Unit
}

object Typeofdns {
  @scala.inline
  def apply(resolve: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Callback): Typeofdns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[
  /* resolveInfo */ typingsJapgolly.chromeApps.chrome.dns.ResolveCallbackResolveInfo, 
  scala.Unit]) => resolve(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofdns]
  }
}

