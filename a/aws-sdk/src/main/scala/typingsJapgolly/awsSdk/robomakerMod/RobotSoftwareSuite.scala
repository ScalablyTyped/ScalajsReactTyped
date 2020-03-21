package typingsJapgolly.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotSoftwareSuite extends js.Object {
  /**
    * The name of the robot software suite (ROS distribution).
    */
  var name: js.UndefOr[RobotSoftwareSuiteType] = js.native
  /**
    * The version of the robot software suite (ROS distribution).
    */
  var version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.native
}

object RobotSoftwareSuite {
  @scala.inline
  def apply(name: RobotSoftwareSuiteType = null, version: RobotSoftwareSuiteVersionType = null): RobotSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotSoftwareSuite]
  }
}

