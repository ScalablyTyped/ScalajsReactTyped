package typingsJapgolly.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportSignalrServer extends js.Object {
  var create: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[String] = js.undefined
  var read: js.UndefOr[String] = js.undefined
  var update: js.UndefOr[String] = js.undefined
}

object DataSourceTransportSignalrServer {
  @scala.inline
  def apply(create: String = null, destroy: String = null, read: String = null, update: String = null): DataSourceTransportSignalrServer = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportSignalrServer]
  }
}

