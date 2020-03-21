package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetSslProxy
import typingsJapgolly.gapiClientCompute.AnonTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: AnonTargetSslProxy): Request_[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetSslProxy): Request_[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: AnonTargetSslProxy): Request_[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: AnonTargetSslProxy): Request_[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: AnonTargetSslProxy): Request_[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetSslProxy => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserTargetSslProxy => CallbackTo[Request_[TargetSslProxy]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[TargetSslProxyList]],
    setBackendService: AnonTargetSslProxy => CallbackTo[Request_[Operation]],
    setProxyHeader: AnonTargetSslProxy => CallbackTo[Request_[Operation]],
    setSslCertificates: AnonTargetSslProxy => CallbackTo[Request_[Operation]]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetSslProxy) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetSslProxy) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setBackendService")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetSslProxy) => setBackendService(t0).runNow()))
    __obj.updateDynamic("setProxyHeader")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetSslProxy) => setProxyHeader(t0).runNow()))
    __obj.updateDynamic("setSslCertificates")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetSslProxy) => setSslCertificates(t0).runNow()))
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

