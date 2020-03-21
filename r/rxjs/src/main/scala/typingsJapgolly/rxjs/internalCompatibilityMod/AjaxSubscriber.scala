package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected ()
  extends typingsJapgolly.rxjs.ajaxObservableMod.AjaxSubscriber[T] {
  def this(destination: typingsJapgolly.rxjs.subscriberMod.Subscriber[T], request: AjaxRequest) = this()
}

