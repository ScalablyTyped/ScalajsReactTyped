package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extends the interface {@link XFormulaParser} by an attribute that specifies the namespace URL of the supported formula language. */
trait XFilterFormulaParser
  extends StObject
     with XFormulaParser {
  
  /** Specifies the namespace URL of the formula language supported by this implementation. */
  var SupportedNamespace: String
}
object XFilterFormulaParser {
  
  inline def apply(
    SupportedNamespace: String,
    parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
    printFormula: (SeqEquiv[FormulaToken], CellAddress) => String
  ): XFilterFormulaParser = {
    val __obj = js.Dynamic.literal(SupportedNamespace = SupportedNamespace.asInstanceOf[js.Any], parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula))
    __obj.asInstanceOf[XFilterFormulaParser]
  }
  
  extension [Self <: XFilterFormulaParser](x: Self) {
    
    inline def setSupportedNamespace(value: String): Self = StObject.set(x, "SupportedNamespace", value.asInstanceOf[js.Any])
  }
}
