package typingsJapgolly.chance.Chance

import typingsJapgolly.chance.chanceStrings.female
import typingsJapgolly.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstNameOptions extends js.Object {
  var gender: male | female
  var nationality: FirstNameNationalities
}

object FirstNameOptions {
  @scala.inline
  def apply(gender: male | female, nationality: FirstNameNationalities): FirstNameOptions = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirstNameOptions]
  }
}

