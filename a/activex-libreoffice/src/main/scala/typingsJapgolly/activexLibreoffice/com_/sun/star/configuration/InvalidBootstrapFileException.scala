package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration contains invalid data */
trait InvalidBootstrapFileException
  extends StObject
     with Exception {
  
  var BootstrapFileURL: String
}
object InvalidBootstrapFileException {
  
  inline def apply(BootstrapFileURL: String, Context: XInterface, Message: String): InvalidBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBootstrapFileException]
  }
  
  extension [Self <: InvalidBootstrapFileException](x: Self) {
    
    inline def setBootstrapFileURL(value: String): Self = StObject.set(x, "BootstrapFileURL", value.asInstanceOf[js.Any])
  }
}
