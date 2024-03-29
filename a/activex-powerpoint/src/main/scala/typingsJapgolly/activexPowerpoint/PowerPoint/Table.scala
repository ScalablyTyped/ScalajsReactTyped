package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  var AlternativeText: String = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /**
    * @param string [StyleID='']
    * @param boolean [SaveFormatting=false]
    */
  def ApplyStyle(): Unit = js.native
  def ApplyStyle(StyleID: String): Unit = js.native
  def ApplyStyle(StyleID: String, SaveFormatting: Boolean): Unit = js.native
  def ApplyStyle(StyleID: Unit, SaveFormatting: Boolean): Unit = js.native
  
  val Background: TableBackground = js.native
  
  def Cell(Row: Double, Column: Double): typingsJapgolly.activexPowerpoint.PowerPoint.Cell = js.native
  
  val Columns: typingsJapgolly.activexPowerpoint.PowerPoint.Columns = js.native
  
  var FirstCol: Boolean = js.native
  
  var FirstRow: Boolean = js.native
  
  var HorizBanding: Boolean = js.native
  
  var LastCol: Boolean = js.native
  
  var LastRow: Boolean = js.native
  
  def MergeBorders(): Unit = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.Table_typekey")
  var PowerPointDotTable_typekey: Table = js.native
  
  val Rows: typingsJapgolly.activexPowerpoint.PowerPoint.Rows = js.native
  
  def ScaleProportionally(scale: Double): Unit = js.native
  
  val Style: TableStyle = js.native
  
  var TableDirection: PpDirection = js.native
  
  var Title: String = js.native
  
  var VertBanding: Boolean = js.native
}
