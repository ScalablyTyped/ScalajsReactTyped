package typingsJapgolly.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * Required. The ARN of the configuration.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[js.Date] = js.native
  /**
    * Required. The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[typingsJapgolly.awsSdk.mqMod.EngineType] = js.native
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Required. The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.native
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The list of all tags associated with this configuration.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object Configuration {
  @scala.inline
  def apply(
    Arn: string = null,
    Created: js.Date = null,
    Description: string = null,
    EngineType: EngineType = null,
    EngineVersion: string = null,
    Id: string = null,
    LatestRevision: ConfigurationRevision = null,
    Name: string = null,
    Tags: mapOfString = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

