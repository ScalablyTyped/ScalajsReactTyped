package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends typingsJapgolly.wonderFrp.judgeUtilsMod.JudgeUtils

/* static members */
@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isEqual(ob1: typingsJapgolly.wonderFrp.entityMod.Entity, ob2: typingsJapgolly.wonderFrp.entityMod.Entity): Boolean = js.native
  def isIObserver(i: IObserver): js.Function0[_] = js.native
  def isPromise(obj: js.Any): Boolean = js.native
}

