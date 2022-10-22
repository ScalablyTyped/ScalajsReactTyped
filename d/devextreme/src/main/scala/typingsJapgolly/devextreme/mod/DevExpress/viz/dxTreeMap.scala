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
trait dxTreeMap
  extends StObject
     with BaseWidget[dxTreeMapOptions]
     with _VizWidget {
  
  /**
    * Deselects all nodes in the UI component.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Drills one level up.
    */
  def drillUp(): Unit = js.native
  
  /**
    * Gets the current node.
    */
  def getCurrentNode(): dxTreeMapNode = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the root node.
    */
  def getRootNode(): dxTreeMapNode = js.native
  
  /**
    * Hides the tooltip.
    */
  def hideTooltip(): Unit = js.native
  
  /**
    * Resets the drill down level.
    */
  def resetDrillDown(): Unit = js.native
}
object dxTreeMap {
  
  trait ClickEvent
    extends StObject
       with NativeEventInfo[dxTreeMap, MouseEvent | PointerEvent] {
    
    val node: dxTreeMapNode
  }
  object ClickEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): ClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxTreeMap]
  
  type DrawnEvent = EventInfo[dxTreeMap]
  
  trait DrillEvent
    extends StObject
       with EventInfo[dxTreeMap] {
    
    val node: dxTreeMapNode
  }
  object DrillEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): DrillEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrillEvent]
    }
    
    extension [Self <: DrillEvent](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type ExportedEvent = EventInfo[dxTreeMap]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxTreeMap]
  
  trait HoverChangedEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with InteractionInfo
  object HoverChangedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): HoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverChangedEvent]
    }
  }
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxTreeMap]
  
  trait InteractionInfo extends StObject {
    
    val node: dxTreeMapNode
  }
  object InteractionInfo {
    
    inline def apply(node: dxTreeMapNode): InteractionInfo = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionInfo]
    }
    
    extension [Self <: InteractionInfo](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodesInitializedEvent
    extends StObject
       with EventInfo[dxTreeMap] {
    
    val root: dxTreeMapNode
  }
  object NodesInitializedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], root: dxTreeMapNode): NodesInitializedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesInitializedEvent]
    }
    
    extension [Self <: NodesInitializedEvent](x: Self) {
      
      inline def setRoot(value: dxTreeMapNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodesRenderingEvent
    extends StObject
       with EventInfo[dxTreeMap] {
    
    val node: dxTreeMapNode
  }
  object NodesRenderingEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): NodesRenderingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesRenderingEvent]
    }
    
    extension [Self <: NodesRenderingEvent](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxTreeMapOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with InteractionInfo
  object SelectionChangedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.discrete
    - typingsJapgolly.devextreme.devextremeStrings.gradient
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.range
  */
  trait TreeMapColorizerType extends StObject
  object TreeMapColorizerType {
    
    inline def discrete: typingsJapgolly.devextreme.devextremeStrings.discrete = "discrete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.discrete]
    
    inline def gradient: typingsJapgolly.devextreme.devextremeStrings.gradient = "gradient".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.gradient]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def range: typingsJapgolly.devextreme.devextremeStrings.range = "range".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.range]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.sliceanddice
    - typingsJapgolly.devextreme.devextremeStrings.squarified
    - typingsJapgolly.devextreme.devextremeStrings.strip
  */
  trait TreeMapLayoutAlgorithm extends StObject
  object TreeMapLayoutAlgorithm {
    
    inline def sliceanddice: typingsJapgolly.devextreme.devextremeStrings.sliceanddice = "sliceanddice".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.sliceanddice]
    
    inline def squarified: typingsJapgolly.devextreme.devextremeStrings.squarified = "squarified".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.squarified]
    
    inline def strip: typingsJapgolly.devextreme.devextremeStrings.strip = "strip".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.strip]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.leftBottomRightTop
    - typingsJapgolly.devextreme.devextremeStrings.leftTopRightBottom
    - typingsJapgolly.devextreme.devextremeStrings.rightBottomLeftTop
    - typingsJapgolly.devextreme.devextremeStrings.rightTopLeftBottom
  */
  trait TreeMapLayoutDirection extends StObject
  object TreeMapLayoutDirection {
    
    inline def leftBottomRightTop: typingsJapgolly.devextreme.devextremeStrings.leftBottomRightTop = "leftBottomRightTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.leftBottomRightTop]
    
    inline def leftTopRightBottom: typingsJapgolly.devextreme.devextremeStrings.leftTopRightBottom = "leftTopRightBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.leftTopRightBottom]
    
    inline def rightBottomLeftTop: typingsJapgolly.devextreme.devextremeStrings.rightBottomLeftTop = "rightBottomLeftTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rightBottomLeftTop]
    
    inline def rightTopLeftBottom: typingsJapgolly.devextreme.devextremeStrings.rightTopLeftBottom = "rightTopLeftBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rightTopLeftBottom]
  }
}
