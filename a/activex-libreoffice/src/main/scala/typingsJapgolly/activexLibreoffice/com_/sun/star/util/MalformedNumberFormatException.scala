package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when a {@link NumberFormat} string is syntactically incorrect. */
trait MalformedNumberFormatException
  extends StObject
     with Exception {
  
  /** contains the character position in the string where the malformation begins. */
  var CheckPos: Double
}
object MalformedNumberFormatException {
  
  inline def apply(CheckPos: Double, Context: XInterface, Message: String): MalformedNumberFormatException = {
    val __obj = js.Dynamic.literal(CheckPos = CheckPos.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedNumberFormatException]
  }
  
  extension [Self <: MalformedNumberFormatException](x: Self) {
    
    inline def setCheckPos(value: Double): Self = StObject.set(x, "CheckPos", value.asInstanceOf[js.Any])
  }
}
