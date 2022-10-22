package typingsJapgolly.nodemailerPickupTransport

import typingsJapgolly.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Transport[Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transport[Any]]
  
  @JSImport("nodemailer-pickup-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var directory: String
  }
  object Options {
    
    inline def apply(directory: String): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
}
