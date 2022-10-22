package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.devextremeStrings.addShape
import typingsJapgolly.devextreme.devextremeStrings.addShapeFromToolbox
import typingsJapgolly.devextreme.devextremeStrings.changeConnection
import typingsJapgolly.devextreme.devextremeStrings.changeConnectorPoints
import typingsJapgolly.devextreme.devextremeStrings.deleteConnector
import typingsJapgolly.devextreme.devextremeStrings.deleteShape
import typingsJapgolly.devextreme.devextremeStrings.merge_
import typingsJapgolly.devextreme.devextremeStrings.png_
import typingsJapgolly.devextreme.devextremeStrings.svg_
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram.DiagramExportFormat
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagram
  extends StObject
     with Widget[dxDiagramOptions] {
  
  /**
    * Exports the diagram data to a JSON object.
    */
  def `export`(): String = js.native
  
  /**
    * Exports the diagram to an image format.
    */
  def exportTo(format: DiagramExportFormat, callback: js.Function): Unit = js.native
  
  /**
    * Fits the diagram content into the work area. The maximum scale is 100%.
    */
  def fitToContent(): Unit = js.native
  
  /**
    * Fits the diagram content&apos;s width into the work area width. The maximum scale is 100%.
    */
  def fitToWidth(): Unit = js.native
  
  /**
    * Returns the DataSource instance.
    */
  def getEdgeDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Returns a shape or connector object specified by its internal identifier.
    */
  def getItemById(id: String): Item = js.native
  
  /**
    * Returns a shape or connector object specified by its key.
    */
  def getItemByKey(key: js.Object): Item = js.native
  
  /**
    * Returns an array of diagram items.
    */
  def getItems(): js.Array[Item] = js.native
  
  /**
    * Gets the DataSource instance.
    */
  def getNodeDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Returns an array of selected diagram items.
    */
  def getSelectedItems(): js.Array[Item] = js.native
  
  /**
    * Imports the diagram data.
    */
  def `import`(data: String): Unit = js.native
  def `import`(data: String, updateExistingItemsOnly: Boolean): Unit = js.native
  
  /**
    * Scrolls the view area to the specified item.
    */
  def scrollToItem(item: Item): Unit = js.native
  
  /**
    * Selects the specified items.
    */
  def setSelectedItems(items: js.Array[Item]): Unit = js.native
  
  /**
    * Updates the diagram toolboxes.
    */
  def updateToolbox(): Unit = js.native
}
object dxDiagram {
  
  type ContentReadyEvent = EventInfo[dxDiagram]
  
  trait CustomCommandEvent extends StObject {
    
    val component: dxDiagram
    
    val element: DxElement_[HTMLElement]
    
    val name: String
  }
  object CustomCommandEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], name: String): CustomCommandEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomCommandEvent]
    }
    
    extension [Self <: CustomCommandEvent](x: Self) {
      
      inline def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomShapeTemplateData extends StObject {
    
    val item: dxDiagramShape
  }
  object CustomShapeTemplateData {
    
    inline def apply(item: dxDiagramShape): CustomShapeTemplateData = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomShapeTemplateData]
    }
    
    extension [Self <: CustomShapeTemplateData](x: Self) {
      
      inline def setItem(value: dxDiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomShapeToolboxTemplateData extends StObject {
    
    val item: dxDiagramShape
  }
  object CustomShapeToolboxTemplateData {
    
    inline def apply(item: dxDiagramShape): CustomShapeToolboxTemplateData = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomShapeToolboxTemplateData]
    }
    
    extension [Self <: CustomShapeToolboxTemplateData](x: Self) {
      
      inline def setItem(value: dxDiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.fitContent
    - typingsJapgolly.devextreme.devextremeStrings.fitWidth
    - typingsJapgolly.devextreme.devextremeStrings.disabled
  */
  trait DiagramAutoZoomMode extends StObject
  object DiagramAutoZoomMode {
    
    inline def disabled: typingsJapgolly.devextreme.devextremeStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.disabled]
    
    inline def fitContent: typingsJapgolly.devextreme.devextremeStrings.fitContent = "fitContent".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fitContent]
    
    inline def fitWidth: typingsJapgolly.devextreme.devextremeStrings.fitWidth = "fitWidth".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fitWidth]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.separator
    - typingsJapgolly.devextreme.devextremeStrings.exportSvg
    - typingsJapgolly.devextreme.devextremeStrings.exportPng
    - typingsJapgolly.devextreme.devextremeStrings.exportJpg
    - typingsJapgolly.devextreme.devextremeStrings.undo
    - typingsJapgolly.devextreme.devextremeStrings.redo
    - typingsJapgolly.devextreme.devextremeStrings.cut
    - typingsJapgolly.devextreme.devextremeStrings.copy
    - typingsJapgolly.devextreme.devextremeStrings.paste
    - typingsJapgolly.devextreme.devextremeStrings.selectAll
    - typingsJapgolly.devextreme.devextremeStrings.delete
    - typingsJapgolly.devextreme.devextremeStrings.fontName
    - typingsJapgolly.devextreme.devextremeStrings.fontSize
    - typingsJapgolly.devextreme.devextremeStrings.bold
    - typingsJapgolly.devextreme.devextremeStrings.italic
    - typingsJapgolly.devextreme.devextremeStrings.underline
    - typingsJapgolly.devextreme.devextremeStrings.fontColor
    - typingsJapgolly.devextreme.devextremeStrings.lineStyle
    - typingsJapgolly.devextreme.devextremeStrings.lineWidth
    - typingsJapgolly.devextreme.devextremeStrings.lineColor
    - typingsJapgolly.devextreme.devextremeStrings.fillColor
    - typingsJapgolly.devextreme.devextremeStrings.textAlignLeft
    - typingsJapgolly.devextreme.devextremeStrings.textAlignCenter
    - typingsJapgolly.devextreme.devextremeStrings.textAlignRight
    - typingsJapgolly.devextreme.devextremeStrings.lock
    - typingsJapgolly.devextreme.devextremeStrings.unlock
    - typingsJapgolly.devextreme.devextremeStrings.sendToBack
    - typingsJapgolly.devextreme.devextremeStrings.bringToFront
    - typingsJapgolly.devextreme.devextremeStrings.insertShapeImage
    - typingsJapgolly.devextreme.devextremeStrings.editShapeImage
    - typingsJapgolly.devextreme.devextremeStrings.deleteShapeImage
    - typingsJapgolly.devextreme.devextremeStrings.connectorLineType
    - typingsJapgolly.devextreme.devextremeStrings.connectorLineStart
    - typingsJapgolly.devextreme.devextremeStrings.connectorLineEnd
    - typingsJapgolly.devextreme.devextremeStrings.layoutTreeTopToBottom
    - typingsJapgolly.devextreme.devextremeStrings.layoutTreeBottomToTop
    - typingsJapgolly.devextreme.devextremeStrings.layoutTreeLeftToRight
    - typingsJapgolly.devextreme.devextremeStrings.layoutTreeRightToLeft
    - typingsJapgolly.devextreme.devextremeStrings.layoutLayeredTopToBottom
    - typingsJapgolly.devextreme.devextremeStrings.layoutLayeredBottomToTop
    - typingsJapgolly.devextreme.devextremeStrings.layoutLayeredLeftToRight
    - typingsJapgolly.devextreme.devextremeStrings.layoutLayeredRightToLeft
    - typingsJapgolly.devextreme.devextremeStrings.fullScreen
    - typingsJapgolly.devextreme.devextremeStrings.zoomLevel
    - typingsJapgolly.devextreme.devextremeStrings.showGrid
    - typingsJapgolly.devextreme.devextremeStrings.snapToGrid
    - typingsJapgolly.devextreme.devextremeStrings.gridSize
    - typingsJapgolly.devextreme.devextremeStrings.units
    - typingsJapgolly.devextreme.devextremeStrings.pageSize
    - typingsJapgolly.devextreme.devextremeStrings.pageOrientation
    - typingsJapgolly.devextreme.devextremeStrings.pageColor
    - typingsJapgolly.devextreme.devextremeStrings.simpleView
    - typingsJapgolly.devextreme.devextremeStrings.toolbox
  */
  trait DiagramCommand extends StObject
  object DiagramCommand {
    
    inline def bold: typingsJapgolly.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bold]
    
    inline def bringToFront: typingsJapgolly.devextreme.devextremeStrings.bringToFront = "bringToFront".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bringToFront]
    
    inline def connectorLineEnd: typingsJapgolly.devextreme.devextremeStrings.connectorLineEnd = "connectorLineEnd".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.connectorLineEnd]
    
    inline def connectorLineStart: typingsJapgolly.devextreme.devextremeStrings.connectorLineStart = "connectorLineStart".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.connectorLineStart]
    
    inline def connectorLineType: typingsJapgolly.devextreme.devextremeStrings.connectorLineType = "connectorLineType".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.connectorLineType]
    
    inline def copy: typingsJapgolly.devextreme.devextremeStrings.copy = "copy".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.copy]
    
    inline def cut: typingsJapgolly.devextreme.devextremeStrings.cut = "cut".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cut]
    
    inline def delete: typingsJapgolly.devextreme.devextremeStrings.delete = "delete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.delete]
    
    inline def deleteShapeImage: typingsJapgolly.devextreme.devextremeStrings.deleteShapeImage = "deleteShapeImage".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.deleteShapeImage]
    
    inline def editShapeImage: typingsJapgolly.devextreme.devextremeStrings.editShapeImage = "editShapeImage".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.editShapeImage]
    
    inline def exportJpg: typingsJapgolly.devextreme.devextremeStrings.exportJpg = "exportJpg".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.exportJpg]
    
    inline def exportPng: typingsJapgolly.devextreme.devextremeStrings.exportPng = "exportPng".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.exportPng]
    
    inline def exportSvg: typingsJapgolly.devextreme.devextremeStrings.exportSvg = "exportSvg".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.exportSvg]
    
    inline def fillColor: typingsJapgolly.devextreme.devextremeStrings.fillColor = "fillColor".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fillColor]
    
    inline def fontColor: typingsJapgolly.devextreme.devextremeStrings.fontColor = "fontColor".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fontColor]
    
    inline def fontName: typingsJapgolly.devextreme.devextremeStrings.fontName = "fontName".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fontName]
    
    inline def fontSize: typingsJapgolly.devextreme.devextremeStrings.fontSize = "fontSize".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fontSize]
    
    inline def fullScreen: typingsJapgolly.devextreme.devextremeStrings.fullScreen = "fullScreen".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fullScreen]
    
    inline def gridSize: typingsJapgolly.devextreme.devextremeStrings.gridSize = "gridSize".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.gridSize]
    
    inline def insertShapeImage: typingsJapgolly.devextreme.devextremeStrings.insertShapeImage = "insertShapeImage".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.insertShapeImage]
    
    inline def italic: typingsJapgolly.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.italic]
    
    inline def layoutLayeredBottomToTop: typingsJapgolly.devextreme.devextremeStrings.layoutLayeredBottomToTop = "layoutLayeredBottomToTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutLayeredBottomToTop]
    
    inline def layoutLayeredLeftToRight: typingsJapgolly.devextreme.devextremeStrings.layoutLayeredLeftToRight = "layoutLayeredLeftToRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutLayeredLeftToRight]
    
    inline def layoutLayeredRightToLeft: typingsJapgolly.devextreme.devextremeStrings.layoutLayeredRightToLeft = "layoutLayeredRightToLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutLayeredRightToLeft]
    
    inline def layoutLayeredTopToBottom: typingsJapgolly.devextreme.devextremeStrings.layoutLayeredTopToBottom = "layoutLayeredTopToBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutLayeredTopToBottom]
    
    inline def layoutTreeBottomToTop: typingsJapgolly.devextreme.devextremeStrings.layoutTreeBottomToTop = "layoutTreeBottomToTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutTreeBottomToTop]
    
    inline def layoutTreeLeftToRight: typingsJapgolly.devextreme.devextremeStrings.layoutTreeLeftToRight = "layoutTreeLeftToRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutTreeLeftToRight]
    
    inline def layoutTreeRightToLeft: typingsJapgolly.devextreme.devextremeStrings.layoutTreeRightToLeft = "layoutTreeRightToLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutTreeRightToLeft]
    
    inline def layoutTreeTopToBottom: typingsJapgolly.devextreme.devextremeStrings.layoutTreeTopToBottom = "layoutTreeTopToBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layoutTreeTopToBottom]
    
    inline def lineColor: typingsJapgolly.devextreme.devextremeStrings.lineColor = "lineColor".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.lineColor]
    
    inline def lineStyle: typingsJapgolly.devextreme.devextremeStrings.lineStyle = "lineStyle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.lineStyle]
    
    inline def lineWidth: typingsJapgolly.devextreme.devextremeStrings.lineWidth = "lineWidth".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.lineWidth]
    
    inline def lock: typingsJapgolly.devextreme.devextremeStrings.lock = "lock".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.lock]
    
    inline def pageColor: typingsJapgolly.devextreme.devextremeStrings.pageColor = "pageColor".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pageColor]
    
    inline def pageOrientation: typingsJapgolly.devextreme.devextremeStrings.pageOrientation = "pageOrientation".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pageOrientation]
    
    inline def pageSize: typingsJapgolly.devextreme.devextremeStrings.pageSize = "pageSize".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pageSize]
    
    inline def paste: typingsJapgolly.devextreme.devextremeStrings.paste = "paste".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.paste]
    
    inline def redo: typingsJapgolly.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.redo]
    
    inline def selectAll: typingsJapgolly.devextreme.devextremeStrings.selectAll = "selectAll".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.selectAll]
    
    inline def sendToBack: typingsJapgolly.devextreme.devextremeStrings.sendToBack = "sendToBack".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.sendToBack]
    
    inline def separator: typingsJapgolly.devextreme.devextremeStrings.separator = "separator".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.separator]
    
    inline def showGrid: typingsJapgolly.devextreme.devextremeStrings.showGrid = "showGrid".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.showGrid]
    
    inline def simpleView: typingsJapgolly.devextreme.devextremeStrings.simpleView = "simpleView".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.simpleView]
    
    inline def snapToGrid: typingsJapgolly.devextreme.devextremeStrings.snapToGrid = "snapToGrid".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.snapToGrid]
    
    inline def textAlignCenter: typingsJapgolly.devextreme.devextremeStrings.textAlignCenter = "textAlignCenter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.textAlignCenter]
    
    inline def textAlignLeft: typingsJapgolly.devextreme.devextremeStrings.textAlignLeft = "textAlignLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.textAlignLeft]
    
    inline def textAlignRight: typingsJapgolly.devextreme.devextremeStrings.textAlignRight = "textAlignRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.textAlignRight]
    
    inline def toolbox: typingsJapgolly.devextreme.devextremeStrings.toolbox = "toolbox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.toolbox]
    
    inline def underline: typingsJapgolly.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.underline]
    
    inline def undo: typingsJapgolly.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.undo]
    
    inline def units: typingsJapgolly.devextreme.devextremeStrings.units = "units".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.units]
    
    inline def unlock: typingsJapgolly.devextreme.devextremeStrings.unlock = "unlock".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.unlock]
    
    inline def zoomLevel: typingsJapgolly.devextreme.devextremeStrings.zoomLevel = "zoomLevel".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.zoomLevel]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.arrow
    - typingsJapgolly.devextreme.devextremeStrings.outlinedTriangle
    - typingsJapgolly.devextreme.devextremeStrings.filledTriangle
  */
  trait DiagramConnectorLineEnd extends StObject
  object DiagramConnectorLineEnd {
    
    inline def arrow: typingsJapgolly.devextreme.devextremeStrings.arrow = "arrow".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrow]
    
    inline def filledTriangle: typingsJapgolly.devextreme.devextremeStrings.filledTriangle = "filledTriangle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.filledTriangle]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def outlinedTriangle: typingsJapgolly.devextreme.devextremeStrings.outlinedTriangle = "outlinedTriangle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.outlinedTriangle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.straight
    - typingsJapgolly.devextreme.devextremeStrings.orthogonal
  */
  trait DiagramConnectorLineType extends StObject
  object DiagramConnectorLineType {
    
    inline def orthogonal: typingsJapgolly.devextreme.devextremeStrings.orthogonal = "orthogonal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.orthogonal]
    
    inline def straight: typingsJapgolly.devextreme.devextremeStrings.straight = "straight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.straight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.start
    - typingsJapgolly.devextreme.devextremeStrings.end
  */
  trait DiagramConnectorPosition extends StObject
  object DiagramConnectorPosition {
    
    inline def end: typingsJapgolly.devextreme.devextremeStrings.end = "end".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.end]
    
    inline def start: typingsJapgolly.devextreme.devextremeStrings.start = "start".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.auto
    - typingsJapgolly.devextreme.devextremeStrings.off
    - typingsJapgolly.devextreme.devextremeStrings.tree
    - typingsJapgolly.devextreme.devextremeStrings.layered
  */
  trait DiagramDataLayoutType extends StObject
  object DiagramDataLayoutType {
    
    inline def auto: typingsJapgolly.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.auto]
    
    inline def layered: typingsJapgolly.devextreme.devextremeStrings.layered = "layered".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.layered]
    
    inline def off: typingsJapgolly.devextreme.devextremeStrings.off = "off".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.off]
    
    inline def tree: typingsJapgolly.devextreme.devextremeStrings.tree = "tree".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.tree]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.svg_
    - typingsJapgolly.devextreme.devextremeStrings.png_
    - typingsJapgolly.devextreme.devextremeStrings.jpg
  */
  trait DiagramExportFormat extends StObject
  object DiagramExportFormat {
    
    inline def jpg: typingsJapgolly.devextreme.devextremeStrings.jpg = "jpg".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.jpg]
    
    inline def png: png_ = "png".asInstanceOf[png_]
    
    inline def svg: svg_ = "svg".asInstanceOf[svg_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.shape
    - typingsJapgolly.devextreme.devextremeStrings.connector
  */
  trait DiagramItemType extends StObject
  object DiagramItemType {
    
    inline def connector: typingsJapgolly.devextreme.devextremeStrings.connector = "connector".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.connector]
    
    inline def shape: typingsJapgolly.devextreme.devextremeStrings.shape = "shape".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.shape]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.auto
    - typingsJapgolly.devextreme.devextremeStrings.visible
    - typingsJapgolly.devextreme.devextremeStrings.collapsed
    - typingsJapgolly.devextreme.devextremeStrings.disabled
  */
  trait DiagramPanelVisibility extends StObject
  object DiagramPanelVisibility {
    
    inline def auto: typingsJapgolly.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.auto]
    
    inline def collapsed: typingsJapgolly.devextreme.devextremeStrings.collapsed = "collapsed".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.collapsed]
    
    inline def disabled: typingsJapgolly.devextreme.devextremeStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.disabled]
    
    inline def visible: typingsJapgolly.devextreme.devextremeStrings.visible = "visible".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.visible]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.checkUIElementAvailability
    - typingsJapgolly.devextreme.devextremeStrings.modelModification
  */
  trait DiagramRequestEditOperationReason extends StObject
  object DiagramRequestEditOperationReason {
    
    inline def checkUIElementAvailability: typingsJapgolly.devextreme.devextremeStrings.checkUIElementAvailability = "checkUIElementAvailability".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.checkUIElementAvailability]
    
    inline def modelModification: typingsJapgolly.devextreme.devextremeStrings.modelModification = "modelModification".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.modelModification]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.general
    - typingsJapgolly.devextreme.devextremeStrings.flowchart
    - typingsJapgolly.devextreme.devextremeStrings.orgChart
    - typingsJapgolly.devextreme.devextremeStrings.containers
    - typingsJapgolly.devextreme.devextremeStrings.custom
  */
  trait DiagramShapeCategory extends StObject
  object DiagramShapeCategory {
    
    inline def containers: typingsJapgolly.devextreme.devextremeStrings.containers = "containers".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.containers]
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
    
    inline def flowchart: typingsJapgolly.devextreme.devextremeStrings.flowchart = "flowchart".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.flowchart]
    
    inline def general: typingsJapgolly.devextreme.devextremeStrings.general = "general".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.general]
    
    inline def orgChart: typingsJapgolly.devextreme.devextremeStrings.orgChart = "orgChart".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.orgChart]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.text
    - typingsJapgolly.devextreme.devextremeStrings.rectangle
    - typingsJapgolly.devextreme.devextremeStrings.ellipse
    - typingsJapgolly.devextreme.devextremeStrings.cross
    - typingsJapgolly.devextreme.devextremeStrings.triangle
    - typingsJapgolly.devextreme.devextremeStrings.diamond
    - typingsJapgolly.devextreme.devextremeStrings.heart
    - typingsJapgolly.devextreme.devextremeStrings.pentagon
    - typingsJapgolly.devextreme.devextremeStrings.hexagon
    - typingsJapgolly.devextreme.devextremeStrings.octagon
    - typingsJapgolly.devextreme.devextremeStrings.star
    - typingsJapgolly.devextreme.devextremeStrings.arrowLeft
    - typingsJapgolly.devextreme.devextremeStrings.arrowTop
    - typingsJapgolly.devextreme.devextremeStrings.arrowRight
    - typingsJapgolly.devextreme.devextremeStrings.arrowBottom
    - typingsJapgolly.devextreme.devextremeStrings.arrowNorthSouth
    - typingsJapgolly.devextreme.devextremeStrings.arrowEastWest
    - typingsJapgolly.devextreme.devextremeStrings.process
    - typingsJapgolly.devextreme.devextremeStrings.decision
    - typingsJapgolly.devextreme.devextremeStrings.terminator
    - typingsJapgolly.devextreme.devextremeStrings.predefinedProcess
    - typingsJapgolly.devextreme.devextremeStrings.document
    - typingsJapgolly.devextreme.devextremeStrings.multipleDocuments
    - typingsJapgolly.devextreme.devextremeStrings.manualInput
    - typingsJapgolly.devextreme.devextremeStrings.preparation
    - typingsJapgolly.devextreme.devextremeStrings.data
    - typingsJapgolly.devextreme.devextremeStrings.database
    - typingsJapgolly.devextreme.devextremeStrings.hardDisk
    - typingsJapgolly.devextreme.devextremeStrings.internalStorage
    - typingsJapgolly.devextreme.devextremeStrings.paperTape
    - typingsJapgolly.devextreme.devextremeStrings.manualOperation
    - typingsJapgolly.devextreme.devextremeStrings.delay
    - typingsJapgolly.devextreme.devextremeStrings.storedData
    - typingsJapgolly.devextreme.devextremeStrings.display
    - typingsJapgolly.devextreme.devextremeStrings.merge_
    - typingsJapgolly.devextreme.devextremeStrings.connector
    - typingsJapgolly.devextreme.devextremeStrings.or
    - typingsJapgolly.devextreme.devextremeStrings.summingJunction
    - typingsJapgolly.devextreme.devextremeStrings.verticalContainer
    - typingsJapgolly.devextreme.devextremeStrings.horizontalContainer
    - typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnLeft
    - typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnTop
    - typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnRight
  */
  trait DiagramShapeType extends StObject
  object DiagramShapeType {
    
    inline def arrowBottom: typingsJapgolly.devextreme.devextremeStrings.arrowBottom = "arrowBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrowBottom]
    
    inline def arrowEastWest: typingsJapgolly.devextreme.devextremeStrings.arrowEastWest = "arrowEastWest".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrowEastWest]
    
    inline def arrowLeft: typingsJapgolly.devextreme.devextremeStrings.arrowLeft = "arrowLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrowLeft]
    
    inline def arrowNorthSouth: typingsJapgolly.devextreme.devextremeStrings.arrowNorthSouth = "arrowNorthSouth".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrowNorthSouth]
    
    inline def arrowRight: typingsJapgolly.devextreme.devextremeStrings.arrowRight = "arrowRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrowRight]
    
    inline def arrowTop: typingsJapgolly.devextreme.devextremeStrings.arrowTop = "arrowTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.arrowTop]
    
    inline def cardWithImageOnLeft: typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnLeft = "cardWithImageOnLeft".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnLeft]
    
    inline def cardWithImageOnRight: typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnRight = "cardWithImageOnRight".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnRight]
    
    inline def cardWithImageOnTop: typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnTop = "cardWithImageOnTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnTop]
    
    inline def connector: typingsJapgolly.devextreme.devextremeStrings.connector = "connector".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.connector]
    
    inline def cross: typingsJapgolly.devextreme.devextremeStrings.cross = "cross".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cross]
    
    inline def data: typingsJapgolly.devextreme.devextremeStrings.data = "data".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.data]
    
    inline def database: typingsJapgolly.devextreme.devextremeStrings.database = "database".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.database]
    
    inline def decision: typingsJapgolly.devextreme.devextremeStrings.decision = "decision".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.decision]
    
    inline def delay: typingsJapgolly.devextreme.devextremeStrings.delay = "delay".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.delay]
    
    inline def diamond: typingsJapgolly.devextreme.devextremeStrings.diamond = "diamond".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.diamond]
    
    inline def display: typingsJapgolly.devextreme.devextremeStrings.display = "display".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.display]
    
    inline def document: typingsJapgolly.devextreme.devextremeStrings.document = "document".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.document]
    
    inline def ellipse: typingsJapgolly.devextreme.devextremeStrings.ellipse = "ellipse".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.ellipse]
    
    inline def hardDisk: typingsJapgolly.devextreme.devextremeStrings.hardDisk = "hardDisk".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.hardDisk]
    
    inline def heart: typingsJapgolly.devextreme.devextremeStrings.heart = "heart".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.heart]
    
    inline def hexagon: typingsJapgolly.devextreme.devextremeStrings.hexagon = "hexagon".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.hexagon]
    
    inline def horizontalContainer: typingsJapgolly.devextreme.devextremeStrings.horizontalContainer = "horizontalContainer".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.horizontalContainer]
    
    inline def internalStorage: typingsJapgolly.devextreme.devextremeStrings.internalStorage = "internalStorage".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.internalStorage]
    
    inline def manualInput: typingsJapgolly.devextreme.devextremeStrings.manualInput = "manualInput".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.manualInput]
    
    inline def manualOperation: typingsJapgolly.devextreme.devextremeStrings.manualOperation = "manualOperation".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.manualOperation]
    
    inline def merge: merge_ = "merge".asInstanceOf[merge_]
    
    inline def multipleDocuments: typingsJapgolly.devextreme.devextremeStrings.multipleDocuments = "multipleDocuments".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.multipleDocuments]
    
    inline def octagon: typingsJapgolly.devextreme.devextremeStrings.octagon = "octagon".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.octagon]
    
    inline def or: typingsJapgolly.devextreme.devextremeStrings.or = "or".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.or]
    
    inline def paperTape: typingsJapgolly.devextreme.devextremeStrings.paperTape = "paperTape".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.paperTape]
    
    inline def pentagon: typingsJapgolly.devextreme.devextremeStrings.pentagon = "pentagon".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pentagon]
    
    inline def predefinedProcess: typingsJapgolly.devextreme.devextremeStrings.predefinedProcess = "predefinedProcess".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.predefinedProcess]
    
    inline def preparation: typingsJapgolly.devextreme.devextremeStrings.preparation = "preparation".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.preparation]
    
    inline def process: typingsJapgolly.devextreme.devextremeStrings.process = "process".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.process]
    
    inline def rectangle: typingsJapgolly.devextreme.devextremeStrings.rectangle = "rectangle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rectangle]
    
    inline def star: typingsJapgolly.devextreme.devextremeStrings.star = "star".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.star]
    
    inline def storedData: typingsJapgolly.devextreme.devextremeStrings.storedData = "storedData".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.storedData]
    
    inline def summingJunction: typingsJapgolly.devextreme.devextremeStrings.summingJunction = "summingJunction".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.summingJunction]
    
    inline def terminator: typingsJapgolly.devextreme.devextremeStrings.terminator = "terminator".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.terminator]
    
    inline def text: typingsJapgolly.devextreme.devextremeStrings.text = "text".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.text]
    
    inline def triangle: typingsJapgolly.devextreme.devextremeStrings.triangle = "triangle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.triangle]
    
    inline def verticalContainer: typingsJapgolly.devextreme.devextremeStrings.verticalContainer = "verticalContainer".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.verticalContainer]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.icons
    - typingsJapgolly.devextreme.devextremeStrings.texts
  */
  trait DiagramToolboxDisplayMode extends StObject
  object DiagramToolboxDisplayMode {
    
    inline def icons: typingsJapgolly.devextreme.devextremeStrings.icons = "icons".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.icons]
    
    inline def texts: typingsJapgolly.devextreme.devextremeStrings.texts = "texts".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.texts]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.in
    - typingsJapgolly.devextreme.devextremeStrings.cm
    - typingsJapgolly.devextreme.devextremeStrings.px
  */
  trait DiagramUnits extends StObject
  object DiagramUnits {
    
    inline def cm: typingsJapgolly.devextreme.devextremeStrings.cm = "cm".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cm]
    
    inline def in: typingsJapgolly.devextreme.devextremeStrings.in = "in".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.in]
    
    inline def px: typingsJapgolly.devextreme.devextremeStrings.px = "px".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.px]
  }
  
  type DisposingEvent = EventInfo[dxDiagram]
  
  type InitializedEvent = InitializedEventInfo[dxDiagram]
  
  type Item = dxDiagramItem
  
  trait ItemClickEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val item: Item
  }
  object ItemClickEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], item: Item): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
    
    extension [Self <: ItemClickEvent](x: Self) {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDblClickEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val item: Item
  }
  object ItemDblClickEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], item: Item): ItemDblClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDblClickEvent]
    }
    
    extension [Self <: ItemDblClickEvent](x: Self) {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDiagram]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDiagramOptions
  
  trait RequestEditOperationEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    var allowed: js.UndefOr[Boolean] = js.undefined
    
    val args: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
    
    val operation: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints
    
    val reason: DiagramRequestEditOperationReason
  }
  object RequestEditOperationEvent {
    
    inline def apply(
      args: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs,
      component: dxDiagram,
      element: DxElement_[HTMLElement],
      operation: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints,
      reason: DiagramRequestEditOperationReason
    ): RequestEditOperationEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEditOperationEvent]
    }
    
    extension [Self <: RequestEditOperationEvent](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setArgs(
        value: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setOperation(
        value: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints
      ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setReason(value: DiagramRequestEditOperationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLayoutUpdateEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    var allowed: js.UndefOr[Boolean] = js.undefined
    
    val changes: js.Array[Any]
  }
  object RequestLayoutUpdateEvent {
    
    inline def apply(changes: js.Array[Any], component: dxDiagram, element: DxElement_[HTMLElement]): RequestLayoutUpdateEvent = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestLayoutUpdateEvent]
    }
    
    extension [Self <: RequestLayoutUpdateEvent](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setChanges(value: js.Array[Any]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: Any*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val items: js.Array[Item]
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], items: js.Array[Item]): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
