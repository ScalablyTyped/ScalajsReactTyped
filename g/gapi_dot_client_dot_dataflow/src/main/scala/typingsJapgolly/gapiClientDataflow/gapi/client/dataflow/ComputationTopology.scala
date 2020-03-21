package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputationTopology extends js.Object {
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.undefined
  /** The inputs to the computation. */
  var inputs: js.UndefOr[js.Array[StreamLocation]] = js.undefined
  /** The key ranges processed by the computation. */
  var keyRanges: js.UndefOr[js.Array[KeyRangeLocation]] = js.undefined
  /** The outputs from the computation. */
  var outputs: js.UndefOr[js.Array[StreamLocation]] = js.undefined
  /** The state family values. */
  var stateFamilies: js.UndefOr[js.Array[StateFamilyConfig]] = js.undefined
  /** The system stage name. */
  var systemStageName: js.UndefOr[String] = js.undefined
}

object ComputationTopology {
  @scala.inline
  def apply(
    computationId: String = null,
    inputs: js.Array[StreamLocation] = null,
    keyRanges: js.Array[KeyRangeLocation] = null,
    outputs: js.Array[StreamLocation] = null,
    stateFamilies: js.Array[StateFamilyConfig] = null,
    systemStageName: String = null
  ): ComputationTopology = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (keyRanges != null) __obj.updateDynamic("keyRanges")(keyRanges.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (stateFamilies != null) __obj.updateDynamic("stateFamilies")(stateFamilies.asInstanceOf[js.Any])
    if (systemStageName != null) __obj.updateDynamic("systemStageName")(systemStageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputationTopology]
  }
}

