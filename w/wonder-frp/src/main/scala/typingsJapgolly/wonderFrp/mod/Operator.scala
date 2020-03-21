package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
class Operator ()
  extends typingsJapgolly.wonderFrp.operatorMod.Operator

/* static members */
@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): typingsJapgolly.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
  def empty(): typingsJapgolly.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
  def fromArray(array: js.Array[_]): typingsJapgolly.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: typingsJapgolly.wonderFrp.schedulerMod.Scheduler): typingsJapgolly.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
}

