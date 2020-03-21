package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-cancelled`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-cancelling`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-deleted`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-deleting`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-executing`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-failed`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-new`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-submitted`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-succeeded`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-timed-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`job-waiting`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobInfo
  extends Accessor
     with JSONSupport {
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: String = js.native
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting` = js.native
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.Array[GPMessage] = js.native
}

@JSGlobal("__esri.JobInfo")
@js.native
object JobInfo extends TopLevel[JobInfoConstructor]

