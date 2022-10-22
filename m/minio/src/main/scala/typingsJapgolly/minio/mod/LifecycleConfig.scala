package typingsJapgolly.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleConfig
  extends StObject
     with _Lifecycle {
  
  var Rule: js.Array[LifecycleRule]
}
object LifecycleConfig {
  
  inline def apply(Rule: js.Array[LifecycleRule]): LifecycleConfig = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfig]
  }
  
  extension [Self <: LifecycleConfig](x: Self) {
    
    inline def setRule(value: js.Array[LifecycleRule]): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rule", js.Array(value*))
  }
}
