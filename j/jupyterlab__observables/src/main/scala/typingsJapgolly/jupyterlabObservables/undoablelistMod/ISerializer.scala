package typingsJapgolly.jupyterlabObservables.undoablelistMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializer[T] extends js.Object {
  /**
    * Deserialize the object from JSON.
    */
  def fromJSON(value: JSONValue): T
  /**
    * Convert the object to JSON.
    */
  def toJSON(value: T): JSONValue
}

object ISerializer {
  @scala.inline
  def apply[T](fromJSON: JSONValue => CallbackTo[T], toJSON: T => CallbackTo[JSONValue]): ISerializer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue) => fromJSON(t0).runNow()))
    __obj.updateDynamic("toJSON")(js.Any.fromFunction1((t0: T) => toJSON(t0).runNow()))
    __obj.asInstanceOf[ISerializer[T]]
  }
}

