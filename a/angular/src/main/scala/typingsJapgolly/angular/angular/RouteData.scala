package typingsJapgolly.angular.angular

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteData is an immutable map of additional data you can configure in your Route.
  * You can inject RouteData into the constructor of a component to use it.
  */
trait RouteData extends js.Object {
  var data: StringDictionary[js.Any]
  def get(key: String): js.Any
}

object RouteData {
  @scala.inline
  def apply(data: StringDictionary[js.Any], get: String => CallbackTo[js.Any]): RouteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[RouteData]
  }
}

