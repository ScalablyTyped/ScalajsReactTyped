package typingsJapgolly.bip38.mod

import typingsJapgolly.bip38.AnonCompressed
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "decryptRaw")
@js.native
object decryptRaw extends js.Object {
  def apply(buffer: Buffer, passphrase: String): AnonCompressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): AnonCompressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): AnonCompressed = js.native
}

