package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDataflow.AnonAlt
import typingsJapgolly.gapiClientDataflow.AnonFields
import typingsJapgolly.gapiClientDataflow.AnonFilter
import typingsJapgolly.gapiClientDataflow.AnonJobId
import typingsJapgolly.gapiClientDataflow.AnonKey
import typingsJapgolly.gapiClientDataflow.AnonLocation
import typingsJapgolly.gapiClientDataflow.AnonOauthtoken
import typingsJapgolly.gapiClientDataflow.AnonPp
import typingsJapgolly.gapiClientDataflow.AnonPrettyPrint
import typingsJapgolly.gapiClientDataflow.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: AnonFields): Request_[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: AnonKey): Request_[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: AnonPp): Request_[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: AnonJobId): Request_[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: AnonPrettyPrint): Request_[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: AnonLocation): Request_[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: AnonProjectId): Request_[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: AnonFields): Request_[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: AnonFilter): Request_[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: AnonAlt): Request_[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: AnonOauthtoken): Request_[Job] = js.native
}

