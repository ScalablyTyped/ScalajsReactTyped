package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoDiagramNodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DiagramNodeChildren")
@js.native
class DiagramNodeChildren protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val FirstChild: DiagramNode = js.native
  val LastChild: DiagramNode = js.native
  val Parent: js.Any = js.native
  @JSName("Word.DiagramNodeChildren_typekey")
  var WordDotDiagramNodeChildren_typekey: DiagramNodeChildren = js.native
  /**
    * @param any [Index=-1]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Index: js.Any): DiagramNode = js.native
  def AddNode(Index: js.Any, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def Item(Index: js.Any): DiagramNode = js.native
  def SelectAll(): Unit = js.native
}

