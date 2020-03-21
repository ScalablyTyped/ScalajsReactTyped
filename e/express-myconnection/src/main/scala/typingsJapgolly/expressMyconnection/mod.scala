package typingsJapgolly.expressMyconnection

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.mysql.mod.ConnectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-myconnection", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler[ParamsDictionary] = js.native
}

