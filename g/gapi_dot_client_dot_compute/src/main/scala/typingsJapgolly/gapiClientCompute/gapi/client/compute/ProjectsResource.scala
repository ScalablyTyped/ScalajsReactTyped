package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonOauthtokenPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonOrderby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AnonAltFields): Request_[Operation]
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AnonAltFields): Request_[Operation]
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AnonAltFields): Request_[Operation]
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AnonAltFields): Request_[Operation]
  /** Returns the specified Project resource. */
  def get(request: AnonOauthtokenPrettyPrint): Request_[Project]
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: AnonOauthtokenPrettyPrint): Request_[Project]
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: AnonOrderby): Request_[ProjectsGetXpnResources]
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: AnonOrderby): Request_[XpnHostList]
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AnonAltFields): Request_[Operation]
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AnonAltFields): Request_[Operation]
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AnonAltFields): Request_[Operation]
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AnonAltFields): Request_[Operation]
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: AnonAltFields => CallbackTo[Request_[Operation]],
    disableXpnResource: AnonAltFields => CallbackTo[Request_[Operation]],
    enableXpnHost: AnonAltFields => CallbackTo[Request_[Operation]],
    enableXpnResource: AnonAltFields => CallbackTo[Request_[Operation]],
    get: AnonOauthtokenPrettyPrint => CallbackTo[Request_[Project]],
    getXpnHost: AnonOauthtokenPrettyPrint => CallbackTo[Request_[Project]],
    getXpnResources: AnonOrderby => CallbackTo[Request_[ProjectsGetXpnResources]],
    listXpnHosts: AnonOrderby => CallbackTo[Request_[XpnHostList]],
    moveDisk: AnonAltFields => CallbackTo[Request_[Operation]],
    moveInstance: AnonAltFields => CallbackTo[Request_[Operation]],
    setCommonInstanceMetadata: AnonAltFields => CallbackTo[Request_[Operation]],
    setUsageExportBucket: AnonAltFields => CallbackTo[Request_[Operation]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableXpnHost")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => disableXpnHost(t0).runNow()))
    __obj.updateDynamic("disableXpnResource")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => disableXpnResource(t0).runNow()))
    __obj.updateDynamic("enableXpnHost")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => enableXpnHost(t0).runNow()))
    __obj.updateDynamic("enableXpnResource")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => enableXpnResource(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOauthtokenPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("getXpnHost")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOauthtokenPrettyPrint) => getXpnHost(t0).runNow()))
    __obj.updateDynamic("getXpnResources")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOrderby) => getXpnResources(t0).runNow()))
    __obj.updateDynamic("listXpnHosts")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOrderby) => listXpnHosts(t0).runNow()))
    __obj.updateDynamic("moveDisk")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => moveDisk(t0).runNow()))
    __obj.updateDynamic("moveInstance")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => moveInstance(t0).runNow()))
    __obj.updateDynamic("setCommonInstanceMetadata")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => setCommonInstanceMetadata(t0).runNow()))
    __obj.updateDynamic("setUsageExportBucket")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => setUsageExportBucket(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

