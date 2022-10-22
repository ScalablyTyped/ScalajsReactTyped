package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsNotFoundResultMod {
  
  @JSImport("inversify-express-utils/lib/results/NotFoundResult", "NotFoundResult")
  @js.native
  open class NotFoundResult ()
    extends StObject
       with IHttpActionResult {
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
}
