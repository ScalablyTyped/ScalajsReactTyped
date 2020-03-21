package typingsJapgolly.sammy.mod

import typingsJapgolly.sammy.Sammy.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sammy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DataLocationProxy: typingsJapgolly.sammy.Sammy.DataLocationProxy = js.native
  var FormBuilder: typingsJapgolly.sammy.Sammy.FormBuilder = js.native
  var Store: typingsJapgolly.sammy.Sammy.Store = js.native
  def apply(): Application = js.native
  def apply(handler: js.Function): Application = js.native
  def apply(selector: String): Application = js.native
  def apply(selector: String, handler: js.Function): Application = js.native
}

