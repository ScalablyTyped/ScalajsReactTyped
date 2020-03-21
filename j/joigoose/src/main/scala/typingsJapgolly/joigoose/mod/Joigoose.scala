package typingsJapgolly.joigoose.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.joi.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joigoose extends js.Object {
  def convert(schema: Schema): typingsJapgolly.mongoose.mod.Schema[_]
}

object Joigoose {
  @scala.inline
  def apply(convert: Schema => CallbackTo[typingsJapgolly.mongoose.mod.Schema[js.Any]]): Joigoose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction1((t0: typingsJapgolly.joi.mod.Schema) => convert(t0).runNow()))
    __obj.asInstanceOf[Joigoose]
  }
}

