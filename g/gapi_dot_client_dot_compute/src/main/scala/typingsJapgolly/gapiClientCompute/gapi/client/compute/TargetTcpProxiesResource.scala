package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetTcpProxy
import typingsJapgolly.gapiClientCompute.AnonTargetTcpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesResource extends js.Object {
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(request: AnonTargetTcpProxy): Request_[Operation]
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetTcpProxy): Request_[TargetTcpProxy]
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetTcpProxyList]
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: AnonTargetTcpProxy): Request_[Operation]
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: AnonTargetTcpProxy): Request_[Operation]
}

object TargetTcpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetTcpProxy => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserTargetTcpProxy => CallbackTo[Request_[TargetTcpProxy]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[TargetTcpProxyList]],
    setBackendService: AnonTargetTcpProxy => CallbackTo[Request_[Operation]],
    setProxyHeader: AnonTargetTcpProxy => CallbackTo[Request_[Operation]]
  ): TargetTcpProxiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetTcpProxy) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetTcpProxy) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setBackendService")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetTcpProxy) => setBackendService(t0).runNow()))
    __obj.updateDynamic("setProxyHeader")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetTcpProxy) => setProxyHeader(t0).runNow()))
    __obj.asInstanceOf[TargetTcpProxiesResource]
  }
}

