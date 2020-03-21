package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlResourceGroup extends js.Object {
  /**
  		 * Whether this source control resource group is hidden when it contains
  		 * no [source control resource states](#SourceControlResourceState).
  		 */
  var hideWhenEmpty: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The id of this source control resource group.
  		 */
  val id: String
  /**
  		 * The label of this source control resource group.
  		 */
  var label: String
  /**
  		 * This group's collection of
  		 * [source control resource states](#SourceControlResourceState).
  		 */
  var resourceStates: js.Array[SourceControlResourceState]
  /**
  		 * Dispose this source control resource group.
  		 */
  def dispose(): Unit
}

object SourceControlResourceGroup {
  @scala.inline
  def apply(
    dispose: Callback,
    id: String,
    label: String,
    resourceStates: js.Array[SourceControlResourceState],
    hideWhenEmpty: js.UndefOr[Boolean] = js.undefined
  ): SourceControlResourceGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], resourceStates = resourceStates.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    if (!js.isUndefined(hideWhenEmpty)) __obj.updateDynamic("hideWhenEmpty")(hideWhenEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceGroup]
  }
}

