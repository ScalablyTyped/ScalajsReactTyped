package typingsJapgolly.minimalRequestPromise.mod

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimal-request-promise", "put")
@js.native
object put extends js.Object {
  def apply(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  def apply(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
}

