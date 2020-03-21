package typingsJapgolly.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationResponse extends js.Object {
  /**
    * Required. The Amazon Resource Name (ARN) of the configuration.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[js.Date] = js.native
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.native
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[string] = js.native
}

object CreateConfigurationResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    Created: js.Date = null,
    Id: string = null,
    LatestRevision: ConfigurationRevision = null,
    Name: string = null
  ): CreateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationResponse]
  }
}

