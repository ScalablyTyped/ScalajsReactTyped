package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoDiagramType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagram extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var AutoFormat: MsoTriState
  
  var AutoLayout: MsoTriState
  
  def Convert(Type: MsoDiagramType): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Diagram_typekey")
  var ExcelDotDiagram_typekey: Diagram
  
  def FitText(): Unit
  
  def Nodes(Index: Any): DiagramNode
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes
  
  val Parent: Any
  
  var Reverse: MsoTriState
  
  val Type: MsoDiagramType
}
object Diagram {
  
  inline def apply(
    Application: Application,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Callback,
    Creator: XlCreator,
    ExcelDotDiagram_typekey: Diagram,
    FitText: Callback,
    Nodes: DiagramNodes,
    Parent: Any,
    Reverse: MsoTriState,
    Type: MsoDiagramType
  ): Diagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1((t0: MsoDiagramType) => Convert(t0).runNow()), Creator = Creator.asInstanceOf[js.Any], FitText = FitText.toJsFn, Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Diagram_typekey")(ExcelDotDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagram]
  }
  
  extension [Self <: Diagram](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoFormat(value: MsoTriState): Self = StObject.set(x, "AutoFormat", value.asInstanceOf[js.Any])
    
    inline def setAutoLayout(value: MsoTriState): Self = StObject.set(x, "AutoLayout", value.asInstanceOf[js.Any])
    
    inline def setConvert(value: MsoDiagramType => Callback): Self = StObject.set(x, "Convert", js.Any.fromFunction1((t0: MsoDiagramType) => value(t0).runNow()))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotDiagram_typekey(value: Diagram): Self = StObject.set(x, "Excel.Diagram_typekey", value.asInstanceOf[js.Any])
    
    inline def setFitText(value: Callback): Self = StObject.set(x, "FitText", value.toJsFn)
    
    inline def setNodes(value: DiagramNodes): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: MsoTriState): Self = StObject.set(x, "Reverse", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoDiagramType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
