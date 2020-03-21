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

trait Props extends js.Object {
  /**
    * Open the Floater automatically.
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * It will be called when the Floater change state
    */
  var callback: js.UndefOr[
    js.Function2[/* action */ Action, /* props */ PropsWithComponent | PropsWithContent, Unit]
  ] = js.undefined
  /**
    * An element to trigger the Floater.
    */
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Log some basic actions.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Animate the Floater on scroll/resize.
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable changes in the Floater position on scroll/resize.
    */
  var disableFlip: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't convert hover event to click on mobile.
    */
  var disableHoverToClick: js.UndefOr[Boolean] = js.undefined
  /**
    * The event that will trigger the Floater. It can be hover | click.
    * These won't work in controlled mode.
    */
  var event: js.UndefOr[click | hover] = js.undefined
  /**
    * The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding. Only valid for event type hover.
    */
  var eventDelay: js.UndefOr[Double] = js.undefined
  /**
    * It can be anything that can be rendered.
    */
  var footer: js.UndefOr[Node] = js.undefined
  /**
    * Get the popper.js instance
    */
  var getPopper: js.UndefOr[js.Function2[/* popper */ Data, /* origin */ floater | wrapper, Unit]] = js.undefined
  /**
    * Don't show the arrow. Useful for centered or modal layout.
    */
  var hideArrow: js.UndefOr[Boolean] = js.undefined
  /**
    * In case that you need to identify the portal.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * The distance between the Floater and its target in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Controlled mode.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize popper.js modifiers.
    */
  var options: js.UndefOr[Modifiers] = js.undefined
  /**
    * The placement of the Floater. It will update the position if there's no space available.
    */
  var placement: js.UndefOr[Placement] = js.undefined
  /**
    * It will show a ⨉ button to close the Floater.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Customize the default UI.
    */
  var styles: js.UndefOr[PartialStyles] = js.undefined
  /**
    * The target used to calculate the Floater position. If it's not set, it will use the `children` as the target.
    */
  var target: js.UndefOr[String | HTMLElement | Null] = js.undefined
  /**
    * It can be anything that can be rendered.
    */
  var title: js.UndefOr[Node] = js.undefined
  /**
    * Position the wrapper relative to the target.
    */
  var wrapperOptions: js.UndefOr[AnonOffset] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    callback: (/* action */ Action, /* props */ PropsWithComponent | PropsWithContent) => Callback = null,
    children: VdomNode = null,
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
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* action */ typingsJapgolly.reactFloater.mod.Action, t1: /* props */ typingsJapgolly.reactFloater.mod.PropsWithComponent | typingsJapgolly.reactFloater.mod.PropsWithContent) => callback(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Props]
  }
}

