package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyVersion extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy version was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The policy document. The policy document is returned in the response to the GetPolicyVersion and GetAccountAuthorizationDetails operations. It is not returned in the response to the CreatePolicyVersion or ListPolicyVersions operations.  The policy document returned in this structure is URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.
    */
  var Document: js.UndefOr[policyDocumentType] = js.undefined
  
  /**
    * Specifies whether the policy version is set as the policy's default version.
    */
  var IsDefaultVersion: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The identifier for the policy version. Policy version identifiers always begin with v (always lowercase). When a policy is created, the first policy version is v1. 
    */
  var VersionId: js.UndefOr[policyVersionIdType] = js.undefined
}
object PolicyVersion {
  
  inline def apply(): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersion]
  }
  
  extension [Self <: PolicyVersion](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDocument(value: policyDocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
    
    inline def setIsDefaultVersion(value: booleanType): Self = StObject.set(x, "IsDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "IsDefaultVersion", js.undefined)
    
    inline def setVersionId(value: policyVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
