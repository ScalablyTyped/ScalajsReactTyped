package typingsJapgolly.miniprogramWxs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: Function
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): scala.Boolean
  /**
    * Determines whether an object exists in another object's prototype chain.
    * @param v Another object whose prototype chain is to be checked.
    */
  def isPrototypeOf(v: Object): scala.Boolean
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): scala.Boolean
}

object Object {
  @scala.inline
  def apply(
    constructor: Function,
    hasOwnProperty: PropertyKey => CallbackTo[scala.Boolean],
    isPrototypeOf: Object => CallbackTo[scala.Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[scala.Boolean]
  ): Object = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.miniprogramWxs.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("isPrototypeOf")(js.Any.fromFunction1((t0: typingsJapgolly.miniprogramWxs.Object) => isPrototypeOf(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.miniprogramWxs.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[Object]
  }
}

