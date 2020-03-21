package typingsJapgolly.angularCompiler.serializerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderMapper extends js.Object {
  def toInternalName(publicName: String): String | Null
  def toPublicName(internalName: String): String | Null
}

object PlaceholderMapper {
  @scala.inline
  def apply(
    toInternalName: String => CallbackTo[String | Null],
    toPublicName: String => CallbackTo[String | Null]
  ): PlaceholderMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toInternalName")(js.Any.fromFunction1((t0: java.lang.String) => toInternalName(t0).runNow()))
    __obj.updateDynamic("toPublicName")(js.Any.fromFunction1((t0: java.lang.String) => toPublicName(t0).runNow()))
    __obj.asInstanceOf[PlaceholderMapper]
  }
}

