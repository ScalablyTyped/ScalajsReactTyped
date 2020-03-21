package typingsJapgolly.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    Latest revision of the configuration.
    
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.native
  /**
    * 
    The name of the configuration.
    
    */
  var Name: js.UndefOr[string] = js.native
}

object CreateConfigurationResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    CreationTime: js.Date = null,
    LatestRevision: ConfigurationRevision = null,
    Name: string = null
  ): CreateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationResponse]
  }
}

