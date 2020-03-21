package typingsJapgolly.elasticElasticsearch.serializerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def deserialize(json: String): js.Any
  def ndserialize(array: js.Array[_]): String
  def qserialize(`object`: js.Any): String
  def serialize(`object`: js.Any): String
}

object Serializer {
  @scala.inline
  def apply(
    deserialize: String => CallbackTo[js.Any],
    ndserialize: js.Array[js.Any] => CallbackTo[String],
    qserialize: js.Any => CallbackTo[String],
    serialize: js.Any => CallbackTo[String]
  ): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: java.lang.String) => deserialize(t0).runNow()))
    __obj.updateDynamic("ndserialize")(js.Any.fromFunction1((t0: js.Array[js.Any]) => ndserialize(t0).runNow()))
    __obj.updateDynamic("qserialize")(js.Any.fromFunction1((t0: js.Any) => qserialize(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: js.Any) => serialize(t0).runNow()))
    __obj.asInstanceOf[Serializer]
  }
}

