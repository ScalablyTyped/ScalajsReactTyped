package typingsJapgolly.waterline

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.waterline.mod.CollectionClass
import typingsJapgolly.waterline.mod.CollectionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtend extends js.Object {
  def extend(params: CollectionDefinition): CollectionClass
}

object AnonExtend {
  @scala.inline
  def apply(extend: CollectionDefinition => CallbackTo[CollectionClass]): AnonExtend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: typingsJapgolly.waterline.mod.CollectionDefinition) => extend(t0).runNow()))
    __obj.asInstanceOf[AnonExtend]
  }
}

