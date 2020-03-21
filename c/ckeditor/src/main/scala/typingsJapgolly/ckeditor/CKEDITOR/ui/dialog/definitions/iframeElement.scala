package typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.definitions

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait iframeElement extends js.Object {
  var height: String
  var onContentLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var src: String
  var width: String
}

object iframeElement {
  @scala.inline
  def apply(height: String, src: String, width: String, onContentLoad: js.UndefOr[Callback] = js.undefined): iframeElement = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    onContentLoad.foreach(p => __obj.updateDynamic("onContentLoad")(p.toJsFn))
    __obj.asInstanceOf[iframeElement]
  }
}

