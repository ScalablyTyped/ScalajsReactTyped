package typingsJapgolly.reactMovable.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactMovable.AnonChildren
import typingsJapgolly.reactMovable.AnonElements
import typingsJapgolly.reactMovable.AnonIndex
import typingsJapgolly.reactMovable.AnonNewIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ AnonElements, Unit]] = js.undefined
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: AnonNewIndex): Unit
  def renderItem(params: AnonIndex[Value]): Node
  def renderList(props: AnonChildren): Node
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: AnonNewIndex => Callback,
    removableByMove: Boolean,
    renderItem: AnonIndex[Value] => CallbackTo[Node],
    renderList: AnonChildren => CallbackTo[Node],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ AnonElements => Callback = null
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactMovable.AnonNewIndex) => onChange(t0).runNow()))
    __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: typingsJapgolly.reactMovable.AnonIndex[Value]) => renderItem(t0).runNow()))
    __obj.updateDynamic("renderList")(js.Any.fromFunction1((t0: typingsJapgolly.reactMovable.AnonChildren) => renderList(t0).runNow()))
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactMovable.AnonElements) => beforeDrag(t0).runNow()))
    __obj.asInstanceOf[IProps[Value]]
  }
}

