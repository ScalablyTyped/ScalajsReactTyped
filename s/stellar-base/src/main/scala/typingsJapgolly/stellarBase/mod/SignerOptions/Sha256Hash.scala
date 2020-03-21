package typingsJapgolly.stellarBase.mod.SignerOptions

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha256Hash extends js.Object {
  var sha256Hash: Buffer | String
  var weight: js.UndefOr[Double | String] = js.undefined
}

object Sha256Hash {
  @scala.inline
  def apply(sha256Hash: Buffer | String, weight: Double | String = null): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
}

