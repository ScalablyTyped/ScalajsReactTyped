package typingsJapgolly.jqueryui.JQueryUI

import typingsJapgolly.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableUIParams extends js.Object {
  var element: JQuery
  var helper: JQuery
  var originalElement: JQuery
  var originalPosition: js.Any
  var originalSize: js.Any
  var position: js.Any
  var size: js.Any
}

object ResizableUIParams {
  @scala.inline
  def apply(
    element: JQuery,
    helper: JQuery,
    originalElement: JQuery,
    originalPosition: js.Any,
    originalSize: js.Any,
    position: js.Any,
    size: js.Any
  ): ResizableUIParams = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], originalElement = originalElement.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizableUIParams]
  }
}

