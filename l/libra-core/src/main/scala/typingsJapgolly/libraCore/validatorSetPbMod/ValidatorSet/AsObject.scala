package typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var validatorPublicKeysList: js.Array[typingsJapgolly.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    validatorPublicKeysList: js.Array[typingsJapgolly.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(validatorPublicKeysList = validatorPublicKeysList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

