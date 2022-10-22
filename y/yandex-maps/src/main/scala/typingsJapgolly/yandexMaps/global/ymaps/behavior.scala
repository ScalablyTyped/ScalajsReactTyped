package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.mod.behavior.IDblClickZoomOptions
import typingsJapgolly.yandexMaps.mod.behavior.IDragOptions
import typingsJapgolly.yandexMaps.mod.behavior.ILeftMouseButtonMagnifierOptions
import typingsJapgolly.yandexMaps.mod.behavior.IMultiTouchOptions
import typingsJapgolly.yandexMaps.mod.behavior.IRightMouseButtonMagnifierOptions
import typingsJapgolly.yandexMaps.mod.behavior.IRulerOptions
import typingsJapgolly.yandexMaps.mod.behavior.IScrollZoomOptions
import typingsJapgolly.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behavior {
  
  @JSGlobal("ymaps.behavior.DblClickZoom")
  @js.native
  open class DblClickZoom ()
    extends typingsJapgolly.yandexMaps.mod.behavior.DblClickZoom {
    def this(options: IDblClickZoomOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.Drag")
  @js.native
  open class Drag ()
    extends typingsJapgolly.yandexMaps.mod.behavior.Drag {
    def this(options: IDragOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.LeftMouseButtonMagnifier")
  @js.native
  open class LeftMouseButtonMagnifier ()
    extends typingsJapgolly.yandexMaps.mod.behavior.LeftMouseButtonMagnifier {
    def this(options: ILeftMouseButtonMagnifierOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.MultiTouch")
  @js.native
  open class MultiTouch ()
    extends typingsJapgolly.yandexMaps.mod.behavior.MultiTouch {
    def this(options: IMultiTouchOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.RightMouseButtonMagnifier")
  @js.native
  open class RightMouseButtonMagnifier ()
    extends typingsJapgolly.yandexMaps.mod.behavior.RightMouseButtonMagnifier {
    def this(options: IRightMouseButtonMagnifierOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.RouteEditor")
  @js.native
  open class RouteEditor ()
    extends typingsJapgolly.yandexMaps.mod.behavior.RouteEditor
  
  @JSGlobal("ymaps.behavior.Ruler")
  @js.native
  open class Ruler ()
    extends typingsJapgolly.yandexMaps.mod.behavior.Ruler {
    def this(options: IRulerOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.ScrollZoom")
  @js.native
  open class ScrollZoom ()
    extends typingsJapgolly.yandexMaps.mod.behavior.ScrollZoom {
    def this(options: IScrollZoomOptions) = this()
  }
  
  @JSGlobal("ymaps.behavior.storage")
  @js.native
  val storage: Storage = js.native
}
