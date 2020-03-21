package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointSelector extends js.Object {
  /** Gets an endpoint with a specific key. */
  def urlFor(key: String): String
}

object EndpointSelector {
  @scala.inline
  def apply(urlFor: String => CallbackTo[String]): EndpointSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("urlFor")(js.Any.fromFunction1((t0: java.lang.String) => urlFor(t0).runNow()))
    __obj.asInstanceOf[EndpointSelector]
  }
}

