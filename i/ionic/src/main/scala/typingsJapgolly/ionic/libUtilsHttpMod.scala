package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.Progress
import typingsJapgolly.ionic.anon.`0`
import typingsJapgolly.ionic.definitionsMod.CreateRequestOptions
import typingsJapgolly.ionic.definitionsMod.HttpMethod
import typingsJapgolly.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsHttpMod {
  
  @JSImport("ionic/lib/utils/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/utils/http", "PROXY_ENVIRONMENT_VARIABLES")
  @js.native
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  
  inline def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRequest")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], hasProxySsl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`0`]]
  
  inline def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: Progress): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(req.asInstanceOf[js.Any], ws.asInstanceOf[js.Any], hasProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type SuperAgentRequest = typingsJapgolly.superagent.mod.SuperAgentRequest
}
