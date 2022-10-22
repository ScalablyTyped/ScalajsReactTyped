package typingsJapgolly.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHotspot
  extends StObject
     with IEventEmitter
object IHotspot {
  
  inline def apply(events: IEventManager[js.Object]): IHotspot = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspot]
  }
}
