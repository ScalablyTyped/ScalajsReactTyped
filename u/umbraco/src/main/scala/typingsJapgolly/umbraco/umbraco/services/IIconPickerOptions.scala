package typingsJapgolly.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iconpicker dialog options object
  */
trait IIconPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
}

object IIconPickerOptions {
  @scala.inline
  def apply(callback: js.Function): IIconPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIconPickerOptions]
  }
}

