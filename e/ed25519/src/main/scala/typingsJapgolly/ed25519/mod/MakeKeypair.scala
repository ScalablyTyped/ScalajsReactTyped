package typingsJapgolly.ed25519.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed25519", "MakeKeypair")
@js.native
object MakeKeypair extends js.Object {
  def apply(seed: Buffer): CurveKeyPair = js.native
}

