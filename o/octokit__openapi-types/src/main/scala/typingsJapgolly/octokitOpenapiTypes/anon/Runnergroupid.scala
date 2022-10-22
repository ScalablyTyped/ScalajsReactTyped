package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runnergroupid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** Unique identifier of the self-hosted runner group. */
  var runner_group_id: Double
}
object Runnergroupid {
  
  inline def apply(enterprise: String, runner_group_id: Double): Runnergroupid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runnergroupid]
  }
  
  extension [Self <: Runnergroupid](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}
