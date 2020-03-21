package typingsJapgolly.ramda

import typingsJapgolly.ramda.toolsMod.ObjPred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/pickBy", JSImport.Namespace)
@js.native
object pickByMod extends js.Object {
  def default(pred: ObjPred): js.Function1[/* obj */ js.Any, _] = js.native
  def default[T, U](pred: ObjPred, obj: T): U = js.native
}

