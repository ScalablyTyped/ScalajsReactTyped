package typingsJapgolly.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsConfig extends js.Object {
  /**
    *  The group name of the logs in Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var groupName: js.UndefOr[String] = js.native
  /**
    * The current status of the logs in Amazon CloudWatch Logs for a build project. Valid values are:    ENABLED: Amazon CloudWatch Logs are enabled for this build project.    DISABLED: Amazon CloudWatch Logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType = js.native
  /**
    *  The prefix of the stream name of the Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var streamName: js.UndefOr[String] = js.native
}

object CloudWatchLogsConfig {
  @scala.inline
  def apply(status: LogsConfigStatusType, groupName: String = null, streamName: String = null): CloudWatchLogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (streamName != null) __obj.updateDynamic("streamName")(streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsConfig]
  }
}

