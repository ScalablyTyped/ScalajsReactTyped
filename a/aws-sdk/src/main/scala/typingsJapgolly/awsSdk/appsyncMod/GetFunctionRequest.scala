package typingsJapgolly.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String = js.native
  /**
    * The Function ID.
    */
  var functionId: ResourceName = js.native
}

object GetFunctionRequest {
  @scala.inline
  def apply(apiId: String, functionId: ResourceName): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFunctionRequest]
  }
}

