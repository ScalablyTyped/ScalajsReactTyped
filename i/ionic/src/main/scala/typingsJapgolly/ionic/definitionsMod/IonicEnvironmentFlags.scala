package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonicEnvironmentFlags extends StObject {
  
  val confirm: Boolean
  
  val interactive: Boolean
}
object IonicEnvironmentFlags {
  
  inline def apply(confirm: Boolean, interactive: Boolean): IonicEnvironmentFlags = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicEnvironmentFlags]
  }
  
  extension [Self <: IonicEnvironmentFlags](x: Self) {
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
