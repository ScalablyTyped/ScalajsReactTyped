package typingsJapgolly.yadda.contextMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var properties: Properties
  def merge(other: Properties): Context
}

object Context {
  @scala.inline
  def apply(merge: Properties => CallbackTo[Context], properties: Properties): Context = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("merge")(js.Any.fromFunction1((t0: typingsJapgolly.yadda.contextMod.Properties) => merge(t0).runNow()))
    __obj.asInstanceOf[Context]
  }
}

