package typingsJapgolly.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryLoggingConfigResponse extends js.Object {
  /**
    * A complex type that contains information about the query logging configuration that you specified in a GetQueryLoggingConfig request.
    */
  var QueryLoggingConfig: typingsJapgolly.awsSdk.route53Mod.QueryLoggingConfig = js.native
}

object GetQueryLoggingConfigResponse {
  @scala.inline
  def apply(QueryLoggingConfig: QueryLoggingConfig): GetQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfig = QueryLoggingConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetQueryLoggingConfigResponse]
  }
}

