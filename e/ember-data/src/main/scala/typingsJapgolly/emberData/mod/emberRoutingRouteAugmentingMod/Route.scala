package typingsJapgolly.emberData.mod.emberRoutingRouteAugmentingMod

import typingsJapgolly.emberData.mod.DS.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var store: Store
}

object Route {
  @scala.inline
  def apply(store: Store): Route = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Route]
  }
}

