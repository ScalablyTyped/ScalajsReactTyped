package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsCreatedNegotiatedContentResultMod {
  
  @JSImport("inversify-express-utils/lib/results/CreatedNegotiatedContentResult", "CreatedNegotiatedContentResult")
  @js.native
  open class CreatedNegotiatedContentResult[T] protected ()
    extends StObject
       with IHttpActionResult {
    def this(location: String, content: T) = this()
    def this(location: URL_, content: T) = this()
    
    /* private */ var content: Any = js.native
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    
    /* private */ var location: Any = js.native
  }
}
