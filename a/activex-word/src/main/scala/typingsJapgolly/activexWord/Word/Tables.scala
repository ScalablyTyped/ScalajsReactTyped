package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tables extends StObject {
  
  def Add(Range: Range, NumRows: Double, NumColumns: Double): Table = js.native
  def Add(Range: Range, NumRows: Double, NumColumns: Double, DefaultTableBehavior: Any): Table = js.native
  def Add(Range: Range, NumRows: Double, NumColumns: Double, DefaultTableBehavior: Any, AutoFitBehavior: Any): Table = js.native
  def Add(
    Range: Range,
    NumRows: Double,
    NumColumns: Double,
    DefaultTableBehavior: Unit,
    AutoFitBehavior: Any
  ): Table = js.native
  
  def AddOld(Range: Range, NumRows: Double, NumColumns: Double): Table = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Table = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.Tables_typekey")
  var WordDotTables_typekey: Tables = js.native
}
