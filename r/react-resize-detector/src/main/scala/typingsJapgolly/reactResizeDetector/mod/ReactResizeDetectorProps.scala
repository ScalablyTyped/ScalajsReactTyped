package typingsJapgolly.reactResizeDetector.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.reactResizeDetector.AnonLeading
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.debounce
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactResizeDetectorProps extends Props[ReactResizeDetector] {
  /**
    * Trigger onResize on height change.
    * Default: false
    */
  var handleHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Trigger onResize on width change.
    * Default: false
    */
  var handleWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * Valid only for a callback-pattern.
    * Ignored for other render types.
    * Set resize-detector's node type.
    * You can pass any valid React node: string with node's name or element.
    * Can be useful when you need to handle table's or paragraph's resizes.
    * Default: "div"
    */
  var nodeType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any
  ] = js.undefined
  /**
    * Function that will be invoked with width and height arguments.
    * Default: undefined
    */
  var onResize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
  /**
    * A selector of an element to observe.
    * You can use this property to attach resize-observer to any DOM element.
    * Please refer to the querySelector docs.
    * Default: undefined
    */
  var querySelector: js.UndefOr[String] = js.undefined
  /**
    * Possible values: "throttle" and "debounce".
    * See lodash docs for more information.
    * undefined - callback will be fired for every frame.
    * Default: undefined
    */
  var refreshMode: js.UndefOr[throttle | debounce] = js.undefined
  /**
    * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
    * Please refer to lodash's docs for more info.
    * Default: undefined
    */
  var refreshOptions: js.UndefOr[AnonLeading] = js.undefined
  /**
    * Use this in conjunction with refreshMode.
    * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
    * efault: 1000.
    */
  var refreshRate: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, Node]] = js.undefined
  /**
    * Do not trigger onResize when a component mounts.
    * Default: false
    */
  var skipOnMount: js.UndefOr[Boolean] = js.undefined
   // will be passed to React.createElement()
  /**
    * A DOM element to observe.
    * By default it's a parent element in relation to the ReactResizeDetector component.
    * But you can pass any DOM element to observe.
    * This property is omitted when you pass querySelector.
    * Default: undefined
    */
  var targetDomEl: js.UndefOr[HTMLElement] = js.undefined
}

object ReactResizeDetectorProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    handleHeight: js.UndefOr[Boolean] = js.undefined,
    handleWidth: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    nodeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any = null,
    onResize: (/* width */ Double, /* height */ Double) => Callback = null,
    querySelector: String = null,
    ref: LegacyRef[ReactResizeDetector] = null,
    refreshMode: throttle | debounce = null,
    refreshOptions: AnonLeading = null,
    refreshRate: Int | Double = null,
    render: /* props */ ReactResizeDetectorDimensions => CallbackTo[Node] = null,
    skipOnMount: js.UndefOr[Boolean] = js.undefined,
    targetDomEl: HTMLElement = null
  ): ReactResizeDetectorProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(handleHeight)) __obj.updateDynamic("handleHeight")(handleHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2((t0: /* width */ scala.Double, t1: /* height */ scala.Double) => onResize(t0, t1).runNow()))
    if (querySelector != null) __obj.updateDynamic("querySelector")(querySelector.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshOptions != null) __obj.updateDynamic("refreshOptions")(refreshOptions.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactResizeDetector.mod.ReactResizeDetectorDimensions) => render(t0).runNow()))
    if (!js.isUndefined(skipOnMount)) __obj.updateDynamic("skipOnMount")(skipOnMount.asInstanceOf[js.Any])
    if (targetDomEl != null) __obj.updateDynamic("targetDomEl")(targetDomEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactResizeDetectorProps]
  }
}

