package typingsJapgolly.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logs extends StObject {
  
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not apply to RabbitMQ brokers.
    */
  var Audit: js.UndefOr[boolean] = js.undefined
  
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.undefined
}
object Logs {
  
  inline def apply(): Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logs]
  }
  
  extension [Self <: Logs](x: Self) {
    
    inline def setAudit(value: boolean): Self = StObject.set(x, "Audit", value.asInstanceOf[js.Any])
    
    inline def setAuditUndefined: Self = StObject.set(x, "Audit", js.undefined)
    
    inline def setGeneral(value: boolean): Self = StObject.set(x, "General", value.asInstanceOf[js.Any])
    
    inline def setGeneralUndefined: Self = StObject.set(x, "General", js.undefined)
  }
}
