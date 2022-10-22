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

trait CellErrorValue
  extends StObject
     with _CellValue {
  
  var error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
}
object CellErrorValue {
  
  inline def apply(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellErrorValue]
  }
  
  extension [Self <: CellErrorValue](x: Self) {
    
    inline def setError(
      value: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
