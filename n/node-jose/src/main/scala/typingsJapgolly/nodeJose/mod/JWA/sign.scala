package typingsJapgolly.nodeJose.mod.JWA

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWA.sign")
@js.native
object sign extends js.Object {
  def apply(alg: String, key: String, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def apply(alg: String, key: String, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
}

