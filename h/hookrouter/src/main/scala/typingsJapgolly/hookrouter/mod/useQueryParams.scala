package typingsJapgolly.hookrouter.mod

import typingsJapgolly.hookrouter.mod.HookRouter.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hookrouter", "useQueryParams")
@js.native
object useQueryParams extends js.Object {
  def apply(): js.Tuple2[
    QueryParams, 
    js.Function2[/* inObj */ QueryParams, /* replace */ js.UndefOr[Boolean], Unit]
  ] = js.native
}

