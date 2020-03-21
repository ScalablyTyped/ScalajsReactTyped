package typingsJapgolly.reactCollapse.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactCollapse.AnonCollapse
import typingsJapgolly.reactCollapse.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends AllHTMLAttributes[Collapse]
     with ClassAttributes[Collapse] {
  /** How often (in ms) the height of the content is checked. */
  var checkTimeout: js.UndefOr[Double] = js.undefined
  /** One or multiple children with static, variable or dynamic height. */
  @JSName("children")
  var children_CollapseProps: Node
  /** A way to control the initial element style. Will not be valid after the initial render */
  var initialStyle: js.UndefOr[AnonHeight] = js.undefined
  /** Expands or collapses content. */
  var isOpened: Boolean
  /** Callback function triggered when animation has completed */
  var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
  /** Callback function triggered when animation begins */
  var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
  /** It is possible to set className for extra div elements that ReactCollapse creates. */
  var theme: js.UndefOr[AnonCollapse] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    isOpened: Boolean,
    AllHTMLAttributes: AllHTMLAttributes[Collapse] = null,
    ClassAttributes: ClassAttributes[Collapse] = null,
    checkTimeout: Int | Double = null,
    children: VdomNode = null,
    initialStyle: AnonHeight = null,
    onRest: /* args */ CollapseCallbackArgs => Callback = null,
    onWork: /* args */ CollapseCallbackArgs => Callback = null,
    theme: AnonCollapse = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (checkTimeout != null) __obj.updateDynamic("checkTimeout")(checkTimeout.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialStyle != null) __obj.updateDynamic("initialStyle")(initialStyle.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactCollapse.mod.CollapseCallbackArgs) => onRest(t0).runNow()))
    if (onWork != null) __obj.updateDynamic("onWork")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactCollapse.mod.CollapseCallbackArgs) => onWork(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

