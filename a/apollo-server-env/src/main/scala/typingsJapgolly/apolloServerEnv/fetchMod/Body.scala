package typingsJapgolly.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/fetch", "Body")
@js.native
class Body () extends js.Object {
  val bodyUsed: Boolean = js.native
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
}

