package typingsJapgolly.chance.Chance

import typingsJapgolly.chance.chanceStrings.all
import typingsJapgolly.chance.chanceStrings.female
import typingsJapgolly.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  gender  :'male' | 'female' | 'all'} & chance.Chance.SuffixOptions */
trait PrefixOptions extends js.Object {
  var full: Boolean
  var gender: male | female | all
}

object PrefixOptions {
  @scala.inline
  def apply(full: Boolean, gender: male | female | all): PrefixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrefixOptions]
  }
}

