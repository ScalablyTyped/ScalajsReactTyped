package typingsJapgolly.jsonwebtokenPromisified.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", "verifyAsync")
@js.native
object verifyAsync extends js.Object {
  def apply(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Promise[js.Object | String] = js.native
}

