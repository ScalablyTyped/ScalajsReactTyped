package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExclusiveGateway
  extends StObject
     with Gateway {
  
  var default: SequenceFlow
}
object ExclusiveGateway {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    default: SequenceFlow,
    gatewayDirection: GatewayDirection,
    id: String,
    incoming: js.Array[SequenceFlow],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow]
  ): ExclusiveGateway = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], gatewayDirection = gatewayDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusiveGateway]
  }
  
  extension [Self <: ExclusiveGateway](x: Self) {
    
    inline def setDefault(value: SequenceFlow): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
