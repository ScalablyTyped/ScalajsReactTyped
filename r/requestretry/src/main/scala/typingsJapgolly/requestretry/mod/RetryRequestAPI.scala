package typingsJapgolly.requestretry.mod

import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import typingsJapgolly.requestretry.AnonHTTPOrNetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
  var RetryStrategies: AnonHTTPOrNetworkError = js.native
}

