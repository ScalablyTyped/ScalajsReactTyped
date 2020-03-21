package typingsJapgolly.hoganJs.mod

import typingsJapgolly.hoganJs.HoganOptionsasStringfalse
import typingsJapgolly.hoganJs.HoganOptionsasStringtrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hogan.js", "compile")
@js.native
object compile extends js.Object {
  def apply(text: String): HoganTemplate = js.native
  def apply(text: String, options: HoganOptionsasStringfalse): HoganTemplate = js.native
  def apply(text: String, options: HoganOptionsasStringtrue): String = js.native
  def apply(text: String, options: HoganOptions): HoganTemplate | String = js.native
}

