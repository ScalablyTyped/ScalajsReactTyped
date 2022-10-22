package typingsJapgolly.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVerifyLinesMod {
  
  @JSImport("tslint/lib/verify/lines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint/lib/verify/lines", "CodeLine")
  @js.native
  open class CodeLine protected () extends Line {
    def this(contents: String) = this()
    
    var contents: String = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "EndErrorLine")
  @js.native
  open class EndErrorLine protected () extends ErrorLine {
    def this(startCol: Double, endCol: Double, message: String) = this()
    
    var endCol: Double = js.native
    
    var message: String = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "ErrorLine")
  @js.native
  open class ErrorLine protected () extends Line {
    def this(startCol: Double) = this()
    
    var startCol: Double = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "Line")
  @js.native
  open class Line () extends StObject
  
  @JSImport("tslint/lib/verify/lines", "MessageSubstitutionLine")
  @js.native
  open class MessageSubstitutionLine protected () extends Line {
    def this(key: String, message: String) = this()
    
    var key: String = js.native
    
    var message: String = js.native
  }
  
  @JSImport("tslint/lib/verify/lines", "MultilineErrorLine")
  @js.native
  open class MultilineErrorLine protected () extends ErrorLine {
    def this(startCol: Double) = this()
  }
  
  @JSImport("tslint/lib/verify/lines", "ZERO_LENGTH_ERROR")
  @js.native
  val ZERO_LENGTH_ERROR: /* "~nil" */ String = js.native
  
  inline def parseLine(text: String): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLine")(text.asInstanceOf[js.Any]).asInstanceOf[Line]
  
  inline def printLine(fileName: String, line: Line): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("printLine")(fileName.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def printLine(fileName: String, line: Line, code: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("printLine")(fileName.asInstanceOf[js.Any], line.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
