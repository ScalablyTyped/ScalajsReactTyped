package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue
import typingsJapgolly.awsSdkClientXrayNode.typesAnnotationValueMod.UnmarshalledAnnotationValue
import typingsJapgolly.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typingsJapgolly.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValueWithServiceIdsMod {
  
  trait UnmarshalledValueWithServiceIds
    extends StObject
       with ValueWithServiceIds {
    
    /**
      * <p>Values of the annotation.</p>
      */
    @JSName("AnnotationValue")
    var AnnotationValue_UnmarshalledValueWithServiceIds: js.UndefOr[UnmarshalledAnnotationValue] = js.undefined
    
    /**
      * <p>Services to which the annotation applies.</p>
      */
    @JSName("ServiceIds")
    var ServiceIds_UnmarshalledValueWithServiceIds: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.undefined
  }
  object UnmarshalledValueWithServiceIds {
    
    inline def apply(): UnmarshalledValueWithServiceIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledValueWithServiceIds]
    }
    
    extension [Self <: UnmarshalledValueWithServiceIds](x: Self) {
      
      inline def setAnnotationValue(value: UnmarshalledAnnotationValue): Self = StObject.set(x, "AnnotationValue", value.asInstanceOf[js.Any])
      
      inline def setAnnotationValueUndefined: Self = StObject.set(x, "AnnotationValue", js.undefined)
      
      inline def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      inline def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
    }
  }
  
  trait ValueWithServiceIds extends StObject {
    
    /**
      * <p>Values of the annotation.</p>
      */
    var AnnotationValue: js.UndefOr[typingsJapgolly.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue] = js.undefined
    
    /**
      * <p>Services to which the annotation applies.</p>
      */
    var ServiceIds: js.UndefOr[js.Array[ServiceId] | js.Iterable[ServiceId]] = js.undefined
  }
  object ValueWithServiceIds {
    
    inline def apply(): ValueWithServiceIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueWithServiceIds]
    }
    
    extension [Self <: ValueWithServiceIds](x: Self) {
      
      inline def setAnnotationValue(value: AnnotationValue): Self = StObject.set(x, "AnnotationValue", value.asInstanceOf[js.Any])
      
      inline def setAnnotationValueUndefined: Self = StObject.set(x, "AnnotationValue", js.undefined)
      
      inline def setServiceIds(value: js.Array[ServiceId] | js.Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      inline def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
    }
  }
}
