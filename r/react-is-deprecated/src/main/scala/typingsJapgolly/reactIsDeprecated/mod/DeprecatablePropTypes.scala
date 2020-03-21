package typingsJapgolly.reactIsDeprecated.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.Requireable
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
// define a version that intersects in the Deprecatable interface into the keys.
trait DeprecatablePropTypes extends js.Object {
  var any: Requireable[_] with Deprecatable[_]
  var array: Requireable[_] with Deprecatable[_]
  var bool: Requireable[_] with Deprecatable[_]
  var element: Requireable[_] with Deprecatable[_]
  var func: Requireable[_] with Deprecatable[_]
  var node: Requireable[_] with Deprecatable[_]
  var number: Requireable[_] with Deprecatable[_]
  var `object`: Requireable[_] with Deprecatable[_]
  var string: Requireable[_] with Deprecatable[_]
  def arrayOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_]
  def instanceOf(expectedClass: js.Object): Requireable[_] with Deprecatable[_]
  def objectOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_]
  def oneOf(types: js.Array[_]): Requireable[_] with Deprecatable[_]
  def oneOfType(types: js.Array[Validator[_]]): Requireable[_] with Deprecatable[_]
  def shape(`type`: ValidationMap[_]): Requireable[_] with Deprecatable[_]
}

object DeprecatablePropTypes {
  @scala.inline
  def apply(
    any: Requireable[_] with Deprecatable[_],
    array: Requireable[_] with Deprecatable[_],
    arrayOf: Validator[js.Any] => CallbackTo[Requireable[js.Any] with Deprecatable[js.Any]],
    bool: Requireable[_] with Deprecatable[_],
    element: Requireable[_] with Deprecatable[_],
    func: Requireable[_] with Deprecatable[_],
    instanceOf: js.Object => CallbackTo[Requireable[js.Any] with Deprecatable[js.Any]],
    node: Requireable[_] with Deprecatable[_],
    number: Requireable[_] with Deprecatable[_],
    `object`: Requireable[_] with Deprecatable[_],
    objectOf: Validator[js.Any] => CallbackTo[Requireable[js.Any] with Deprecatable[js.Any]],
    oneOf: js.Array[js.Any] => CallbackTo[Requireable[js.Any] with Deprecatable[js.Any]],
    oneOfType: js.Array[Validator[js.Any]] => CallbackTo[Requireable[js.Any] with Deprecatable[js.Any]],
    shape: ValidationMap[js.Any] => CallbackTo[Requireable[js.Any] with Deprecatable[js.Any]],
    string: Requireable[_] with Deprecatable[_]
  ): DeprecatablePropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayOf")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.Validator[js.Any]) => arrayOf(t0).runNow()))
    __obj.updateDynamic("instanceOf")(js.Any.fromFunction1((t0: js.Object) => instanceOf(t0).runNow()))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("objectOf")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.Validator[js.Any]) => objectOf(t0).runNow()))
    __obj.updateDynamic("oneOf")(js.Any.fromFunction1((t0: js.Array[js.Any]) => oneOf(t0).runNow()))
    __obj.updateDynamic("oneOfType")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.react.mod.Validator[js.Any]]) => oneOfType(t0).runNow()))
    __obj.updateDynamic("shape")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.ValidationMap[js.Any]) => shape(t0).runNow()))
    __obj.asInstanceOf[DeprecatablePropTypes]
  }
}

