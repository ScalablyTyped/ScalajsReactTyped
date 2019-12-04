package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalNotificationMod.Notification
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/materialize", JSImport.Namespace)
@js.native
object internalOperatorsMaterializeMod extends js.Object {
  def materialize[T](): OperatorFunction[T, Notification[T]] = js.native
}

