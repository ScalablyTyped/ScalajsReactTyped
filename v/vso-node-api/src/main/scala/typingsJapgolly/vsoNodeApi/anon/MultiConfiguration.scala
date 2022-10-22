package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiConfiguration extends StObject {
  
  var multiConfiguration: scala.Double
  
  var multiMachine: scala.Double
  
  var none: scala.Double
}
object MultiConfiguration {
  
  inline def apply(multiConfiguration: scala.Double, multiMachine: scala.Double, none: scala.Double): MultiConfiguration = {
    val __obj = js.Dynamic.literal(multiConfiguration = multiConfiguration.asInstanceOf[js.Any], multiMachine = multiMachine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiConfiguration]
  }
  
  extension [Self <: MultiConfiguration](x: Self) {
    
    inline def setMultiConfiguration(value: scala.Double): Self = StObject.set(x, "multiConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMultiMachine(value: scala.Double): Self = StObject.set(x, "multiMachine", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
