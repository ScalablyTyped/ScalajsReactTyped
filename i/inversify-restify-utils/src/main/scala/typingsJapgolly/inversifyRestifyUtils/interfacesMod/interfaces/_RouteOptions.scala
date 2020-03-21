package typingsJapgolly.inversifyRestifyUtils.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RouteOptions extends js.Object

object _RouteOptions {
  @scala.inline
  def AnonPath(path: StrOrRegex): _RouteOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_RouteOptions]
  }
  @scala.inline
  def optionsObjectpathStrOrReg(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    options: js.Object,
    path: StrOrRegex,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): _RouteOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[_RouteOptions]
  }
}

