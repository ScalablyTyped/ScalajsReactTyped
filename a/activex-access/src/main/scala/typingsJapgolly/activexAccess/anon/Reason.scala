package typingsJapgolly.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  val Reason: Double
}
object Reason {
  
  inline def apply(Reason: Double): Reason = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setReason(value: Double): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
