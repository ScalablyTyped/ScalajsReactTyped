package typingsJapgolly.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var locations: js.Array[Location]
  var names: Translations
}

object Region {
  @scala.inline
  def apply(locations: js.Array[Location], names: Translations): Region = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Region]
  }
}

