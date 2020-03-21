package typingsJapgolly.winrt.Windows.Devices.Enumeration.Pnp

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPnpObject extends js.Object {
  var id: String
  var properties: IMapView[String, _]
  var `type`: PnpObjectType
  def update(updateInfo: PnpObjectUpdate): Unit
}

object IPnpObject {
  @scala.inline
  def apply(
    id: String,
    properties: IMapView[String, _],
    `type`: PnpObjectType,
    update: PnpObjectUpdate => Callback
  ): IPnpObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate) => update(t0).runNow()))
    __obj.asInstanceOf[IPnpObject]
  }
}

