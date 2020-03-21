package typingsJapgolly.dojo.dojox.validate.regexp

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/regexp.ca.html
  *
  *
  */
trait ca extends js.Object {
  /**
    * String regular Express to match Canadain Postal Codes
    *
    */
  def postalCode(): String
  /**
    * a regular expression to match Canadian Province Abbreviations
    *
    */
  def province(): String
}

object ca {
  @scala.inline
  def apply(postalCode: CallbackTo[String], province: CallbackTo[String]): ca = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postalCode")(postalCode.toJsFn)
    __obj.updateDynamic("province")(province.toJsFn)
    __obj.asInstanceOf[ca]
  }
}

