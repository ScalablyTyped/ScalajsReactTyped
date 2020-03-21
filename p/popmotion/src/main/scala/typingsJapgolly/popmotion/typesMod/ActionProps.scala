package typingsJapgolly.popmotion.typesMod

import typingsJapgolly.popmotion.PartialColdSubscription
import typingsJapgolly.popmotion.observerTypesMod.Complete
import typingsJapgolly.popmotion.observerTypesMod.Error
import typingsJapgolly.popmotion.observerTypesMod.IObserver
import typingsJapgolly.popmotion.observerTypesMod.Middleware
import typingsJapgolly.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion.popmotion/lib/observer/types.ObserverProps & {  init  :popmotion.popmotion/lib/action/types.ActionInit} */
@js.native
trait ActionProps extends js.Object {
  var complete: js.UndefOr[Complete] = js.native
  var error: js.UndefOr[Error] = js.native
  @JSName("init")
  var init_Original: ActionInit = js.native
  var middleware: js.UndefOr[js.Array[Middleware]] = js.native
  var onComplete: js.UndefOr[js.Function] = js.native
  var registerParent: js.UndefOr[js.Function] = js.native
  var update: js.UndefOr[Update] = js.native
  def init(observer: IObserver): PartialColdSubscription | Unit = js.native
}

