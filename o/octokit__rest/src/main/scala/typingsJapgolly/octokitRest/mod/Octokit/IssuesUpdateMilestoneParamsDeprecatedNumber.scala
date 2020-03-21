package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.closed
import typingsJapgolly.octokitRest.octokitRestStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneParamsDeprecatedNumber extends js.Object {
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.undefined
  /**
    * @deprecated "number" parameter renamed to "milestone_number"
    */
  var number: Double
  var owner: String
  var repo: String
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  /**
    * The title of the milestone.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IssuesUpdateMilestoneParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: Double,
    owner: String,
    repo: String,
    description: String = null,
    due_on: String = null,
    state: open | closed = null,
    title: String = null
  ): IssuesUpdateMilestoneParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (due_on != null) __obj.updateDynamic("due_on")(due_on.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateMilestoneParamsDeprecatedNumber]
  }
}

