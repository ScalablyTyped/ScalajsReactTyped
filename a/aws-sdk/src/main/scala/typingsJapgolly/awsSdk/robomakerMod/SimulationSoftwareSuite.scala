package typingsJapgolly.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationSoftwareSuite extends js.Object {
  /**
    * The name of the simulation software suite.
    */
  var name: js.UndefOr[SimulationSoftwareSuiteType] = js.native
  /**
    * The version of the simulation software suite.
    */
  var version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.native
}

object SimulationSoftwareSuite {
  @scala.inline
  def apply(name: SimulationSoftwareSuiteType = null, version: SimulationSoftwareSuiteVersionType = null): SimulationSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationSoftwareSuite]
  }
}

