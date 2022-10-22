package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Author: String = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  /* private */ @JSName("Excel.Comment_typekey")
  var ExcelDotComment_typekey: Comment = js.native
  
  def Next(): Comment = js.native
  
  val Parent: Any = js.native
  
  def Previous(): Comment = js.native
  
  val Shape: typingsJapgolly.activexExcel.Excel.Shape = js.native
  
  def Text(): String = js.native
  def Text(Text: String): String = js.native
  def Text(Text: String, Start: Double): String = js.native
  def Text(Text: String, Start: Double, Overwrite: Boolean): String = js.native
  def Text(Text: String, Start: Unit, Overwrite: Boolean): String = js.native
  def Text(Text: Unit, Start: Double): String = js.native
  def Text(Text: Unit, Start: Double, Overwrite: Boolean): String = js.native
  def Text(Text: Unit, Start: Unit, Overwrite: Boolean): String = js.native
  
  var Visible: Boolean = js.native
}
