package typingsJapgolly.activexLibreoffice.com_.sun.star.logging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a service which formats log records as single line plain text
  *
  * Every log record, as passed to {@link XLogFormatter.format()} , will be formatted into a single text line, assembling the sequence number, the thread
  * ID, the time of the logged event, the source class/method name (if applicable), and the log message.
  * @since OOo 2.3
  */
trait PlainTextFormatter
  extends StObject
     with XLogFormatter {
  
  def create(): Unit
}
object PlainTextFormatter {
  
  inline def apply(
    Head: String,
    Tail: String,
    create: Callback,
    format: LogRecord => String,
    getHead: CallbackTo[String],
    getTail: CallbackTo[String]
  ): PlainTextFormatter = {
    val __obj = js.Dynamic.literal(Head = Head.asInstanceOf[js.Any], Tail = Tail.asInstanceOf[js.Any], create = create.toJsFn, format = js.Any.fromFunction1(format), getHead = getHead.toJsFn, getTail = getTail.toJsFn)
    __obj.asInstanceOf[PlainTextFormatter]
  }
  
  extension [Self <: PlainTextFormatter](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
