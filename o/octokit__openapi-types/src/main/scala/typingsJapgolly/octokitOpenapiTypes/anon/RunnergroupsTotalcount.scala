package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnergroupsTotalcount extends StObject {
  
  var runner_groups: js.Array[Default]
  
  var total_count: Double
}
object RunnergroupsTotalcount {
  
  inline def apply(runner_groups: js.Array[Default], total_count: Double): RunnergroupsTotalcount = {
    val __obj = js.Dynamic.literal(runner_groups = runner_groups.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnergroupsTotalcount]
  }
  
  extension [Self <: RunnergroupsTotalcount](x: Self) {
    
    inline def setRunner_groups(value: js.Array[Default]): Self = StObject.set(x, "runner_groups", value.asInstanceOf[js.Any])
    
    inline def setRunner_groupsVarargs(value: Default*): Self = StObject.set(x, "runner_groups", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
