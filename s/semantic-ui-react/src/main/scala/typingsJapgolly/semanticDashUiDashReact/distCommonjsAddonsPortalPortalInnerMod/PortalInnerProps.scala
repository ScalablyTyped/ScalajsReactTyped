package typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalInnerProps
  extends StrictPortalInnerProps
     with /* key */ StringDictionary[js.Any]

object PortalInnerProps {
  @scala.inline
  def apply(
    children: VdomNode,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    innerRef: Ref = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback = null
  ): PortalInnerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps) => onMount(t0, t1).runNow()))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps) => onUnmount(t0, t1).runNow()))
    __obj.asInstanceOf[PortalInnerProps]
  }
}

