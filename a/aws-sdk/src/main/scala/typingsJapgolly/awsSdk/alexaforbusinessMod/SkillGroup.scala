package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillGroup extends js.Object {
  /**
    * The description of a skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  /**
    * The ARN of a skill group.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a skill group.
    */
  var SkillGroupName: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.SkillGroupName] = js.native
}

object SkillGroup {
  @scala.inline
  def apply(
    Description: SkillGroupDescription = null,
    SkillGroupArn: Arn = null,
    SkillGroupName: SkillGroupName = null
  ): SkillGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    if (SkillGroupName != null) __obj.updateDynamic("SkillGroupName")(SkillGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillGroup]
  }
}

