package typingsJapgolly.activexScripting

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexScripting.Scripting.Dictionary
import typingsJapgolly.activexScripting.activexScriptingStrings.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item[TKey, TValue](
    obj: Dictionary[TKey, TValue],
    propertyName: Item,
    parameterTypes: js.Array[TKey],
    newValue: TValue
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(set: (Dictionary[js.Any, js.Any], Item, js.Array[js.Any], js.Any) => Callback): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction4((t0: typingsJapgolly.activexScripting.Scripting.Dictionary[js.Any, js.Any], t1: typingsJapgolly.activexScripting.activexScriptingStrings.Item, t2: js.Array[js.Any], t3: js.Any) => set(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
}

