package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsRedirectResultMod {
  
  @JSImport("inversify-express-utils/lib/results/RedirectResult", "RedirectResult")
  @js.native
  open class RedirectResult protected ()
    extends StObject
       with IHttpActionResult {
    def this(location: String) = this()
    def this(location: URL_) = this()
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ var location: Any = js.native
  }
}
