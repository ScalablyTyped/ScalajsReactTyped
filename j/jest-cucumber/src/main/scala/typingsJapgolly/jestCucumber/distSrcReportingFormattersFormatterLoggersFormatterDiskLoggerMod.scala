package typingsJapgolly.jestCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReportingFormattersFormatterLoggersFormatterDiskLoggerMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/formatters/formatter-loggers/FormatterDiskLogger", "FormatterDiskLogger")
  @js.native
  open class FormatterDiskLogger protected () extends StObject {
    def this(path: String) = this()
    
    def log(logText: String): Unit = js.native
    
    /* private */ var logs: Any = js.native
    
    /* private */ var path: Any = js.native
    
    def save(): Unit = js.native
  }
}
