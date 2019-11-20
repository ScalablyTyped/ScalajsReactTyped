package typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPortalInnerProps extends js.Object {
  /** Primary content. */
  var children: Node
  /** Called with a ref to the inner node. */
  var innerRef: js.UndefOr[Ref] = js.undefined
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.undefined
  /**
    * Called when the PortalInner is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
  /**
    * Called when the PortalInner is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
}

object StrictPortalInnerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    innerRef: Ref = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback = null
  ): StrictPortalInnerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps) => onMount(t0, t1).runNow()))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps) => onUnmount(t0, t1).runNow()))
    __obj.asInstanceOf[StrictPortalInnerProps]
  }
}

