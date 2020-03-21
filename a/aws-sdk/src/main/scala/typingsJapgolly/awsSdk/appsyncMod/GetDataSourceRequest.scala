package typingsJapgolly.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSourceRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The name of the data source.
    */
  var name: ResourceName = js.native
}

object GetDataSourceRequest {
  @scala.inline
  def apply(apiId: String, name: ResourceName): GetDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDataSourceRequest]
  }
}

