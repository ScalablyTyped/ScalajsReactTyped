package typingsJapgolly.react.reactMod

import typingsJapgolly.propDashTypes.propDashTypesMod.ReactElementLike
import typingsJapgolly.propDashTypes.propDashTypesMod.ReactNodeLike
import typingsJapgolly.react.Fn_Args
import typingsJapgolly.react.Fn_Type
import typingsJapgolly.react.Fn_TypeAny
import typingsJapgolly.react.Fn_TypeAnyInferProps
import typingsJapgolly.react.Fn_TypeAnyInferPropsP
import typingsJapgolly.react.Fn_Types
import typingsJapgolly.react.Fn_TypesAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[_]
  var array: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[js.Array[_]]
  var arrayOf: Fn_Type
  var bool: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[Boolean]
  var element: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[ReactElementLike]
  var exact: Fn_TypeAnyInferPropsP
  var func: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: Fn_Args
  var node: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[ReactNodeLike]
  var number: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[Double]
  var `object`: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[js.Object]
  var objectOf: Fn_TypeAny
  var oneOf: Fn_Types
  var oneOfType: Fn_TypesAny
  var shape: Fn_TypeAnyInferProps
  var string: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[_],
    array: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[js.Array[_]],
    arrayOf: Fn_Type,
    bool: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[Boolean],
    element: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[ReactElementLike],
    exact: Fn_TypeAnyInferPropsP,
    func: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: Fn_Args,
    node: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[ReactNodeLike],
    number: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[Double],
    `object`: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[js.Object],
    objectOf: Fn_TypeAny,
    oneOf: Fn_Types,
    oneOfType: Fn_TypesAny,
    shape: Fn_TypeAnyInferProps,
    string: typingsJapgolly.propDashTypes.propDashTypesMod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
}

