package typingsJapgolly.ukCoWorkingedgePhonegapPluginIstablet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /**
    * Indicates whether the current device is a tablet or a phone.
    * True if the device is a tablet; false if the device is a phone.
    */
  var isTablet: Boolean
}

object Window {
  @scala.inline
  def apply(isTablet: Boolean): Window = {
    val __obj = js.Dynamic.literal(isTablet = isTablet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

