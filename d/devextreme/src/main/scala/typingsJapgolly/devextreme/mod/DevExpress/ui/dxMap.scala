package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMap
  extends StObject
     with Widget[dxMapOptions] {
  
  def addMarker(markerOptions: js.Array[Any]): DxPromise[Any] = js.native
  /**
    * Adds a marker to the map.
    */
  def addMarker(markerOptions: Any): DxPromise[Any] = js.native
  
  def addRoute(options: js.Array[Any]): DxPromise[Any] = js.native
  /**
    * Adds a route to the map.
    */
  def addRoute(options: Any): DxPromise[Any] = js.native
  
  def removeMarker(marker: js.Array[Any]): DxPromise[Unit] = js.native
  /**
    * Removes a marker from the map.
    */
  def removeMarker(marker: Any): DxPromise[Unit] = js.native
  def removeMarker(marker: Double): DxPromise[Unit] = js.native
  
  def removeRoute(route: js.Array[Any]): DxPromise[Unit] = js.native
  /**
    * Removes a route from the map.
    */
  def removeRoute(route: Any): DxPromise[Unit] = js.native
  def removeRoute(route: Double): DxPromise[Unit] = js.native
}
object dxMap {
  
  type ClickEvent = NativeEventInfo[dxMap, MouseEvent | PointerEvent]
  
  type DisposingEvent = EventInfo[dxMap]
  
  type InitializedEvent = InitializedEventInfo[dxMap]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.bing
    - typingsJapgolly.devextreme.devextremeStrings.google
    - typingsJapgolly.devextreme.devextremeStrings.googleStatic
  */
  trait MapProvider extends StObject
  object MapProvider {
    
    inline def bing: typingsJapgolly.devextreme.devextremeStrings.bing = "bing".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bing]
    
    inline def google: typingsJapgolly.devextreme.devextremeStrings.google = "google".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.google]
    
    inline def googleStatic: typingsJapgolly.devextreme.devextremeStrings.googleStatic = "googleStatic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.googleStatic]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.hybrid
    - typingsJapgolly.devextreme.devextremeStrings.roadmap
    - typingsJapgolly.devextreme.devextremeStrings.satellite
  */
  trait MapType extends StObject
  object MapType {
    
    inline def hybrid: typingsJapgolly.devextreme.devextremeStrings.hybrid = "hybrid".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.hybrid]
    
    inline def roadmap: typingsJapgolly.devextreme.devextremeStrings.roadmap = "roadmap".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.roadmap]
    
    inline def satellite: typingsJapgolly.devextreme.devextremeStrings.satellite = "satellite".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.satellite]
  }
  
  trait MarkerAddedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: Any
    
    var originalMarker: Any
  }
  object MarkerAddedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], options: Any, originalMarker: Any): MarkerAddedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalMarker = originalMarker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerAddedEvent]
    }
    
    extension [Self <: MarkerAddedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalMarker(value: Any): Self = StObject.set(x, "originalMarker", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerRemovedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: js.UndefOr[Any] = js.undefined
  }
  object MarkerRemovedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement]): MarkerRemovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerRemovedEvent]
    }
    
    extension [Self <: MarkerRemovedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxMapOptions
  
  trait ReadyEvent
    extends StObject
       with EventInfo[dxMap] {
    
    var originalMap: Any
  }
  object ReadyEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], originalMap: Any): ReadyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], originalMap = originalMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadyEvent]
    }
    
    extension [Self <: ReadyEvent](x: Self) {
      
      inline def setOriginalMap(value: Any): Self = StObject.set(x, "originalMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteAddedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: Any
    
    var originalRoute: Any
  }
  object RouteAddedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], options: Any, originalRoute: Any): RouteAddedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalRoute = originalRoute.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteAddedEvent]
    }
    
    extension [Self <: RouteAddedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalRoute(value: Any): Self = StObject.set(x, "originalRoute", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.driving
    - typingsJapgolly.devextreme.devextremeStrings.walking
  */
  trait RouteMode extends StObject
  object RouteMode {
    
    inline def driving: typingsJapgolly.devextreme.devextremeStrings.driving = "driving".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.driving]
    
    inline def walking: typingsJapgolly.devextreme.devextremeStrings.walking = "walking".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.walking]
  }
  
  trait RouteRemovedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: js.UndefOr[Any] = js.undefined
  }
  object RouteRemovedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement]): RouteRemovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteRemovedEvent]
    }
    
    extension [Self <: RouteRemovedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
