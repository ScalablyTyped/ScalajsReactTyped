package typingsJapgolly.gherkin

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenScannerMod {
  
  @JSImport("gherkin/dist/src/TokenScanner", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TokenScanner {
    def this(source: String) = this()
    
    /* private */ /* CompleteClass */
    var lineNumber: Any = js.native
    
    /* private */ /* CompleteClass */
    var lines: Any = js.native
    
    /* CompleteClass */
    override def read(): typingsJapgolly.gherkin.distSrcTokenMod.default = js.native
  }
  
  trait TokenScanner extends StObject {
    
    /* private */ var lineNumber: Any
    
    /* private */ var lines: Any
    
    def read(): typingsJapgolly.gherkin.distSrcTokenMod.default
  }
  object TokenScanner {
    
    inline def apply(lineNumber: Any, lines: Any, read: CallbackTo[typingsJapgolly.gherkin.distSrcTokenMod.default]): TokenScanner = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], read = read.toJsFn)
      __obj.asInstanceOf[TokenScanner]
    }
    
    extension [Self <: TokenScanner](x: Self) {
      
      inline def setLineNumber(value: Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setRead(value: CallbackTo[typingsJapgolly.gherkin.distSrcTokenMod.default]): Self = StObject.set(x, "read", value.toJsFn)
    }
  }
}
