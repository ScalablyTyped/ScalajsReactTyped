package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactStrings.mount
import typingsJapgolly.react.reactStrings.update
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var id: String
  var onRender: ProfilerOnRenderCallback
}

object ProfilerProps {
  @scala.inline
  def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[SchedulerInteraction]) => Callback,
    children: VdomNode = null
  ): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("onRender")(js.Any.fromFunction7((t0: /* id */ java.lang.String, t1: /* phase */ typingsJapgolly.react.reactStrings.mount | typingsJapgolly.react.reactStrings.update, t2: /* actualDuration */ scala.Double, t3: /* baseDuration */ scala.Double, t4: /* startTime */ scala.Double, t5: /* commitTime */ scala.Double, t6: /* interactions */ typingsJapgolly.std.Set[typingsJapgolly.react.mod.SchedulerInteraction]) => onRender(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerProps]
  }
}

