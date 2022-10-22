package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is used to indicate that the requested type of data sink is not supported.
  *
  * For example, each {@link OpenCommandArgument} supplied as argument of the command "open" contains such a data sink.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
trait UnsupportedDataSinkException
  extends StObject
     with Exception {
  
  /** contains the data sink that is not supported. */
  var Sink: XInterface
}
object UnsupportedDataSinkException {
  
  inline def apply(Context: XInterface, Message: String, Sink: XInterface): UnsupportedDataSinkException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedDataSinkException]
  }
  
  extension [Self <: UnsupportedDataSinkException](x: Self) {
    
    inline def setSink(value: XInterface): Self = StObject.set(x, "Sink", value.asInstanceOf[js.Any])
  }
}
