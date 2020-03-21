package typingsJapgolly.reduxPersist.integrationReactMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reduxPersist.typesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see PersistGate */
trait PersistGateProps extends js.Object {
  var children: js.UndefOr[Node | (js.Function1[/* bootstrapped */ Boolean, Node])] = js.undefined
  var loading: js.UndefOr[Node] = js.undefined
  var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  var persistor: Persistor
}

object PersistGateProps {
  @scala.inline
  def apply(
    persistor: Persistor,
    children: Node | (js.Function1[/* bootstrapped */ Boolean, Node]) = null,
    loading: VdomNode = null,
    onBeforeLift: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined
  ): PersistGateProps = {
    val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.rawNode.asInstanceOf[js.Any])
    onBeforeLift.foreach(p => __obj.updateDynamic("onBeforeLift")(p.toJsFn))
    __obj.asInstanceOf[PersistGateProps]
  }
}

