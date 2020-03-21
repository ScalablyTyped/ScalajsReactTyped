package typingsJapgolly.hapiDecorators.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller_ extends js.Object {
  var baseUrl: String
  def routes(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
  ]
}

object Controller_ {
  @scala.inline
  def apply(baseUrl: String, routes: CallbackTo[js.Array[js.Any]]): Controller_ = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("routes")(routes.toJsFn)
    __obj.asInstanceOf[Controller_]
  }
}

