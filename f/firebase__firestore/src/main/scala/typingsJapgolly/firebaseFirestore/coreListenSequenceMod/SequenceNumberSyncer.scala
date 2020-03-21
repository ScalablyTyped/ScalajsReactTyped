package typingsJapgolly.firebaseFirestore.coreListenSequenceMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceNumberSyncer extends js.Object {
  var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null
  def writeSequenceNumber(sequenceNumber: ListenSequenceNumber): Unit
}

object SequenceNumberSyncer {
  @scala.inline
  def apply(
    writeSequenceNumber: ListenSequenceNumber => Callback,
    sequenceNumberHandler: /* sequenceNumber */ ListenSequenceNumber => Callback = null
  ): SequenceNumberSyncer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("writeSequenceNumber")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber) => writeSequenceNumber(t0).runNow()))
    if (sequenceNumberHandler != null) __obj.updateDynamic("sequenceNumberHandler")(js.Any.fromFunction1((t0: /* sequenceNumber */ typingsJapgolly.firebaseFirestore.coreTypesMod.ListenSequenceNumber) => sequenceNumberHandler(t0).runNow()))
    __obj.asInstanceOf[SequenceNumberSyncer]
  }
}

