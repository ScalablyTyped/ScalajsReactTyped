package typingsJapgolly.slonik.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParserType[T] extends js.Object {
  /**
    * Value of "pg_type"."typname" (e.g. "int8", "timestamp", "timestamptz")
    */
  var name: String
  def parse(value: String): T
}

object TypeParserType {
  @scala.inline
  def apply[T](name: String, parse: String => CallbackTo[T]): TypeParserType[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[TypeParserType[T]]
  }
}

