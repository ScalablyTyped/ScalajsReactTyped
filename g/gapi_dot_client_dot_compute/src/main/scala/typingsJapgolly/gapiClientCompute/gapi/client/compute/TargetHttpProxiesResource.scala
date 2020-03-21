package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetHttpProxy
import typingsJapgolly.gapiClientCompute.AnonTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: AnonTargetHttpProxy): Request_[Operation]
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetHttpProxy): Request_[TargetHttpProxy]
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpProxyList]
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: AnonTargetHttpProxy): Request_[Operation]
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetHttpProxy => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserTargetHttpProxy => CallbackTo[Request_[TargetHttpProxy]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[TargetHttpProxyList]],
    setUrlMap: AnonTargetHttpProxy => CallbackTo[Request_[Operation]]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetHttpProxy) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetHttpProxy) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setUrlMap")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetHttpProxy) => setUrlMap(t0).runNow()))
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
}

