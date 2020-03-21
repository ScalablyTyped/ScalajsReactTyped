package typingsJapgolly.angularToastr.mod.angularAugmentingMod.toastr

import typingsJapgolly.angular.mod.IRootScopeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastScope extends IRootScopeService {
  var message: String = js.native
  var options: IToastConfig = js.native
  var title: String = js.native
  var toastId: Double = js.native
  var toastType: String = js.native
}

