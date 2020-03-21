package typingsJapgolly.reactToolbox.listItemActionMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionProps extends js.Object {
  /**
    * List item action.
    */
  var action: js.UndefOr[Node] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemActionTheme] = js.undefined
}

object ListItemActionProps {
  @scala.inline
  def apply(action: VdomNode = null, theme: ListItemActionTheme = null): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawNode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemActionProps]
  }
}

