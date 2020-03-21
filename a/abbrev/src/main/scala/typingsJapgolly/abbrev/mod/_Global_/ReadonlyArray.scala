package typingsJapgolly.abbrev.mod._Global_

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyArray[T] extends js.Object {
  def abbrev(): StringDictionary[String]
}

object ReadonlyArray {
  @scala.inline
  def apply[T](abbrev: CallbackTo[StringDictionary[String]]): ReadonlyArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbrev")(abbrev.toJsFn)
    __obj.asInstanceOf[ReadonlyArray[T]]
  }
}

