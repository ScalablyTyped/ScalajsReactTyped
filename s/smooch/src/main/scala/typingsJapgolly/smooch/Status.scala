package typingsJapgolly.smooch

import typingsJapgolly.smooch.smoochStrings.pending
import typingsJapgolly.smooch.smoochStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: resolved | pending | String
}
object Status {
  
  inline def apply(status: resolved | pending | String): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: resolved | pending | String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
