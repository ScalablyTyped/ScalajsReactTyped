package typingsJapgolly.sharepoint

import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDra extends js.Object {
  var dra: Splitter
  var dragHandle: SplitterHandle
  var hover: Splitter
  var hoverHandle: SplitterHandle
  var normal: Splitter
  var normalHandle: SplitterHandle
}

object AnonDra {
  @scala.inline
  def apply(
    dra: Splitter,
    dragHandle: SplitterHandle,
    hover: Splitter,
    hoverHandle: SplitterHandle,
    normal: Splitter,
    normalHandle: SplitterHandle
  ): AnonDra = {
    val __obj = js.Dynamic.literal(dra = dra.asInstanceOf[js.Any], dragHandle = dragHandle.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverHandle = hoverHandle.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHandle = normalHandle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDra]
  }
}

