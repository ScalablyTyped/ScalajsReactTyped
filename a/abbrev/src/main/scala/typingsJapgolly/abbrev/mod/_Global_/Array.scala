package typingsJapgolly.abbrev.mod._Global_

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  def abbrev(): StringDictionary[String]
}

object Array {
  @scala.inline
  def apply[T](abbrev: CallbackTo[StringDictionary[String]]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbrev")(abbrev.toJsFn)
    __obj.asInstanceOf[Array[T]]
  }
}

