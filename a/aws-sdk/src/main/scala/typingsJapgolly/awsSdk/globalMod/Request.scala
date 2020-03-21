package typingsJapgolly.awsSdk.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/global", "Request")
@js.native
class Request[D, E] protected ()
  extends typingsJapgolly.awsSdk.coreMod.Request[D, E] {
  /**
    * Creates a request for an operation on a given service with a set of input parameters.
    *
    * @param {AWS.Service} service - The service to perform the operation on.
    * @param {string} operation - The operation to perform on the service.
    * @param {object} params - Parameters to send to the operation.
    */
  def this(service: typingsJapgolly.awsSdk.serviceMod.Service, operation: String) = this()
  def this(service: typingsJapgolly.awsSdk.serviceMod.Service, operation: String, params: js.Any) = this()
}

