package typingsJapgolly.reduxTestkit.mod

import typingsJapgolly.reduxTestkit.ThunkTestkitwithStatestat
import typingsJapgolly.reduxThunk.mod.ThunkAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "Thunk")
@js.native
object Thunk extends js.Object {
  def apply(thunkFunc: ThunkAction[_, _, _, _]): ThunkTestkitwithStatestat = js.native
  def apply(thunkFunc: ThunkAction[_, _, _, _], extraArg: js.Any): ThunkTestkitwithStatestat = js.native
}

