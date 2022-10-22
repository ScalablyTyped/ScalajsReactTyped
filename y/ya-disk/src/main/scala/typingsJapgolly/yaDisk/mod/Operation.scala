package typingsJapgolly.yaDisk.mod

import typingsJapgolly.yaDisk.yaDiskStrings.`in-progress`
import typingsJapgolly.yaDisk.yaDiskStrings.failed
import typingsJapgolly.yaDisk.yaDiskStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  var status: success | failed | `in-progress`
}
object Operation {
  
  inline def apply(status: success | failed | `in-progress`): Operation = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setStatus(value: success | failed | `in-progress`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
