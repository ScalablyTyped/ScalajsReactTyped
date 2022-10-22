package typingsJapgolly.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesErrorMod {
  
  trait ExtendedError
    extends StObject
       with Error
       with /* key */ StringDictionary[Any]
  object ExtendedError {
    
    inline def apply(message: String, name: String): ExtendedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedError]
    }
  }
}
