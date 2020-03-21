package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetHttpsProxy
import typingsJapgolly.gapiClientCompute.AnonTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: AnonTargetHttpsProxy): Request_[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetHttpsProxy): Request_[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: AnonTargetHttpsProxy): Request_[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: AnonTargetHttpsProxy): Request_[Operation]
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetHttpsProxy => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserTargetHttpsProxy => CallbackTo[Request_[TargetHttpsProxy]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[TargetHttpsProxyList]],
    setSslCertificates: AnonTargetHttpsProxy => CallbackTo[Request_[Operation]],
    setUrlMap: AnonTargetHttpsProxy => CallbackTo[Request_[Operation]]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetHttpsProxy) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetHttpsProxy) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setSslCertificates")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetHttpsProxy) => setSslCertificates(t0).runNow()))
    __obj.updateDynamic("setUrlMap")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetHttpsProxy) => setUrlMap(t0).runNow()))
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
}

