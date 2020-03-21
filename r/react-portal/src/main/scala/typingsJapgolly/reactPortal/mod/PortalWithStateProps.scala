package typingsJapgolly.reactPortal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalWithStateProps
  extends Props[js.Any] {
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var node: js.UndefOr[Element | Null] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openByClickOn: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.undefined
  @JSName("children")
  def children_MPortalWithStateProps(params: PortalFunctionParams): Node
}

object PortalWithStateProps {
  @scala.inline
  def apply(
    children: PortalFunctionParams => CallbackTo[Node],
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    node: Element = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    openByClickOn: VdomElement = null,
    ref: LegacyRef[js.Any] = null
  ): PortalWithStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPortal.mod.PortalFunctionParams) => children(t0).runNow()))
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (openByClickOn != null) __obj.updateDynamic("openByClickOn")(openByClickOn.rawElement.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalWithStateProps]
  }
}

