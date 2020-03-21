package typingsJapgolly.reactFloater.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.popperJs.mod.Data
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactFloater.AnonOffset
import typingsJapgolly.reactFloater.PartialStyles
import typingsJapgolly.reactFloater.reactFloaterStrings.click
import typingsJapgolly.reactFloater.reactFloaterStrings.floater
import typingsJapgolly.reactFloater.reactFloaterStrings.hover
import typingsJapgolly.reactFloater.reactFloaterStrings.wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithContent extends Props {
  /**
    * The Floater content. It can be anything that can be rendered.
    * This is the only required props, unless you pass a component.
    */
  var content: Node
}

object PropsWithContent {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    callback: (/* action */ Action, /* props */ PropsWithComponent | PropsWithContent) => Callback = null,
    children: VdomNode = null,
    content: VdomNode = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableFlip: js.UndefOr[Boolean] = js.undefined,
    disableHoverToClick: js.UndefOr[Boolean] = js.undefined,
    event: click | hover = null,
    eventDelay: Int | Double = null,
    footer: VdomNode = null,
    getPopper: (/* popper */ Data, /* origin */ floater | wrapper) => Callback = null,
    hideArrow: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    offset: Int | Double = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: Modifiers = null,
    placement: Placement = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: PartialStyles = null,
    target: String | HTMLElement = null,
    title: VdomNode = null,
    wrapperOptions: AnonOffset = null
  ): PropsWithContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* action */ typingsJapgolly.reactFloater.mod.Action, t1: /* props */ typingsJapgolly.reactFloater.mod.PropsWithComponent | typingsJapgolly.reactFloater.mod.PropsWithContent) => callback(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFlip)) __obj.updateDynamic("disableFlip")(disableFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverToClick)) __obj.updateDynamic("disableHoverToClick")(disableHoverToClick.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventDelay != null) __obj.updateDynamic("eventDelay")(eventDelay.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (getPopper != null) __obj.updateDynamic("getPopper")(js.Any.fromFunction2((t0: /* popper */ typingsJapgolly.popperJs.mod.Data, t1: /* origin */ typingsJapgolly.reactFloater.reactFloaterStrings.floater | typingsJapgolly.reactFloater.reactFloaterStrings.wrapper) => getPopper(t0, t1).runNow()))
    if (!js.isUndefined(hideArrow)) __obj.updateDynamic("hideArrow")(hideArrow.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithContent]
  }
}

