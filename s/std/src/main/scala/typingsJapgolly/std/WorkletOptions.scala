package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkletOptions extends StObject {
  
  /* standard dom */
  var credentials: js.UndefOr[org.scalajs.dom.RequestCredentials] = js.undefined
}
object WorkletOptions {
  
  inline def apply(): WorkletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkletOptions]
  }
  
  extension [Self <: WorkletOptions](x: Self) {
    
    inline def setCredentials(value: org.scalajs.dom.RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
  }
}
