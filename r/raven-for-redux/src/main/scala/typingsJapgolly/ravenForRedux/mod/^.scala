package typingsJapgolly.ravenForRedux.mod

import typingsJapgolly.ravenJs.mod.RavenStatic
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven-for-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(raven: RavenStatic): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(raven: RavenStatic, options: RavenMiddlewareOptions[_]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

