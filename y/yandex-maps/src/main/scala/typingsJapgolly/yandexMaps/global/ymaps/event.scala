package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.std.Record
import typingsJapgolly.yandexMaps.anon.Context
import typingsJapgolly.yandexMaps.mod.IEvent
import typingsJapgolly.yandexMaps.mod.IEventManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  @JSGlobal("ymaps.event.Group")
  @js.native
  open class Group ()
    extends typingsJapgolly.yandexMaps.mod.event.Group
  
  @JSGlobal("ymaps.event.Manager")
  @js.native
  open class Manager[TargetGeometry /* <: js.Object */] ()
    extends typingsJapgolly.yandexMaps.mod.event.Manager[TargetGeometry] {
    def this(params: Context) = this()
  }
  
  @JSGlobal("ymaps.event.Mapper")
  @js.native
  open class Mapper protected ()
    extends typingsJapgolly.yandexMaps.mod.event.Mapper {
    def this(
      targetEventManager: IEventManager[js.Object],
      mappingTable: Record[
            String, 
            (js.Function1[/* event */ IEvent[js.Object, js.Object], (IEvent[js.Object, js.Object]) | Null]) | Boolean
          ]
    ) = this()
  }
}
