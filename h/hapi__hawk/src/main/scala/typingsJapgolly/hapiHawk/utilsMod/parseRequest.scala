package typingsJapgolly.hapiHawk.utilsMod

import typingsJapgolly.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/utils", "parseRequest")
@js.native
object parseRequest extends js.Object {
  def apply(req: RequestOptions): CustomRequest = js.native
  def apply(req: RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
  def apply(req: typingsJapgolly.node.httpsMod.RequestOptions): CustomRequest = js.native
  def apply(req: typingsJapgolly.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
}

