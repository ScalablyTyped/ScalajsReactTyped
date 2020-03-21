package typingsJapgolly.astTypes.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[T] extends js.Object {
  val defaultFn: js.UndefOr[js.Function] = js.undefined
  val hidden: Boolean
  val name: String
  val `type`: Type[T]
  def getValue(obj: StringDictionary[js.Any]): js.Any
}

object Field {
  @scala.inline
  def apply[T](
    getValue: StringDictionary[js.Any] => CallbackTo[js.Any],
    hidden: Boolean,
    name: String,
    `type`: Type[T],
    defaultFn: js.Function = null
  ): Field[T] = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => getValue(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultFn != null) __obj.updateDynamic("defaultFn")(defaultFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[T]]
  }
}

