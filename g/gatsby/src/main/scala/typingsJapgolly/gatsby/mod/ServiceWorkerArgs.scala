package typingsJapgolly.gatsby.mod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerArgs extends BrowserPluginArgs {
  var serviceWorker: ServiceWorkerRegistration
}

object ServiceWorkerArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    serviceWorker: ServiceWorkerRegistration
  ): ServiceWorkerArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], serviceWorker = serviceWorker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceWorkerArgs]
  }
}

