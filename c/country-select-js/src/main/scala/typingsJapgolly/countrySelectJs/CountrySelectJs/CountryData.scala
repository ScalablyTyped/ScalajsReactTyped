package typingsJapgolly.countrySelectJs.CountrySelectJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryData extends js.Object {
  var iso2: String
  var name: String
}

object CountryData {
  @scala.inline
  def apply(iso2: String, name: String): CountryData = {
    val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CountryData]
  }
}

