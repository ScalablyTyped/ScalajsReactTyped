package typingsJapgolly.libraCore.validatorSetPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet")
@js.native
class ValidatorSet_ () extends Message {
  def addValidatorPublicKeys(): ValidatorPublicKeys = js.native
  def addValidatorPublicKeys(value: ValidatorPublicKeys): ValidatorPublicKeys = js.native
  def addValidatorPublicKeys(value: ValidatorPublicKeys, index: Double): ValidatorPublicKeys = js.native
  def clearValidatorPublicKeysList(): Unit = js.native
  def getValidatorPublicKeysList(): js.Array[ValidatorPublicKeys] = js.native
  def setValidatorPublicKeysList(value: js.Array[ValidatorPublicKeys]): Unit = js.native
}

