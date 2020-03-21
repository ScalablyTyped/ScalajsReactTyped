package typingsJapgolly.xml2js.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2js", "parseString")
@js.native
object parseString extends js.Object {
  def apply(str: convertableToString, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def apply(
    str: convertableToString,
    options: OptionsV2,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}

