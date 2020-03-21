package typingsJapgolly.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunCommandParameters extends js.Object {
  /**
    * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds or a tag.
    */
  var RunCommandTargets: typingsJapgolly.awsSdk.eventbridgeMod.RunCommandTargets = js.native
}

object RunCommandParameters {
  @scala.inline
  def apply(RunCommandTargets: RunCommandTargets): RunCommandParameters = {
    val __obj = js.Dynamic.literal(RunCommandTargets = RunCommandTargets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunCommandParameters]
  }
}

