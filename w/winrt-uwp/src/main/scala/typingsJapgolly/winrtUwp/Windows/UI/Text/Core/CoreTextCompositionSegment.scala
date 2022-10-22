package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a segment in a composition string. See Remarks for an illustration. */
trait CoreTextCompositionSegment extends StObject {
  
  /** Gets a string that represents the state of the user input after IME-processing but before final conversion. */
  var preconversionString: String
  
  /** Gets an object that represents the range that defines this composition segment. */
  var range: CoreTextRange
}
object CoreTextCompositionSegment {
  
  inline def apply(preconversionString: String, range: CoreTextRange): CoreTextCompositionSegment = {
    val __obj = js.Dynamic.literal(preconversionString = preconversionString.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionSegment]
  }
  
  extension [Self <: CoreTextCompositionSegment](x: Self) {
    
    inline def setPreconversionString(value: String): Self = StObject.set(x, "preconversionString", value.asInstanceOf[js.Any])
    
    inline def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
