package typingsJapgolly.tensorflow.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph_ extends js.Object {
  def createSession(): Session
  def delete(): js.Any
}

object Graph_ {
  @scala.inline
  def apply(createSession: CallbackTo[Session], delete: CallbackTo[js.Any]): Graph_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSession")(createSession.toJsFn)
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.asInstanceOf[Graph_]
  }
}

