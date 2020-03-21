package typingsJapgolly.pg

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pgTypes.AnonParse
import typingsJapgolly.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofarrayParser extends js.Object {
  def create(source: js.Any, transform: TypeParser): AnonParse
}

object TypeofarrayParser {
  @scala.inline
  def apply(create: (js.Any, TypeParser) => CallbackTo[AnonParse]): TypeofarrayParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.pgTypes.mod.TypeParser) => create(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofarrayParser]
  }
}

