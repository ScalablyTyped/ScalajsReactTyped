package typingsJapgolly.activexLibreoffice.com_.sun.star.logging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a service which formats log records for RFC4180-style CSV-Files
  *
  * Every log record, as passed to {@link XCsvLogFormatter.format()} , will be formatted into a single row for a CSV file. The sequence number, the thread
  * ID, the time of the logged event, the source class/method name will get logged alongside the message, if this is not disabled. The Formatter also
  * supports logging an arbitrary number of user-defined columns. If the Formatter is configured to have more than one (user-defined) column the data to
  * log has to be preformatted with the formatMultiColumn method.
  * @since OOo 3.0
  */
trait CsvLogFormatter
  extends StObject
     with XCsvLogFormatter {
  
  def create(): Unit
}
object CsvLogFormatter {
  
  inline def apply(
    Columnnames: SafeArray[String],
    Head: String,
    LogEventNo: Boolean,
    LogSource: Boolean,
    LogThread: Boolean,
    LogTimestamp: Boolean,
    Tail: String,
    create: Callback,
    format: LogRecord => String,
    formatMultiColumn: SeqEquiv[String] => String,
    getHead: CallbackTo[String],
    getTail: CallbackTo[String]
  ): CsvLogFormatter = {
    val __obj = js.Dynamic.literal(Columnnames = Columnnames.asInstanceOf[js.Any], Head = Head.asInstanceOf[js.Any], LogEventNo = LogEventNo.asInstanceOf[js.Any], LogSource = LogSource.asInstanceOf[js.Any], LogThread = LogThread.asInstanceOf[js.Any], LogTimestamp = LogTimestamp.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], create = create.toJsFn, format = js.Any.fromFunction1(format), formatMultiColumn = js.Any.fromFunction1(formatMultiColumn), getHead = getHead.toJsFn, getTail = getTail.toJsFn)
    __obj.asInstanceOf[CsvLogFormatter]
  }
  
  extension [Self <: CsvLogFormatter](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
