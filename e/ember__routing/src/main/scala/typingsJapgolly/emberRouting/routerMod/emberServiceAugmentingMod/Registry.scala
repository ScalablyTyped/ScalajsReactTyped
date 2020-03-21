package typingsJapgolly.emberRouting.routerMod.emberServiceAugmentingMod

import typingsJapgolly.emberRouting.routerServiceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  var router: default
}

object Registry {
  @scala.inline
  def apply(router: default): Registry = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Registry]
  }
}

