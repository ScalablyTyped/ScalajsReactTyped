package typingsJapgolly.abbrev.mod._Global_

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def abbrev(): StringDictionary[String]
}

object Object {
  @scala.inline
  def apply(abbrev: CallbackTo[StringDictionary[String]]): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbrev")(abbrev.toJsFn)
    __obj.asInstanceOf[Object]
  }
}

