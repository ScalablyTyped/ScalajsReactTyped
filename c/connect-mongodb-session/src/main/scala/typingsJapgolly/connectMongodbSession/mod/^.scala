package typingsJapgolly.connectMongodbSession.mod

import typingsJapgolly.connectMongodbSession.mod.connectMongodbSession.MongoDBStore
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongodb-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fn: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): MongoDBStore = js.native
}

