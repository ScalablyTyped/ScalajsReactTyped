package typingsJapgolly.blueprintjsCore.nonIdealStateMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INonIdealStateProps extends IProps {
  /** An action to resolve the non-ideal state which appears after `description`. */
  var action: js.UndefOr[Element] = js.undefined
  /**
    * Advanced usage: React `children` will appear last (after `action`).
    * Avoid passing raw strings as they will not receive margins and disrupt the layout flow.
    */
  var children: js.UndefOr[Node] = js.undefined
  /**
    * A longer description of the non-ideal state.
    * A string or number value will be wrapped in a `<div>` to preserve margins.
    */
  var description: js.UndefOr[ReactChild] = js.undefined
  /** The name of a Blueprint icon or a JSX Element (such as `<Spinner/>`) to render above the title. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** The title of the non-ideal state. */
  var title: js.UndefOr[Node] = js.undefined
}

object INonIdealStateProps {
  @scala.inline
  def apply(
    action: VdomElement = null,
    children: VdomNode = null,
    className: String = null,
    description: ReactChild = null,
    icon: IconName | MaybeElement = null,
    title: VdomNode = null
  ): INonIdealStateProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[INonIdealStateProps]
  }
}

