package typingsJapgolly.dateFns

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/lightFormat", JSImport.Namespace)
@js.native
object dateFnsLightFormatMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, format: String): String = js.native
    def apply(date: Date, format: String): String = js.native
  }
  
}

