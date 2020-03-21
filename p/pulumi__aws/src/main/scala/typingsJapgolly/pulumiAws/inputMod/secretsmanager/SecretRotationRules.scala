package typingsJapgolly.pulumiAws.inputMod.secretsmanager

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretRotationRules extends js.Object {
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret.
    */
  var automaticallyAfterDays: Input[Double] = js.native
}

object SecretRotationRules {
  @scala.inline
  def apply(automaticallyAfterDays: Input[Double]): SecretRotationRules = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecretRotationRules]
  }
}

