package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  def format(args: Any*): Unit
  
  var messages: js.UndefOr[FileInput] = js.undefined
}
object Format {
  
  inline def apply(format: /* repeated */ Any => Callback): Format = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1((t0: /* repeated */ Any) => format(t0).runNow()))
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: /* repeated */ Any => Callback): Self = StObject.set(x, "format", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setMessages(value: FileInput): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
  }
}
