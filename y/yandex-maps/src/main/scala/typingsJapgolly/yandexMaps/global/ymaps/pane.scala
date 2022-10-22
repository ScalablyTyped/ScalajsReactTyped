package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.anon.CheckContextMenu
import typingsJapgolly.yandexMaps.anon.Css
import typingsJapgolly.yandexMaps.anon.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pane {
  
  @JSGlobal("ymaps.pane.EventsPane")
  @js.native
  open class EventsPane protected ()
    extends typingsJapgolly.yandexMaps.mod.pane.EventsPane {
    def this(map: typingsJapgolly.yandexMaps.mod.Map_, params: CheckContextMenu) = this()
  }
  
  @JSGlobal("ymaps.pane.MovablePane")
  @js.native
  open class MovablePane protected ()
    extends typingsJapgolly.yandexMaps.mod.pane.MovablePane {
    def this(map: typingsJapgolly.yandexMaps.mod.Map_, params: Css) = this()
  }
  
  @JSGlobal("ymaps.pane.StaticPane")
  @js.native
  open class StaticPane protected ()
    extends typingsJapgolly.yandexMaps.mod.pane.StaticPane {
    def this(map: typingsJapgolly.yandexMaps.mod.Map_, params: Margin) = this()
  }
}
