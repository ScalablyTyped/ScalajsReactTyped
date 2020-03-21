package typingsJapgolly.ionicReact.ionTabsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typingsJapgolly.ionicCore.componentsMod.LocalJSX.IonTabs {
  var children: Node
}

object Props {
  @scala.inline
  def apply(
    children: VdomNode = null,
    onIonTabsDidChange: /* event */ CustomEvent => Callback = null,
    onIonTabsWillChange: /* event */ CustomEvent => Callback = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsDidChange(t0).runNow()))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonTabsWillChange(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

