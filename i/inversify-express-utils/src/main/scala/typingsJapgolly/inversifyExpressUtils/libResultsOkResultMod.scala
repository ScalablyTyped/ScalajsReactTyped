package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.libInterfacesMod.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsOkResultMod {
  
  @JSImport("inversify-express-utils/lib/results/OkResult", "OkResult")
  @js.native
  open class OkResult ()
    extends StObject
       with IHttpActionResult {
    
    /* CompleteClass */
    override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
  }
}
