package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
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
trait dxSankey
  extends StObject
     with BaseWidget[dxSankeyOptions]
     with _VizWidget {
  
  /**
    * Gets all sankey links.
    */
  def getAllLinks(): js.Array[dxSankeyLink] = js.native
  
  /**
    * Gets all sankey nodes.
    */
  def getAllNodes(): js.Array[dxSankeyNode] = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Hides all UI component tooltips.
    */
  def hideTooltip(): Unit = js.native
}
object dxSankey {
  
  type DisposingEvent = EventInfo[dxSankey]
  
  type DrawnEvent = EventInfo[dxSankey]
  
  type ExportedEvent = EventInfo[dxSankey]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxSankey]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxSankey]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxSankey]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxSankey]
  
  trait LinkClickEvent
    extends StObject
       with NativeEventInfo[dxSankey, MouseEvent | PointerEvent] {
    
    val target: dxSankeyLink
  }
  object LinkClickEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyLink): LinkClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkClickEvent]
    }
    
    extension [Self <: LinkClickEvent](x: Self) {
      
      inline def setTarget(value: dxSankeyLink): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkHoverEvent
    extends StObject
       with EventInfo[dxSankey] {
    
    val target: dxSankeyLink
  }
  object LinkHoverEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyLink): LinkHoverEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkHoverEvent]
    }
    
    extension [Self <: LinkHoverEvent](x: Self) {
      
      inline def setTarget(value: dxSankeyLink): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeClickEvent
    extends StObject
       with NativeEventInfo[dxSankey, MouseEvent | PointerEvent] {
    
    val target: dxSankeyNode
  }
  object NodeClickEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyNode): NodeClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeClickEvent]
    }
    
    extension [Self <: NodeClickEvent](x: Self) {
      
      inline def setTarget(value: dxSankeyNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeHoverEvent
    extends StObject
       with EventInfo[dxSankey] {
    
    val target: dxSankeyNode
  }
  object NodeHoverEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyNode): NodeHoverEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeHoverEvent]
    }
    
    extension [Self <: NodeHoverEvent](x: Self) {
      
      inline def setTarget(value: dxSankeyNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSankey]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSankeyOptions
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.source
    - typingsJapgolly.devextreme.devextremeStrings.target
    - typingsJapgolly.devextreme.devextremeStrings.gradient
  */
  trait SankeyColorMode extends StObject
  object SankeyColorMode {
    
    inline def gradient: typingsJapgolly.devextreme.devextremeStrings.gradient = "gradient".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.gradient]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def source: typingsJapgolly.devextreme.devextremeStrings.source = "source".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.source]
    
    inline def target: typingsJapgolly.devextreme.devextremeStrings.target = "target".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.target]
  }
}
