package typingsJapgolly.styledReactModal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var allowScroll: js.UndefOr[Boolean] = js.undefined
  var backgroundProps: js.UndefOr[js.Object] = js.undefined
  var beforeClose: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
  var beforeOpen: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var isOpen: Boolean
  var onBackgroundClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    afterClose: js.UndefOr[Callback] = js.undefined,
    afterOpen: js.UndefOr[Callback] = js.undefined,
    allowScroll: js.UndefOr[Boolean] = js.undefined,
    backgroundProps: js.Object = null,
    beforeClose: js.Promise[Unit] | js.Function0[Unit] = null,
    beforeOpen: js.Promise[Unit] | js.Function0[Unit] = null,
    children: VdomNode = null,
    onBackgroundClick: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onEscapeKeydown: /* event */ Event_ => Callback = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    afterOpen.foreach(p => __obj.updateDynamic("afterOpen")(p.toJsFn))
    if (!js.isUndefined(allowScroll)) __obj.updateDynamic("allowScroll")(allowScroll.asInstanceOf[js.Any])
    if (backgroundProps != null) __obj.updateDynamic("backgroundProps")(backgroundProps.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onBackgroundClick != null) __obj.updateDynamic("onBackgroundClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBackgroundClick(t0).runNow()))
    if (onEscapeKeydown != null) __obj.updateDynamic("onEscapeKeydown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onEscapeKeydown(t0).runNow()))
    __obj.asInstanceOf[ModalProps]
  }
}

