package typingsJapgolly.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRobotApplicationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated robot application.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the robot application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the robot application.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The revision id of the robot application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The robot software suite (ROS distribution) used by the robot application.
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.native
  /**
    * The sources of the robot application.
    */
  var sources: js.UndefOr[Sources] = js.native
  /**
    * The version of the robot application.
    */
  var version: js.UndefOr[Version] = js.native
}

object UpdateRobotApplicationResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    lastUpdatedAt: js.Date = null,
    name: Name = null,
    revisionId: RevisionId = null,
    robotSoftwareSuite: RobotSoftwareSuite = null,
    sources: Sources = null,
    version: Version = null
  ): UpdateRobotApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (robotSoftwareSuite != null) __obj.updateDynamic("robotSoftwareSuite")(robotSoftwareSuite.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRobotApplicationResponse]
  }
}

