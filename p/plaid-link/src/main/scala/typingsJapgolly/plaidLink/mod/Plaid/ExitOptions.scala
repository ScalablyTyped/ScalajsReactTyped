package typingsJapgolly.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitOptions extends StObject {
  
  var force: Boolean
}
object ExitOptions {
  
  inline def apply(force: Boolean): ExitOptions = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitOptions]
  }
  
  extension [Self <: ExitOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
