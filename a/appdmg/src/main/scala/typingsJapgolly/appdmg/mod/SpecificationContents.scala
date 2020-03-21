package typingsJapgolly.appdmg.mod

import typingsJapgolly.appdmg.appdmgStrings.file
import typingsJapgolly.appdmg.appdmgStrings.link
import typingsJapgolly.appdmg.appdmgStrings.position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationContents extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var path: String
  var `type`: link | file | position
  var x: Double
  var y: Double
}

object SpecificationContents {
  @scala.inline
  def apply(path: String, `type`: link | file | position, x: Double, y: Double, name: String = null): SpecificationContents = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationContents]
  }
}

