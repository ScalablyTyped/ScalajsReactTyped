package typingsJapgolly.chromeApps.chrome.events

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a declarative rule for handling events.
  * @template T Type for conditions array, default: any.
  * @template K Type for actions array, default: any.
  */
trait Rule[T /* <: js.Object */, K /* <: js.Object */] extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[K]
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[T]
  /** Identifier that allows referencing this rule.  */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Optional priority of this rule.
    * @default 100
    */
  var priority: js.UndefOr[integer] = js.undefined
  /**
    * Tags can be used to annotate rules and perform operations on sets of rules.
    * @since Chrome 28.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply[T /* <: js.Object */, K /* <: js.Object */](
    actions: js.Array[K],
    conditions: js.Array[T],
    id: String = null,
    priority: Int | Double = null,
    tags: js.Array[String] = null
  ): Rule[T, K] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule[T, K]]
  }
}

