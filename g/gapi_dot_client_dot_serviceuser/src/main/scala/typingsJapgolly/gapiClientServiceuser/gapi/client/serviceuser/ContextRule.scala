package typingsJapgolly.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextRule extends js.Object {
  /** A list of full type names of provided contexts. */
  var provided: js.UndefOr[js.Array[String]] = js.undefined
  /** A list of full type names of requested contexts. */
  var requested: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}

object ContextRule {
  @scala.inline
  def apply(provided: js.Array[String] = null, requested: js.Array[String] = null, selector: String = null): ContextRule = {
    val __obj = js.Dynamic.literal()
    if (provided != null) __obj.updateDynamic("provided")(provided.asInstanceOf[js.Any])
    if (requested != null) __obj.updateDynamic("requested")(requested.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextRule]
  }
}

