package typingsJapgolly.reactNativeReadMoreText.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadMoreProps extends js.Object {
  var children: Node
  var numberOfLines: Double
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderRevealedFooter(onPress: js.Function0[Unit]): Node
  def renderTruncatedFooter(onPress: js.Function0[Unit]): Node
}

object ReadMoreProps {
  @scala.inline
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => CallbackTo[Node],
    renderTruncatedFooter: js.Function0[Unit] => CallbackTo[Node],
    children: VdomNode = null,
    onReady: js.UndefOr[Callback] = js.undefined
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any])
    __obj.updateDynamic("renderRevealedFooter")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => renderRevealedFooter(t0).runNow()))
    __obj.updateDynamic("renderTruncatedFooter")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => renderTruncatedFooter(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    __obj.asInstanceOf[ReadMoreProps]
  }
}

