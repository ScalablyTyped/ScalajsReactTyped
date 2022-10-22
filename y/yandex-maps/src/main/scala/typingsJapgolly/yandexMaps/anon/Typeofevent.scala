package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Record
import typingsJapgolly.yandexMaps.mod.IEvent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.event.Group
import typingsJapgolly.yandexMaps.mod.event.Manager
import typingsJapgolly.yandexMaps.mod.event.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofevent extends StObject {
  
  var Group: Instantiable0[typingsJapgolly.yandexMaps.mod.event.Group]
  
  var Manager: Instantiable1[
    /* params */ js.UndefOr[Context], 
    typingsJapgolly.yandexMaps.mod.event.Manager[js.Object]
  ]
  
  var Mapper: Instantiable2[
    /* targetEventManager */ IEventManager[js.Object], 
    /* mappingTable */ Record[
      String, 
      (js.Function1[/* event */ IEvent[js.Object, js.Object], (IEvent[js.Object, js.Object]) | Null]) | Boolean
    ], 
    typingsJapgolly.yandexMaps.mod.event.Mapper
  ]
}
object Typeofevent {
  
  inline def apply(
    Group: Instantiable0[Group],
    Manager: Instantiable1[/* params */ js.UndefOr[Context], Manager[js.Object]],
    Mapper: Instantiable2[
      /* targetEventManager */ IEventManager[js.Object], 
      /* mappingTable */ Record[
        String, 
        (js.Function1[/* event */ IEvent[js.Object, js.Object], (IEvent[js.Object, js.Object]) | Null]) | Boolean
      ], 
      Mapper
    ]
  ): Typeofevent = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Manager = Manager.asInstanceOf[js.Any], Mapper = Mapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofevent]
  }
  
  extension [Self <: Typeofevent](x: Self) {
    
    inline def setGroup(value: Instantiable0[Group]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setManager(value: Instantiable1[/* params */ js.UndefOr[Context], Manager[js.Object]]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
    
    inline def setMapper(
      value: Instantiable2[
          /* targetEventManager */ IEventManager[js.Object], 
          /* mappingTable */ Record[
            String, 
            (js.Function1[/* event */ IEvent[js.Object, js.Object], (IEvent[js.Object, js.Object]) | Null]) | Boolean
          ], 
          Mapper
        ]
    ): Self = StObject.set(x, "Mapper", value.asInstanceOf[js.Any])
  }
}
