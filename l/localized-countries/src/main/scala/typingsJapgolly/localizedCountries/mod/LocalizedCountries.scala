package typingsJapgolly.localizedCountries.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.localizedCountries.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedCountries extends js.Object {
  def array(): js.Array[AnonCode]
  def get(code: String): String
  def `object`(): StringDictionary[String]
}

object LocalizedCountries {
  @scala.inline
  def apply(
    array: CallbackTo[js.Array[AnonCode]],
    get: String => CallbackTo[String],
    `object`: CallbackTo[StringDictionary[String]]
  ): LocalizedCountries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("object")(`object`.toJsFn)
    __obj.asInstanceOf[LocalizedCountries]
  }
}

