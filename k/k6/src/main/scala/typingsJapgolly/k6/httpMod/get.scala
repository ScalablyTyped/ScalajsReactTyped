package typingsJapgolly.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "get")
@js.native
object get extends js.Object {
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
}

