package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartArtNode extends StObject {
  
  /**
    * @param Position [Position=1]
    * @param Type [Type=1]
    */
  def AddNode(): SmartArtNode = js.native
  def AddNode(Position: Unit, Type: MsoSmartArtNodeType): SmartArtNode = js.native
  def AddNode(Position: MsoSmartArtNodePosition): SmartArtNode = js.native
  def AddNode(Position: MsoSmartArtNodePosition, Type: MsoSmartArtNodeType): SmartArtNode = js.native
  
  val Application: Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  def Demote(): Unit = js.native
  
  val Hidden: MsoTriState = js.native
  
  def Larger(): Unit = js.native
  
  val Level: Double = js.native
  
  def Nodes(Index: String): SmartArtNode = js.native
  def Nodes(Index: Double): SmartArtNode = js.native
  @JSName("Nodes")
  val Nodes_Original: SmartArtNodes = js.native
  
  /* private */ @JSName("Office.SmartArtNode_typekey")
  var OfficeDotSmartArtNode_typekey: SmartArtNode = js.native
  
  var OrgChartLayout: MsoOrgChartLayoutType = js.native
  
  val Parent: Any = js.native
  
  val ParentNode: SmartArtNode = js.native
  
  def Promote(): Unit = js.native
  
  def ReorderDown(): Unit = js.native
  
  def ReorderUp(): Unit = js.native
  
  def Shapes(Index: Any): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: ShapeRange = js.native
  
  def Smaller(): Unit = js.native
  
  val TextFrame2: typingsJapgolly.activexOffice.Office.TextFrame2 = js.native
  
  val Type: MsoSmartArtNodeType = js.native
}
