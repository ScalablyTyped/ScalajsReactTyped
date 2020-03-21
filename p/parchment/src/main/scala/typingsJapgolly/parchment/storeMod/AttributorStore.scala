package typingsJapgolly.parchment.storeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parchment.blotMod.Formattable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributorStore extends js.Object {
  var attributes: js.Any
  var domNode: js.Any
  def attribute(attribute: typingsJapgolly.parchment.attributorMod.default, value: js.Any): Unit
  def build(): Unit
  def copy(target: Formattable): Unit
  def move(target: Formattable): Unit
  def values(): StringDictionary[js.Any]
}

object AttributorStore {
  @scala.inline
  def apply(
    attribute: (typingsJapgolly.parchment.attributorMod.default, js.Any) => Callback,
    attributes: js.Any,
    build: Callback,
    copy: Formattable => Callback,
    domNode: js.Any,
    move: Formattable => Callback,
    values: CallbackTo[StringDictionary[js.Any]]
  ): AttributorStore = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], domNode = domNode.asInstanceOf[js.Any])
    __obj.updateDynamic("attribute")(js.Any.fromFunction2((t0: typingsJapgolly.parchment.attributorMod.default, t1: js.Any) => attribute(t0, t1).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: typingsJapgolly.parchment.blotMod.Formattable) => copy(t0).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction1((t0: typingsJapgolly.parchment.blotMod.Formattable) => move(t0).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[AttributorStore]
  }
}

