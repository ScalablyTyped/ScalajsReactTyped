package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.DiagramNodes
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexOffice.Office.MsoDiagramType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Diagram")
@js.native
/* private */ open class Diagram ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Diagram {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var AutoFormat: MsoTriState = js.native
  
  /* CompleteClass */
  var AutoLayout: MsoTriState = js.native
  
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Diagram_typekey")
  var ExcelDotDiagram_typekey: typingsJapgolly.activexExcel.Excel.Diagram = js.native
  
  /* CompleteClass */
  override def FitText(): Unit = js.native
  
  /* CompleteClass */
  override def Nodes(Index: Any): typingsJapgolly.activexExcel.Excel.DiagramNode = js.native
  /* CompleteClass */
  @JSName("Nodes")
  override val Nodes_Original: DiagramNodes = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
}
