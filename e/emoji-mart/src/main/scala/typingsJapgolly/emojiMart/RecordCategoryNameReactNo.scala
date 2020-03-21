package typingsJapgolly.emojiMart

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, (): react.react.ReactNode> */
trait RecordCategoryNameReactNo extends js.Object {
  var activity: js.Function0[Node]
  var custom: js.Function0[Node]
  var flags: js.Function0[Node]
  var foods: js.Function0[Node]
  var nature: js.Function0[Node]
  var objects: js.Function0[Node]
  var people: js.Function0[Node]
  var places: js.Function0[Node]
  var recent: js.Function0[Node]
  var search: js.Function0[Node]
  var symbols: js.Function0[Node]
}

object RecordCategoryNameReactNo {
  @scala.inline
  def apply(
    activity: CallbackTo[Node],
    custom: CallbackTo[Node],
    flags: CallbackTo[Node],
    foods: CallbackTo[Node],
    nature: CallbackTo[Node],
    objects: CallbackTo[Node],
    people: CallbackTo[Node],
    places: CallbackTo[Node],
    recent: CallbackTo[Node],
    search: CallbackTo[Node],
    symbols: CallbackTo[Node]
  ): RecordCategoryNameReactNo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activity")(activity.toJsFn)
    __obj.updateDynamic("custom")(custom.toJsFn)
    __obj.updateDynamic("flags")(flags.toJsFn)
    __obj.updateDynamic("foods")(foods.toJsFn)
    __obj.updateDynamic("nature")(nature.toJsFn)
    __obj.updateDynamic("objects")(objects.toJsFn)
    __obj.updateDynamic("people")(people.toJsFn)
    __obj.updateDynamic("places")(places.toJsFn)
    __obj.updateDynamic("recent")(recent.toJsFn)
    __obj.updateDynamic("search")(search.toJsFn)
    __obj.updateDynamic("symbols")(symbols.toJsFn)
    __obj.asInstanceOf[RecordCategoryNameReactNo]
  }
}

