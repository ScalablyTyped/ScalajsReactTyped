package typingsJapgolly.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about the pipeline execution that is returned in the
  * long running operation&#39;s metadata field.
  */
@js.native
trait SchemaMetadata extends js.Object {
  /**
    * The time at which the operation was created by the API.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The time at which execution was completed and resources were cleaned up.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The list of events that have happened so far during the execution of this
    * operation.
    */
  var events: js.UndefOr[js.Array[SchemaEvent]] = js.native
  /**
    * The user-defined labels associated with this operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The pipeline this operation represents.
    */
  var pipeline: js.UndefOr[SchemaPipeline] = js.native
  /**
    * The first time at which resources were allocated to execute the pipeline.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    events: js.Array[SchemaEvent] = null,
    labels: StringDictionary[String] = null,
    pipeline: SchemaPipeline = null,
    startTime: String = null
  ): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
}

