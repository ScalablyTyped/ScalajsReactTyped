package typingsJapgolly.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyInfoRequest extends StObject {
  
  /**
    * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or lowercase letter or digit.
    */
  var AccessKeyId: accessKeyIdType
}
object GetAccessKeyInfoRequest {
  
  inline def apply(AccessKeyId: accessKeyIdType): GetAccessKeyInfoRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessKeyInfoRequest]
  }
  
  extension [Self <: GetAccessKeyInfoRequest](x: Self) {
    
    inline def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
  }
}
