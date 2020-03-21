package typingsJapgolly.react.mod

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.react.Fn0
import typingsJapgolly.react.Fn1
import typingsJapgolly.react.Fn2
import typingsJapgolly.react.Fn3
import typingsJapgolly.react.FnCall
import typingsJapgolly.react.FnCallType
import typingsJapgolly.react.FnCallTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typingsJapgolly.propTypes.mod.Requireable[_]
  var array: typingsJapgolly.propTypes.mod.Requireable[js.Array[_]]
  var arrayOf: FnCallType
  var bool: typingsJapgolly.propTypes.mod.Requireable[Boolean]
  var element: typingsJapgolly.propTypes.mod.Requireable[ReactElementLike]
  var exact: Fn3
  var func: typingsJapgolly.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: FnCall
  var node: typingsJapgolly.propTypes.mod.Requireable[ReactNodeLike]
  var number: typingsJapgolly.propTypes.mod.Requireable[Double]
  var `object`: typingsJapgolly.propTypes.mod.Requireable[js.Object]
  var objectOf: Fn1
  var oneOf: FnCallTypes
  var oneOfType: Fn0
  var shape: Fn2
  var string: typingsJapgolly.propTypes.mod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typingsJapgolly.propTypes.mod.Requireable[_],
    array: typingsJapgolly.propTypes.mod.Requireable[js.Array[_]],
    arrayOf: FnCallType,
    bool: typingsJapgolly.propTypes.mod.Requireable[Boolean],
    element: typingsJapgolly.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: typingsJapgolly.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: FnCall,
    node: typingsJapgolly.propTypes.mod.Requireable[ReactNodeLike],
    number: typingsJapgolly.propTypes.mod.Requireable[Double],
    `object`: typingsJapgolly.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: typingsJapgolly.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
}

