package typingsJapgolly.refArrayDi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDicti[T] extends /* i */ NumberDictionary[T] {
  var buffer: Buffer
  var length: Double
  def inspect(): String
  def ref(): Buffer
  def toArray(): js.Array[T]
  def toJSON(): js.Array[T]
}

object AnonDicti {
  @scala.inline
  def apply[T](
    buffer: Buffer,
    inspect: CallbackTo[String],
    length: Double,
    ref: CallbackTo[Buffer],
    toArray: CallbackTo[js.Array[T]],
    toJSON: CallbackTo[js.Array[T]],
    NumberDictionary: /* i */ NumberDictionary[T] = null
  ): AnonDicti[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDicti[T]]
  }
}

