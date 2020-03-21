package typingsJapgolly.awsSdkTypes.marshallerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySerializer[SerializedType] extends js.Object {
  /**
    * Converts the provided `input` into the serialized format described in the
    * provided `shape`.
    *
    * @param options Modeled and user-provided operation input to serialize.
    *
    * @throws if a node in the input cannot be converted into the type
    *          specified by the serialization model
    */
  def build(options: BodySerializerBuildOptions): SerializedType
}

object BodySerializer {
  @scala.inline
  def apply[SerializedType](build: BodySerializerBuildOptions => CallbackTo[SerializedType]): BodySerializer[SerializedType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(js.Any.fromFunction1((t0: typingsJapgolly.awsSdkTypes.marshallerMod.BodySerializerBuildOptions) => build(t0).runNow()))
    __obj.asInstanceOf[BodySerializer[SerializedType]]
  }
}

