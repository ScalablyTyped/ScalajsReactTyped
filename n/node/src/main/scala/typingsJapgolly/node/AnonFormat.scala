package typingsJapgolly.node

import typingsJapgolly.node.cryptoMod.KeyFormat
import typingsJapgolly.node.nodeStrings.pkcs1
import typingsJapgolly.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF
  var `type`: pkcs1 | spki
}

object AnonFormat {
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: pkcs1 | spki): AnonFormat[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat[PubF]]
  }
}

