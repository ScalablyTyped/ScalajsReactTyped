package typingsJapgolly.opticsAgent.mod

import typingsJapgolly.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", "koaMiddleware")
@js.native
object koaMiddleware extends js.Object {
  def apply(): js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Unit] = js.native
}

