package typingsJapgolly.eggView.mod

import typingsJapgolly.eggView.ViewManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var view: ViewManager
}

object Application {
  @scala.inline
  def apply(view: ViewManager): Application = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Application]
  }
}

