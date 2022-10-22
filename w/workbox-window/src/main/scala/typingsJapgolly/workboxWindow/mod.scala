package typingsJapgolly.workboxWindow

import org.scalajs.dom.ServiceWorker
import typingsJapgolly.std.RegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-window", "Workbox")
  @js.native
  open class Workbox protected ()
    extends typingsJapgolly.workboxWindow.workboxMod.Workbox {
    def this(scriptURL: String) = this()
    def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  }
  
  inline def messageSW(sw: ServiceWorker, data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("messageSW")(sw.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
