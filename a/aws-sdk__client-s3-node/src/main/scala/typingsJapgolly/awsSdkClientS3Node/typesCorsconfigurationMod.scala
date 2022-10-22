package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesCorsruleMod.CORSRule
import typingsJapgolly.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCorsconfigurationMod {
  
  trait CORSConfiguration extends StObject {
    
    /**
      * _CORSRules shape
      */
    var CORSRules: js.Array[CORSRule] | js.Iterable[CORSRule]
  }
  object CORSConfiguration {
    
    inline def apply(CORSRules: js.Array[CORSRule] | js.Iterable[CORSRule]): CORSConfiguration = {
      val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[CORSConfiguration]
    }
    
    extension [Self <: CORSConfiguration](x: Self) {
      
      inline def setCORSRules(value: js.Array[CORSRule] | js.Iterable[CORSRule]): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
      
      inline def setCORSRulesVarargs(value: CORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value*))
    }
  }
  
  trait UnmarshalledCORSConfiguration
    extends StObject
       with CORSConfiguration {
    
    /**
      * _CORSRules shape
      */
    @JSName("CORSRules")
    var CORSRules_UnmarshalledCORSConfiguration: js.Array[UnmarshalledCORSRule]
  }
  object UnmarshalledCORSConfiguration {
    
    inline def apply(CORSRules: js.Array[UnmarshalledCORSRule]): UnmarshalledCORSConfiguration = {
      val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledCORSConfiguration]
    }
    
    extension [Self <: UnmarshalledCORSConfiguration](x: Self) {
      
      inline def setCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
      
      inline def setCORSRulesVarargs(value: UnmarshalledCORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value*))
    }
  }
}
