package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var config: StringDictionary[js.Any]
  var name: String
  def define(property: String, value: js.Any): Unit
}

@JSImport("webix", "Settings")
@js.native
object Settings extends TopLevel[Settings]

