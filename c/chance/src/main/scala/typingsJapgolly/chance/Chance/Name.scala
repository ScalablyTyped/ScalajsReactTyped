package typingsJapgolly.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var abbreviation: String
  var name: String
}

object Name {
  @scala.inline
  def apply(abbreviation: String, name: String): Name = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Name]
  }
}

