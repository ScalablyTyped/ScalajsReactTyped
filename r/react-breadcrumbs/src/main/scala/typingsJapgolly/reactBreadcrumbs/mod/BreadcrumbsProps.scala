package typingsJapgolly.reactBreadcrumbs.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[Node] = js.undefined
  var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, Node]] = js.undefined
  var wrapper: js.UndefOr[StatelessComponent[js.Object] | ComponentClassP[js.Object]] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    separator: VdomNode = null,
    setCrumbs: /* crumbs */ Crumbs => CallbackTo[Node] = null,
    wrapper: StatelessComponent[js.Object] | ComponentClassP[js.Object] = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    if (setCrumbs != null) __obj.updateDynamic("setCrumbs")(js.Any.fromFunction1((t0: /* crumbs */ typingsJapgolly.reactBreadcrumbs.mod.Crumbs) => setCrumbs(t0).runNow()))
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

