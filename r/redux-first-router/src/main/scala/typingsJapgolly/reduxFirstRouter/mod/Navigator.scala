package typingsJapgolly.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator[TState] extends js.Object {
  var router: Router[TState]
}

object Navigator {
  @scala.inline
  def apply[TState](router: Router[TState]): Navigator[TState] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator[TState]]
  }
}

