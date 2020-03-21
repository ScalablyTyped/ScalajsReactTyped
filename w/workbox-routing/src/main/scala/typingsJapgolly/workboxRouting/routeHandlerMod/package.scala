package typingsJapgolly.workboxRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routeHandlerMod {
  type RouteHandler = typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandlerCallback | typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandlerObject
  type RouteHandlerCallback = js.Function1[
    /* context */ typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext, 
    js.Promise[org.scalajs.dom.experimental.Response]
  ]
}
