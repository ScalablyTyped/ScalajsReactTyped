package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advancedsecuritycommitters extends StObject {
  
  /** @example 25 */
  var advanced_security_committers: Double
  
  var advanced_security_committers_breakdown: js.Array[Lastpusheddate]
  
  /** @example octocat/Hello-World */
  var name: String
}
object Advancedsecuritycommitters {
  
  inline def apply(
    advanced_security_committers: Double,
    advanced_security_committers_breakdown: js.Array[Lastpusheddate],
    name: String
  ): Advancedsecuritycommitters = {
    val __obj = js.Dynamic.literal(advanced_security_committers = advanced_security_committers.asInstanceOf[js.Any], advanced_security_committers_breakdown = advanced_security_committers_breakdown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advancedsecuritycommitters]
  }
  
  extension [Self <: Advancedsecuritycommitters](x: Self) {
    
    inline def setAdvanced_security_committers(value: Double): Self = StObject.set(x, "advanced_security_committers", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_security_committers_breakdown(value: js.Array[Lastpusheddate]): Self = StObject.set(x, "advanced_security_committers_breakdown", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_security_committers_breakdownVarargs(value: Lastpusheddate*): Self = StObject.set(x, "advanced_security_committers_breakdown", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
