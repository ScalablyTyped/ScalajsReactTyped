package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListColumns extends StObject {
  
  def apply(Index: String): ListColumn = js.native
  def apply(Index: Double): ListColumn = js.native
  
  def Add(): ListColumn = js.native
  def Add(Position: Double): ListColumn = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): ListColumn = js.native
  def Item(Index: Double): ListColumn = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): ListColumn = js.native
}
