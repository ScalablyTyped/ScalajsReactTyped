package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CreateRequestOptions
import typingsJapgolly.ionic.definitionsMod.HttpMethod
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/http", JSImport.Namespace)
@js.native
object utilsHttpMod extends js.Object {
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[Anon0] = js.native
  def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: AnonProgress): js.Promise[Unit] = js.native
  type SuperAgentRequest = typingsJapgolly.superagent.mod.SuperAgentRequest
}

