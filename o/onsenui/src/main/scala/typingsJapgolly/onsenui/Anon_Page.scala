package typingsJapgolly.onsenui

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: js.Any
  var params: js.UndefOr[js.Object] = js.undefined
  var parent: Element
}

object Anon_Page {
  @scala.inline
  def apply(page: js.Any, parent: Element, params: js.Object = null): Anon_Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Page]
  }
}

