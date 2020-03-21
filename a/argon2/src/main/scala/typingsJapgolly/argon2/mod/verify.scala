package typingsJapgolly.argon2.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", "verify")
@js.native
object verify extends js.Object {
  def apply(hash: String, plain: String): js.Promise[Boolean] = js.native
  def apply(hash: String, plain: String, options: Options): js.Promise[Boolean] = js.native
  def apply(hash: String, plain: Buffer): js.Promise[Boolean] = js.native
  def apply(hash: String, plain: Buffer, options: Options): js.Promise[Boolean] = js.native
}

