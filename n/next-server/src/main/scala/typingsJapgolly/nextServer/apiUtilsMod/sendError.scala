package typingsJapgolly.nextServer.apiUtilsMod

import typingsJapgolly.nextServer.libUtilsMod.NextApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/api-utils", "sendError")
@js.native
object sendError extends js.Object {
  def apply(res: NextApiResponse[_], statusCode: Double, message: String): Unit = js.native
}

