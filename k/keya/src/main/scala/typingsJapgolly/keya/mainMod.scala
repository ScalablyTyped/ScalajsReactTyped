package typingsJapgolly.keya

import typingsJapgolly.keya.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/browser/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  def store(name: String): js.Promise[default | typingsJapgolly.keya.localhostMod.default] = js.native
  def stores(): js.Promise[js.Array[String]] = js.native
}

