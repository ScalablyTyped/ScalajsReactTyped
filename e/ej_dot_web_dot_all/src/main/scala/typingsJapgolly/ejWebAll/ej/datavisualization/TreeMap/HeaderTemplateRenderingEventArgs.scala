package typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTemplateRenderingEventArgs extends js.Object {
  /** Returns drilldown header.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object HeaderTemplateRenderingEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): HeaderTemplateRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderTemplateRenderingEventArgs]
  }
}

