package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "Operator")
@js.native
class Operator ()
  extends typingsJapgolly.wonderFrp.globalOperatorMod.Operator

/* static members */
@JSImport("wonder-frp/dist/es2015", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): typingsJapgolly.wonderFrp.streamAnonymousStreamMod.AnonymousStream = js.native
  def empty(): typingsJapgolly.wonderFrp.streamAnonymousStreamMod.AnonymousStream = js.native
  def fromArray(array: js.Array[_]): typingsJapgolly.wonderFrp.streamFromArrayStreamMod.FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.streamFromArrayStreamMod.FromArrayStream = js.native
}

