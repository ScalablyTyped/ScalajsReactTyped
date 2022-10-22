package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.DiagramNodes
import typingsJapgolly.activexOffice.Office.MsoDiagramType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.IMsoDiagram")
@js.native
/* private */ open class IMsoDiagram ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.IMsoDiagram {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var AutoFormat: MsoTriState = js.native
  
  /* CompleteClass */
  var AutoLayout: MsoTriState = js.native
  
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def FitText(): Unit = js.native
  
  /* CompleteClass */
  override def Nodes(Index: Any): typingsJapgolly.activexOffice.Office.DiagramNode = js.native
  /* CompleteClass */
  @JSName("Nodes")
  override val Nodes_Original: DiagramNodes = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.IMsoDiagram_typekey")
  var OfficeDotIMsoDiagram_typekey: typingsJapgolly.activexOffice.Office.IMsoDiagram = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
}
