package typingsJapgolly.awsSdkTypes.unmarshallerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.protocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParser[SerializedType] extends js.Object {
  /**
    * Convert the provided input into the shape described in the supplied
    * serialization model.
    *
    * @param shape A serialization model describing the expected shape of the
    *              value supplied as `input`.
    * @param input The value to parse
    */
  def parse[OutputType](shape: Member, input: SerializedType): OutputType
}

object BodyParser {
  @scala.inline
  def apply[SerializedType](parse: (Member, SerializedType) => CallbackTo[js.Any]): BodyParser[SerializedType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: typingsJapgolly.awsSdkTypes.protocolMod.Member, t1: SerializedType) => parse(t0, t1).runNow()))
    __obj.asInstanceOf[BodyParser[SerializedType]]
  }
}

