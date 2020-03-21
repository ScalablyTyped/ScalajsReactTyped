package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.notificationMod.Notification
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/dematerialize", JSImport.Namespace)
@js.native
object dematerializeMod extends js.Object {
  def dematerialize[T](): OperatorFunction[Notification[T], T] = js.native
}

