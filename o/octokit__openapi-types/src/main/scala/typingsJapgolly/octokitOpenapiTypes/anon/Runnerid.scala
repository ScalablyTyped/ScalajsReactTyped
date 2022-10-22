package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runnerid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** Unique identifier of the self-hosted runner group. */
  var runner_group_id: Double
  
  /** Unique identifier of the self-hosted runner. */
  var runner_id: Double
}
object Runnerid {
  
  inline def apply(enterprise: String, runner_group_id: Double, runner_id: Double): Runnerid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runnerid]
  }
  
  extension [Self <: Runnerid](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
