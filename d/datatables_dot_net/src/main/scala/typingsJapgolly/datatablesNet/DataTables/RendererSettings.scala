package typingsJapgolly.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "colunm-settings"
//#region "other-settings"
trait RendererSettings extends js.Object {
  var header: js.UndefOr[String] = js.undefined
  var pageButton: js.UndefOr[String] = js.undefined
}

object RendererSettings {
  @scala.inline
  def apply(header: String = null, pageButton: String = null): RendererSettings = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (pageButton != null) __obj.updateDynamic("pageButton")(pageButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererSettings]
  }
}

