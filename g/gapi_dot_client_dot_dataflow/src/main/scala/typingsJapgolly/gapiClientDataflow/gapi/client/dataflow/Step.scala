package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /** The kind of step in the Cloud Dataflow job. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The name that identifies the step. This must be unique for each
    * step with respect to all other steps in the Cloud Dataflow job.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Named properties associated with the step. Each kind of
    * predefined step has its own required set of properties.
    * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
    */
  var properties: js.UndefOr[Record[String, _]] = js.undefined
}

object Step {
  @scala.inline
  def apply(kind: String = null, name: String = null, properties: Record[String, _] = null): Step = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

