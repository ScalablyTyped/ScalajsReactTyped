package typingsJapgolly.activexWia

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexWia.WIA.DeviceManager
import typingsJapgolly.activexWia.WIA.Vector
import typingsJapgolly.activexWia.activexWiaStrings.DeviceID
import typingsJapgolly.activexWia.activexWiaStrings.EventID
import typingsJapgolly.activexWia.activexWiaStrings.Item
import typingsJapgolly.activexWia.activexWiaStrings.ItemID
import typingsJapgolly.activexWia.activexWiaStrings.OnEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[
      /* this */ DeviceManager, 
      /* parameter */ typingsJapgolly.activexWia.anon.DeviceID, 
      Unit
    ]
  ): Unit
  
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit
}
object ActiveXObject {
  
  inline def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[
      /* this */ DeviceManager, 
      /* parameter */ typingsJapgolly.activexWia.anon.DeviceID, 
      Unit
    ]) => Callback,
    set: (Vector[Any], Item, js.Array[Double], Any) => Callback
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4((t0: DeviceManager, t1: OnEvent, t2: js.Tuple3[EventID, DeviceID, ItemID], t3: js.ThisFunction1[
      /* this */ DeviceManager, 
      /* parameter */ typingsJapgolly.activexWia.anon.DeviceID, 
      Unit
    ]) => (on(t0, t1, t2, t3)).runNow()), set = js.Any.fromFunction4((t0: Vector[Any], t1: Item, t2: js.Array[Double], t3: Any) => (set(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setOn(
      value: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[
          /* this */ DeviceManager, 
          /* parameter */ typingsJapgolly.activexWia.anon.DeviceID, 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "on", js.Any.fromFunction4((t0: DeviceManager, t1: OnEvent, t2: js.Tuple3[EventID, DeviceID, ItemID], t3: js.ThisFunction1[
          /* this */ DeviceManager, 
          /* parameter */ typingsJapgolly.activexWia.anon.DeviceID, 
          Unit
        ]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSet(value: (Vector[Any], Item, js.Array[Double], Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: Vector[Any], t1: Item, t2: js.Array[Double], t3: Any) => (value(t0, t1, t2, t3)).runNow()))
  }
}
