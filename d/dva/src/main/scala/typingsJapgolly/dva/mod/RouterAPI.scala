package typingsJapgolly.dva.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAPI extends js.Object {
  var app: DvaInstance
  var history: History[LocationState]
}

object RouterAPI {
  @scala.inline
  def apply(app: DvaInstance, history: History[LocationState]): RouterAPI = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouterAPI]
  }
}

