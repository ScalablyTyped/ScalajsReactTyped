package typingsJapgolly.inversifyRestifyUtils

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  options  :std.Object,   path  :inversify-restify-utils.inversify-restify-utils/dts/interfaces.interfaces.StrOrRegex} & std.Object */
trait optionsObjectpathStrOrReg extends _RouteOptions {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: js.Function
  var options: js.Object
  var path: StrOrRegex
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): Boolean
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): Boolean
}

object optionsObjectpathStrOrReg {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    options: js.Object,
    path: StrOrRegex,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): optionsObjectpathStrOrReg = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[optionsObjectpathStrOrReg]
  }
}

