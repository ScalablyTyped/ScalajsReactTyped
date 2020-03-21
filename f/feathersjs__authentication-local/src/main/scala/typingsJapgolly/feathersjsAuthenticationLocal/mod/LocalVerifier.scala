package typingsJapgolly.feathersjsAuthenticationLocal.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.feathersjsAuthenticationLocal.AnonMessage
import typingsJapgolly.feathersjsFeathers.mod.Application
import typingsJapgolly.feathersjsFeathers.mod.Paginated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-local", "LocalVerifier")
@js.native
class LocalVerifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
  def _comparePassword[T](entity: T, password: String): js.Promise[T] = js.native
   // compares password using bcrypt
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
   // normalizes result from service to account for pagination
  def verify(
    req: Request_[ParamsDictionary],
    username: String,
    password: String,
    done: js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[AnonMessage], 
      Unit
    ]
  ): Unit = js.native
}

