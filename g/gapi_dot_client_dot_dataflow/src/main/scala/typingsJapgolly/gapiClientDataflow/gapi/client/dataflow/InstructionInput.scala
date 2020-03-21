package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstructionInput extends js.Object {
  /** The output index (origin zero) within the producer. */
  var outputNum: js.UndefOr[Double] = js.undefined
  /**
    * The index (origin zero) of the parallel instruction that produces
    * the output to be consumed by this input.  This index is relative
    * to the list of instructions in this input's instruction's
    * containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double] = js.undefined
}

object InstructionInput {
  @scala.inline
  def apply(outputNum: Int | Double = null, producerInstructionIndex: Int | Double = null): InstructionInput = {
    val __obj = js.Dynamic.literal()
    if (outputNum != null) __obj.updateDynamic("outputNum")(outputNum.asInstanceOf[js.Any])
    if (producerInstructionIndex != null) __obj.updateDynamic("producerInstructionIndex")(producerInstructionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionInput]
  }
}

