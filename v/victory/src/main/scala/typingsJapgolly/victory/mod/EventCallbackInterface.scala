package typingsJapgolly.victory.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return value for eventHandlers values
  */
trait EventCallbackInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.undefined
  var eventKey: js.UndefOr[TEventKey] = js.undefined
  var target: js.UndefOr[TTarget] = js.undefined
  /**
    * Will be called with the calculated props for the individual selected element and result will override
    * props of selected element via object assignment
    * @param props
    */
  def mutation(props: js.Any): js.Any
}

object EventCallbackInterface {
  @scala.inline
  def apply[TTarget, TEventKey](
    mutation: js.Any => CallbackTo[js.Any],
    childName: String = null,
    eventKey: TEventKey = null,
    target: TTarget = null
  ): EventCallbackInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mutation")(js.Any.fromFunction1((t0: js.Any) => mutation(t0).runNow()))
    if (childName != null) __obj.updateDynamic("childName")(childName.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
  }
}

