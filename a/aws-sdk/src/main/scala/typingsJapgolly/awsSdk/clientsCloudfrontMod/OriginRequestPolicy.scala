package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicy extends StObject {
  
  /**
    * The unique identifier for the origin request policy.
    */
  var Id: String
  
  /**
    * The date and time when the origin request policy was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The origin request policy configuration.
    */
  var OriginRequestPolicyConfig: typingsJapgolly.awsSdk.clientsCloudfrontMod.OriginRequestPolicyConfig
}
object OriginRequestPolicy {
  
  inline def apply(Id: String, LastModifiedTime: js.Date, OriginRequestPolicyConfig: OriginRequestPolicyConfig): OriginRequestPolicy = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OriginRequestPolicyConfig = OriginRequestPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicy]
  }
  
  extension [Self <: OriginRequestPolicy](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = StObject.set(x, "OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
  }
}
