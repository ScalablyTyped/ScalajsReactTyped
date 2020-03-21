package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends OverlayTypeaheadProps {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var container: HTMLElement
  var referenceElement: js.UndefOr[HTMLElement] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    container: HTMLElement,
    align: TypeaheadAlign = null,
    children: VdomNode = null,
    className: String = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    onMenuHide: js.UndefOr[Callback] = js.undefined,
    onMenuShow: js.UndefOr[Callback] = js.undefined,
    onMenuToggle: /* show */ Boolean => Callback = null,
    referenceElement: HTMLElement = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    onMenuHide.foreach(p => __obj.updateDynamic("onMenuHide")(p.toJsFn))
    onMenuShow.foreach(p => __obj.updateDynamic("onMenuShow")(p.toJsFn))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1((t0: /* show */ scala.Boolean) => onMenuToggle(t0).runNow()))
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

