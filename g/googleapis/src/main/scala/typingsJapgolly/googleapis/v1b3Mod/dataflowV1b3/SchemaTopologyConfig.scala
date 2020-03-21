package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global topology of the streaming Dataflow job, including all computations
  * and their sharded locations.
  */
@js.native
trait SchemaTopologyConfig extends js.Object {
  /**
    * The computations associated with a streaming Dataflow job.
    */
  var computations: js.UndefOr[js.Array[SchemaComputationTopology]] = js.native
  /**
    * The disks assigned to a streaming Dataflow job.
    */
  var dataDiskAssignments: js.UndefOr[js.Array[SchemaDataDiskAssignment]] = js.native
  /**
    * The size (in bits) of keys that will be assigned to source messages.
    */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  /**
    * Version number for persistent state.
    */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  /**
    * Maps user stage names to stable computation names.
    */
  var userStageToComputationNameMap: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaTopologyConfig {
  @scala.inline
  def apply(
    computations: js.Array[SchemaComputationTopology] = null,
    dataDiskAssignments: js.Array[SchemaDataDiskAssignment] = null,
    forwardingKeyBits: Int | Double = null,
    persistentStateVersion: Int | Double = null,
    userStageToComputationNameMap: StringDictionary[String] = null
  ): SchemaTopologyConfig = {
    val __obj = js.Dynamic.literal()
    if (computations != null) __obj.updateDynamic("computations")(computations.asInstanceOf[js.Any])
    if (dataDiskAssignments != null) __obj.updateDynamic("dataDiskAssignments")(dataDiskAssignments.asInstanceOf[js.Any])
    if (forwardingKeyBits != null) __obj.updateDynamic("forwardingKeyBits")(forwardingKeyBits.asInstanceOf[js.Any])
    if (persistentStateVersion != null) __obj.updateDynamic("persistentStateVersion")(persistentStateVersion.asInstanceOf[js.Any])
    if (userStageToComputationNameMap != null) __obj.updateDynamic("userStageToComputationNameMap")(userStageToComputationNameMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTopologyConfig]
  }
}

