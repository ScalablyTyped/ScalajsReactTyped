package typingsJapgolly.activexWia

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexWia.WIA.DeviceManager
import typingsJapgolly.activexWia.WIA.Vector
import typingsJapgolly.activexWia.activexWiaStrings.DeviceID
import typingsJapgolly.activexWia.activexWiaStrings.EventID
import typingsJapgolly.activexWia.activexWiaStrings.Item
import typingsJapgolly.activexWia.activexWiaStrings.ItemID
import typingsJapgolly.activexWia.activexWiaStrings.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[/* this */ DeviceManager, /* parameter */ AnonDeviceID, Unit]
  ): Unit
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ AnonDeviceID, Unit]) => Callback,
    set: (Vector[js.Any], Item, js.Array[Double], js.Any) => Callback
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction4((t0: typingsJapgolly.activexWia.WIA.DeviceManager, t1: typingsJapgolly.activexWia.activexWiaStrings.OnEvent, t2: js.Tuple3[
  typingsJapgolly.activexWia.activexWiaStrings.EventID, 
  typingsJapgolly.activexWia.activexWiaStrings.DeviceID, 
  typingsJapgolly.activexWia.activexWiaStrings.ItemID], t3: js.ThisFunction1[
  /* this */ typingsJapgolly.activexWia.WIA.DeviceManager, 
  /* parameter */ typingsJapgolly.activexWia.AnonDeviceID, 
  scala.Unit]) => on(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction4((t0: typingsJapgolly.activexWia.WIA.Vector[js.Any], t1: typingsJapgolly.activexWia.activexWiaStrings.Item, t2: js.Array[scala.Double], t3: js.Any) => set(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
}

