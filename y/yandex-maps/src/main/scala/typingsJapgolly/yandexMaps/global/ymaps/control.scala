package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.mod.IControl
import typingsJapgolly.yandexMaps.mod.control.IButtonParameters
import typingsJapgolly.yandexMaps.mod.control.IFullscreenControlParameters
import typingsJapgolly.yandexMaps.mod.control.IGeolocationControlParameters
import typingsJapgolly.yandexMaps.mod.control.IListBoxItemParameters
import typingsJapgolly.yandexMaps.mod.control.IListBoxParameters
import typingsJapgolly.yandexMaps.mod.control.IManagerOptions
import typingsJapgolly.yandexMaps.mod.control.IRouteButtonParameters
import typingsJapgolly.yandexMaps.mod.control.IRouteEditorParameters
import typingsJapgolly.yandexMaps.mod.control.IRulerControlParameters
import typingsJapgolly.yandexMaps.mod.control.ISearchControlParameters
import typingsJapgolly.yandexMaps.mod.control.ITypeSelectorParameters
import typingsJapgolly.yandexMaps.mod.control.IZoomControlParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSGlobal("ymaps.control.Button")
  @js.native
  open class Button ()
    extends typingsJapgolly.yandexMaps.mod.control.Button {
    def this(parameters: String) = this()
    def this(parameters: IButtonParameters) = this()
  }
  
  @JSGlobal("ymaps.control.FullscreenControl")
  @js.native
  open class FullscreenControl ()
    extends typingsJapgolly.yandexMaps.mod.control.FullscreenControl {
    def this(parameters: IFullscreenControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.GeolocationControl")
  @js.native
  open class GeolocationControl ()
    extends typingsJapgolly.yandexMaps.mod.control.GeolocationControl {
    def this(parameters: IGeolocationControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.ListBox")
  @js.native
  open class ListBox ()
    extends typingsJapgolly.yandexMaps.mod.control.ListBox {
    def this(parameters: IListBoxParameters) = this()
  }
  
  @JSGlobal("ymaps.control.ListBoxItem")
  @js.native
  open class ListBoxItem ()
    extends typingsJapgolly.yandexMaps.mod.control.ListBoxItem {
    def this(parameters: IListBoxItemParameters) = this()
  }
  
  @JSGlobal("ymaps.control.Manager")
  @js.native
  open class Manager protected ()
    extends typingsJapgolly.yandexMaps.mod.control.Manager {
    def this(map: typingsJapgolly.yandexMaps.mod.Map_) = this()
    def this(map: typingsJapgolly.yandexMaps.mod.Map_, controls: js.Array[String | IControl]) = this()
    def this(
      map: typingsJapgolly.yandexMaps.mod.Map_,
      controls: js.Array[String | IControl],
      options: IManagerOptions
    ) = this()
    def this(map: typingsJapgolly.yandexMaps.mod.Map_, controls: Unit, options: IManagerOptions) = this()
  }
  
  @JSGlobal("ymaps.control.RouteButton")
  @js.native
  open class RouteButton ()
    extends typingsJapgolly.yandexMaps.mod.control.RouteButton {
    def this(parameters: IRouteButtonParameters) = this()
  }
  
  @JSGlobal("ymaps.control.RouteEditor")
  @js.native
  open class RouteEditor ()
    extends typingsJapgolly.yandexMaps.mod.control.RouteEditor {
    def this(parameters: IRouteEditorParameters) = this()
  }
  
  @JSGlobal("ymaps.control.RulerControl")
  @js.native
  open class RulerControl ()
    extends typingsJapgolly.yandexMaps.mod.control.RulerControl {
    def this(parameters: IRulerControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.SearchControl")
  @js.native
  open class SearchControl ()
    extends typingsJapgolly.yandexMaps.mod.control.SearchControl {
    def this(parameters: ISearchControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.TypeSelector")
  @js.native
  open class TypeSelector ()
    extends typingsJapgolly.yandexMaps.mod.control.TypeSelector {
    def this(parameters: ITypeSelectorParameters) = this()
  }
  
  @JSGlobal("ymaps.control.ZoomControl")
  @js.native
  open class ZoomControl ()
    extends typingsJapgolly.yandexMaps.mod.control.ZoomControl {
    def this(parameters: IZoomControlParameters) = this()
  }
}
