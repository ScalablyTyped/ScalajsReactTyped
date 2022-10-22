package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartObjects extends StObject {
  
  def apply(Index: String): Any = js.native
  def apply(Index: Double): Any = js.native
  
  def Add(Left: Double, Top: Double, Width: Double, Height: Double): ChartObject = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Border: typingsJapgolly.activexExcel.Excel.Border = js.native
  
  def BringToFront(): Any = js.native
  
  def Copy(): Any = js.native
  
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): Any = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat): Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Any = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Cut(): Any = js.native
  
  def Delete(): Any = js.native
  
  def Duplicate(): Any = js.native
  
  var Enabled: Boolean = js.native
  
  def Group(): GroupObject = js.native
  
  var Height: Double = js.native
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  def Item(Index: String): ChartObject = js.native
  def Item(Index: Double): ChartObject = js.native
  
  var Left: Double = js.native
  
  var Locked: Boolean = js.native
  
  var OnAction: String = js.native
  
  val Parent: Any = js.native
  
  var Placement: XlPlacement = js.native
  
  var PrintObject: Boolean = js.native
  
  var ProtectChartObject: Boolean = js.native
  
  var RoundedCorners: Boolean = js.native
  
  def Select(): Any = js.native
  def Select(Replace: Boolean): Any = js.native
  
  def SendToBack(): Any = js.native
  
  var Shadow: Boolean = js.native
  
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  
  var Top: Double = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  def _Copy(): Any = js.native
  
  def _Default(Index: Any): Any = js.native
}
