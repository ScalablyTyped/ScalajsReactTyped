package typingsJapgolly.reactDragtastic.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactDragtastic.StateisOverAcceptedboolea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragComponentProps extends js.Object {
  /** A boolean determining whether or not the DragComponent should always render. Defaults to false. */
  var alwaysRender: js.UndefOr[Boolean] = js.undefined
  /* A string corresponding to the id property of the <Draggable/> zone that should trigger this component to start rendering. */
  var `for`: js.UndefOr[Id] = js.undefined
  /** A function which will be called every time a user drags. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.undefined
  def children(arg: StateisOverAcceptedboolea): Node
}

object DragComponentProps {
  @scala.inline
  def apply(
    children: StateisOverAcceptedboolea => CallbackTo[Node],
    alwaysRender: js.UndefOr[Boolean] = js.undefined,
    `for`: Id = null,
    onDrag: js.UndefOr[Callback] = js.undefined,
    subscribeTo: js.Array[String] = null
  ): DragComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactDragtastic.StateisOverAcceptedboolea) => children(t0).runNow()))
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    onDrag.foreach(p => __obj.updateDynamic("onDrag")(p.toJsFn))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragComponentProps]
  }
}

