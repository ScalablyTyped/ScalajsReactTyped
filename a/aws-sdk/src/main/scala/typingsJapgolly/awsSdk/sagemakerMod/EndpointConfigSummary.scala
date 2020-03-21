package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigSummary extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigName = js.native
}

object EndpointConfigSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName
  ): EndpointConfigSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointConfigSummary]
  }
}

