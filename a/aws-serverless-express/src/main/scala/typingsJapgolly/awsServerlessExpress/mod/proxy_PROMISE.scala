package typingsJapgolly.awsServerlessExpress.mod

import typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typingsJapgolly.awsLambda.handlerMod.Context
import typingsJapgolly.awsServerlessExpress.awsServerlessExpressStrings.PROMISE
import typingsJapgolly.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy_PROMISE extends js.Object {
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: PROMISE): ProxyResult = js.native
}

