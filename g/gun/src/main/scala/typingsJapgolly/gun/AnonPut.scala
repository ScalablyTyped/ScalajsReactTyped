package typingsJapgolly.gun

import japgolly.scalajs.react.Callback
import typingsJapgolly.gun.mod.Gun.DisallowArray
import typingsJapgolly.gun.mod.Gun.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPut[DataType] extends js.Object {
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}

object AnonPut {
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Callback): AnonPut[DataType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("put")(js.Any.fromFunction1((t0: typingsJapgolly.gun.mod.Gun.DisallowArray[typingsJapgolly.gun.mod.Gun.Saveable[DataType]]) => put(t0).runNow()))
    __obj.asInstanceOf[AnonPut[DataType]]
  }
}

