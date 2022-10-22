package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxVectorMap
  extends StObject
     with BaseWidget[dxVectorMapOptions]
     with _VizWidget {
  
  /**
    * Gets the current map center coordinates.
    */
  def center(): js.Array[Double] = js.native
  /**
    * Sets the map center coordinates.
    */
  def center(centerCoordinates: js.Array[Double]): Unit = js.native
  
  /**
    * Deselects all the selected area and markers on a map at once. The areas and markers are displayed in their initial style after.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Converts client area coordinates into map coordinates.
    * @deprecated Use convertToGeo instead.
    */
  def convertCoordinates(x: Double, y: Double): js.Array[Double] = js.native
  
  /**
    * Converts coordinates from pixels to the dataSource coordinate system.
    */
  def convertToGeo(x: Double, y: Double): js.Array[Double] = js.native
  
  /**
    * Converts coordinates from the dataSource coordinate system to pixels.
    */
  def convertToXY(longitude: Double, latitude: Double): js.Array[Double] = js.native
  
  /**
    * Gets a layer with a specific index.
    */
  def getLayerByIndex(index: Double): MapLayer = js.native
  
  /**
    * Gets a layer with a specific name.
    */
  def getLayerByName(name: String): MapLayer = js.native
  
  /**
    * Gets all layers.
    */
  def getLayers(): js.Array[MapLayer] = js.native
  
  /**
    * Gets the current map viewport coordinates.
    */
  def viewport(): js.Array[Double] = js.native
  /**
    * Sets the map viewport coordinates.
    */
  def viewport(viewportCoordinates: js.Array[Double]): Unit = js.native
  
  /**
    * Gets the current zoom factor value.
    */
  def zoomFactor(): Double = js.native
  /**
    * Sets the zoom factor value.
    */
  def zoomFactor(zoomFactor: Double): Unit = js.native
}
object dxVectorMap {
  
  trait CenterChangedEvent
    extends StObject
       with EventInfo[dxVectorMap] {
    
    val center: js.Array[Double]
  }
  object CenterChangedEvent {
    
    inline def apply(center: js.Array[Double], component: dxVectorMap, element: DxElement_[HTMLElement]): CenterChangedEvent = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CenterChangedEvent]
    }
    
    extension [Self <: CenterChangedEvent](x: Self) {
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    }
  }
  
  trait ClickEvent
    extends StObject
       with NativeEventInfo[dxVectorMap, MouseEvent | PointerEvent] {
    
    val target: MapLayerElement
  }
  object ClickEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], target: MapLayerElement): ClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setTarget(value: MapLayerElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxVectorMap]
  
  type DrawnEvent = EventInfo[dxVectorMap]
  
  type ExportedEvent = EventInfo[dxVectorMap]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxVectorMap]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxVectorMap]
  
  type LegendItem = VectorMapLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxVectorMapOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxVectorMap] {
    
    val target: MapLayerElement
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], target: MapLayerElement): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setTarget(value: MapLayerElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipInfo extends StObject {
    
    var target: js.UndefOr[MapLayerElement | dxVectorMapAnnotationConfig] = js.undefined
  }
  object TooltipInfo {
    
    inline def apply(): TooltipInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: MapLayerElement | dxVectorMapAnnotationConfig): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxVectorMap]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.area
    - typingsJapgolly.devextreme.devextremeStrings.line
    - typingsJapgolly.devextreme.devextremeStrings.marker
  */
  trait VectorMapLayerType extends StObject
  object VectorMapLayerType {
    
    inline def area: typingsJapgolly.devextreme.devextremeStrings.area = "area".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.area]
    
    inline def line: typingsJapgolly.devextreme.devextremeStrings.line = "line".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.line]
    
    inline def marker: typingsJapgolly.devextreme.devextremeStrings.marker = "marker".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.marker]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.circle
    - typingsJapgolly.devextreme.devextremeStrings.square
  */
  trait VectorMapMarkerShape extends StObject
  object VectorMapMarkerShape {
    
    inline def circle: typingsJapgolly.devextreme.devextremeStrings.circle = "circle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.circle]
    
    inline def square: typingsJapgolly.devextreme.devextremeStrings.square = "square".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.bubble
    - typingsJapgolly.devextreme.devextremeStrings.dot
    - typingsJapgolly.devextreme.devextremeStrings.image
    - typingsJapgolly.devextreme.devextremeStrings.pie
  */
  trait VectorMapMarkerType extends StObject
  object VectorMapMarkerType {
    
    inline def bubble: typingsJapgolly.devextreme.devextremeStrings.bubble = "bubble".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bubble]
    
    inline def dot: typingsJapgolly.devextreme.devextremeStrings.dot = "dot".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dot]
    
    inline def image: typingsJapgolly.devextreme.devextremeStrings.image = "image".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.image]
    
    inline def pie: typingsJapgolly.devextreme.devextremeStrings.pie = "pie".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pie]
  }
  
  trait ZoomFactorChangedEvent
    extends StObject
       with EventInfo[dxVectorMap] {
    
    val zoomFactor: Double
  }
  object ZoomFactorChangedEvent {
    
    inline def apply(component: dxVectorMap, element: DxElement_[HTMLElement], zoomFactor: Double): ZoomFactorChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomFactorChangedEvent]
    }
    
    extension [Self <: ZoomFactorChangedEvent](x: Self) {
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
}
