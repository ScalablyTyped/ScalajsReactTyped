package typingsJapgolly.lowdb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowdbBase[SchemaT] extends js.Object {
  def getState(): SchemaT
  def setState(state: SchemaT): this.type
}

object LowdbBase {
  @scala.inline
  def apply[SchemaT](getState: CallbackTo[SchemaT], setState: SchemaT => CallbackTo[LowdbBase[SchemaT]]): LowdbBase[SchemaT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: SchemaT) => setState(t0).runNow()))
    __obj.asInstanceOf[LowdbBase[SchemaT]]
  }
}

