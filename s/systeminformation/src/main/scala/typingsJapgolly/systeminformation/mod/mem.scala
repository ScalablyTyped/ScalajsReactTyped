package typingsJapgolly.systeminformation.mod

import typingsJapgolly.systeminformation.mod.Systeminformation.MemData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "mem")
@js.native
object mem extends js.Object {
  def apply(): js.Promise[MemData] = js.native
  def apply(cb: js.Function1[/* data */ MemData, _]): js.Promise[MemData] = js.native
}

