package typingsJapgolly.atom

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcColorMod {
  
  trait Color extends StObject {
    
    /** Returns a string in the form '#abcdef'. */
    def toHexString(): String
    
    /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
    def toRGBAString(): String
  }
  object Color {
    
    inline def apply(toHexString: CallbackTo[String], toRGBAString: CallbackTo[String]): Color = {
      val __obj = js.Dynamic.literal(toHexString = toHexString.toJsFn, toRGBAString = toRGBAString.toJsFn)
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setToHexString(value: CallbackTo[String]): Self = StObject.set(x, "toHexString", value.toJsFn)
      
      inline def setToRGBAString(value: CallbackTo[String]): Self = StObject.set(x, "toRGBAString", value.toJsFn)
    }
  }
}
