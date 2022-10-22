package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.AutoCorrect")
@js.native
/* private */ open class AutoCorrect ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.AutoCorrect {
  
  /** @returns The string to be replaced */
  /* CompleteClass */
  override def AddReplacement(What: String, Replacement: String): String = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var AutoExpandListRange: Boolean = js.native
  
  /* CompleteClass */
  var AutoFillFormulasInLists: Boolean = js.native
  
  /* CompleteClass */
  var CapitalizeNamesOfDays: Boolean = js.native
  
  /* CompleteClass */
  var CorrectCapsLock: Boolean = js.native
  
  /* CompleteClass */
  var CorrectSentenceCap: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /** @returns The string to be replaced */
  /* CompleteClass */
  override def DeleteReplacement(What: String): String = js.native
  
  /* CompleteClass */
  var DisplayAutoCorrectOptions: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.AutoCorrect_typekey")
  var ExcelDotAutoCorrect_typekey: typingsJapgolly.activexExcel.Excel.AutoCorrect = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ReplaceText: Boolean = js.native
  
  /* CompleteClass */
  override def ReplacementList(Index: Double): SafeArray[String] = js.native
  
  /* CompleteClass */
  var TwoInitialCapitals: Boolean = js.native
}
