package typingsJapgolly.jquery.JQuery_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Many of the special event hook functions below are passed a `handleObj` object that provides more information about the event, how it was attached, and its current state. This object and its contents should be treated as read-only data, and only the properties below are documented for use by special event handlers.
  * @see \`{@link https://learn.jquery.com/events/event-extensions/#the-handleobj-object }\`
  */
trait HandleObject[TTarget, TData] extends js.Object {
  /**
    * The data, if any, passed to jQuery during event binding, e.g. `{ myData: 42 }`. If the data argument was omitted or `undefined`, this property is `undefined` as well.
    */
  val data: TData
  /**
    * Namespace(s), if any, provided when the event was attached, such as `"myPlugin"`. When multiple namespaces are given, they are separated by periods and sorted in ascending alphabetical order. If no namespaces are provided, this property is an empty string.
    */
  val namespace: String
  /**
    * The original type name regardless of whether it was mapped via `bindType` or `delegateType`. So when a "pushy" event is mapped to "click" its `origType` would be "pushy".
    */
  val origType: String
  /**
    * For delegated events, this is the selector used to filter descendant elements and determine if the handler should be called. For directly bound events, this property is `null`.
    */
  val selector: js.UndefOr[String | Null] = js.undefined
  /**
    * The type of event, such as `"click"`. When special event mapping is used via `bindType` or `delegateType`, this will be the mapped type.
    */
  val `type`: String
  /**
    * Event handler function passed to jQuery during event binding. If `false` was passed during event binding, the handler refers to a single shared function that simply returns `false`.
    */
  def handler(t: TriggeredEvent[TTarget, TData, _, _], args: js.Any*): js.Any
}

object HandleObject {
  @scala.inline
  def apply[TTarget, TData](
    data: TData,
    handler: (TriggeredEvent[TTarget, TData, js.Any, js.Any], /* repeated */ js.Any) => CallbackTo[js.Any],
    namespace: String,
    origType: String,
    `type`: String,
    selector: String = null
  ): HandleObject[TTarget, TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], origType = origType.asInstanceOf[js.Any])
    __obj.updateDynamic("handler")(js.Any.fromFunction2((t0: typingsJapgolly.jquery.JQuery_.TriggeredEvent[TTarget, TData, js.Any, js.Any], t1: /* repeated */ js.Any) => handler(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleObject[TTarget, TData]]
  }
}

