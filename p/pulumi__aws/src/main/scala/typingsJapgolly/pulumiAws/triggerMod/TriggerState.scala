package typingsJapgolly.pulumiAws.triggerMod

import typingsJapgolly.pulumiAws.inputMod.codecommit.TriggerTrigger
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerState extends js.Object {
  val configurationId: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[Input[String]] = js.native
  val triggers: js.UndefOr[Input[js.Array[Input[TriggerTrigger]]]] = js.native
}

object TriggerState {
  @scala.inline
  def apply(
    configurationId: Input[String] = null,
    repositoryName: Input[String] = null,
    triggers: Input[js.Array[Input[TriggerTrigger]]] = null
  ): TriggerState = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerState]
  }
}

