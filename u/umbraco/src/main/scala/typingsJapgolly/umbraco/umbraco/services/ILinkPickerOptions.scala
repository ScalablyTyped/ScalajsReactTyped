package typingsJapgolly.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Linkpicker dialog options object
  */
trait ILinkPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
}

object ILinkPickerOptions {
  @scala.inline
  def apply(callback: js.Function): ILinkPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILinkPickerOptions]
  }
}

