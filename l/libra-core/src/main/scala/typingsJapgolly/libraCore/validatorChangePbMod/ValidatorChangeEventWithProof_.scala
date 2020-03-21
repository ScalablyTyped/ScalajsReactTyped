package typingsJapgolly.libraCore.validatorChangePbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.eventsPbMod.EventWithProof
import typingsJapgolly.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
@js.native
class ValidatorChangeEventWithProof_ () extends Message {
  def clearEventWithProof(): Unit = js.native
  def clearLedgerInfoWithSigs(): Unit = js.native
  def getEventWithProof(): js.UndefOr[EventWithProof] = js.native
  def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
  def hasEventWithProof(): Boolean = js.native
  def hasLedgerInfoWithSigs(): Boolean = js.native
  def setEventWithProof(): Unit = js.native
  def setEventWithProof(value: EventWithProof): Unit = js.native
  def setLedgerInfoWithSigs(): Unit = js.native
  def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
}

