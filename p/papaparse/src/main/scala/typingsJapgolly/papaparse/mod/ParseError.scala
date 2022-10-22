package typingsJapgolly.papaparse.mod

import typingsJapgolly.papaparse.papaparseStrings.Delimiter
import typingsJapgolly.papaparse.papaparseStrings.FieldMismatch
import typingsJapgolly.papaparse.papaparseStrings.InvalidQuotes
import typingsJapgolly.papaparse.papaparseStrings.MissingQuotes
import typingsJapgolly.papaparse.papaparseStrings.Quotes
import typingsJapgolly.papaparse.papaparseStrings.TooFewFields
import typingsJapgolly.papaparse.papaparseStrings.TooManyFields
import typingsJapgolly.papaparse.papaparseStrings.UndetectableDelimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseError extends StObject {
  
  /** Standardized error code */
  var code: MissingQuotes | UndetectableDelimiter | TooFewFields | TooManyFields | InvalidQuotes
  
  /** Human-readable details */
  var message: String
  
  /** Row index of parsed data where error is */
  var row: Double
  
  /** A generalization of the error */
  var `type`: Quotes | Delimiter | FieldMismatch
}
object ParseError {
  
  inline def apply(
    code: MissingQuotes | UndetectableDelimiter | TooFewFields | TooManyFields | InvalidQuotes,
    message: String,
    row: Double,
    `type`: Quotes | Delimiter | FieldMismatch
  ): ParseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseError]
  }
  
  extension [Self <: ParseError](x: Self) {
    
    inline def setCode(value: MissingQuotes | UndetectableDelimiter | TooFewFields | TooManyFields | InvalidQuotes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setType(value: Quotes | Delimiter | FieldMismatch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
