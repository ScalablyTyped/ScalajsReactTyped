package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'none' | 'spin' | 'ping' | 'pulse' | 'bounce', string> */
trait Recordnonespinpingpulsebo extends StObject {
  
  var bounce: String
  
  var none: String
  
  var ping: String
  
  var pulse: String
  
  var spin: String
}
object Recordnonespinpingpulsebo {
  
  inline def apply(bounce: String, none: String, ping: String, pulse: String, spin: String): Recordnonespinpingpulsebo = {
    val __obj = js.Dynamic.literal(bounce = bounce.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], pulse = pulse.asInstanceOf[js.Any], spin = spin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordnonespinpingpulsebo]
  }
  
  extension [Self <: Recordnonespinpingpulsebo](x: Self) {
    
    inline def setBounce(value: String): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPulse(value: String): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
    
    inline def setSpin(value: String): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
  }
}
