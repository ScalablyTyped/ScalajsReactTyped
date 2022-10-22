package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typingsJapgolly.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typingsJapgolly.exceljs.exceljsStrings.NumbersignNSlashA
import typingsJapgolly.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typingsJapgolly.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typingsJapgolly.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typingsJapgolly.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CellValue extends StObject
object _CellValue {
  
  inline def CellErrorValue(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): typingsJapgolly.exceljs.mod.CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.CellErrorValue]
  }
  
  inline def CellFormulaValue(date1904: Boolean, formula: String): typingsJapgolly.exceljs.mod.CellFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.CellFormulaValue]
  }
  
  inline def CellHyperlinkValue(hyperlink: String, text: String): typingsJapgolly.exceljs.mod.CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.CellHyperlinkValue]
  }
  
  inline def CellRichTextValue(richText: js.Array[RichText]): typingsJapgolly.exceljs.mod.CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.CellRichTextValue]
  }
  
  inline def CellSharedFormulaValue(date1904: Boolean, sharedFormula: String): typingsJapgolly.exceljs.mod.CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.CellSharedFormulaValue]
  }
}
