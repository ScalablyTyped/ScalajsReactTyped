package typingsJapgolly.firebaseAuth

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPlatformBrowserLoadJsMod {
  
  @JSImport("@firebase/auth/dist/src/platform_browser/load_js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateCallbackName(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateCallbackName")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadJS(url: String): js.Promise[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("_loadJS")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Event]]
}
