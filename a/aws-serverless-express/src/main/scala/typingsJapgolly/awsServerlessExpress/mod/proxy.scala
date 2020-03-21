package typingsJapgolly.awsServerlessExpress.mod

import typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typingsJapgolly.awsLambda.handlerMod.Context
import typingsJapgolly.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy extends js.Object {
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context): Server = js.native
}

