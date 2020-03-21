package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaUtils extends js.Object {
  def isSingleProperty(schema: Schema_[js.Object]): Boolean
  def process(schema: Schema_[js.Object]): Boolean
}

object SchemaUtils {
  @scala.inline
  def apply(
    isSingleProperty: Schema_[js.Object] => CallbackTo[Boolean],
    process: Schema_[js.Object] => CallbackTo[Boolean]
  ): SchemaUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSingleProperty")(js.Any.fromFunction1((t0: typingsJapgolly.aframe.mod.Schema_[js.Object]) => isSingleProperty(t0).runNow()))
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: typingsJapgolly.aframe.mod.Schema_[js.Object]) => process(t0).runNow()))
    __obj.asInstanceOf[SchemaUtils]
  }
}

