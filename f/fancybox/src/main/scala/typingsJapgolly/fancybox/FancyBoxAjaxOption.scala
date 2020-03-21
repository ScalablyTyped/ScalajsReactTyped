package typingsJapgolly.fancybox

import typingsJapgolly.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxAjaxOption extends js.Object {
  /**
    * Object containing settings for ajax request
    */
  var settings: JQueryAjaxSettings
}

object FancyBoxAjaxOption {
  @scala.inline
  def apply(settings: JQueryAjaxSettings): FancyBoxAjaxOption = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FancyBoxAjaxOption]
  }
}

