package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBasedGateway
  extends StObject
     with Gateway {
  
  /**
    * @default Exclusive
    */
  var eventGatewayType: EventBasedGatewayType
  
  var instantiate: Boolean
}
object EventBasedGateway {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    eventGatewayType: EventBasedGatewayType,
    gatewayDirection: GatewayDirection,
    id: String,
    incoming: js.Array[SequenceFlow],
    instantiate: Boolean,
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow]
  ): EventBasedGateway = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], eventGatewayType = eventGatewayType.asInstanceOf[js.Any], gatewayDirection = gatewayDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], instantiate = instantiate.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBasedGateway]
  }
  
  extension [Self <: EventBasedGateway](x: Self) {
    
    inline def setEventGatewayType(value: EventBasedGatewayType): Self = StObject.set(x, "eventGatewayType", value.asInstanceOf[js.Any])
    
    inline def setInstantiate(value: Boolean): Self = StObject.set(x, "instantiate", value.asInstanceOf[js.Any])
  }
}
