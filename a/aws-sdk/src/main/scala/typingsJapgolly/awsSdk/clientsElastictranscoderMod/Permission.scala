package typingsJapgolly.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /**
    *  The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.  
    */
  var Access: js.UndefOr[AccessControls] = js.undefined
  
  /**
    * The AWS user or group that you want to have access to transcoded files and playlists. To identify the user or group, you can specify the canonical user ID for an AWS account, an origin access identity for a CloudFront distribution, the registered email address of an AWS account, or a predefined Amazon S3 group.
    */
  var Grantee: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.Grantee] = js.undefined
  
  /**
    * The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.  
    */
  var GranteeType: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.GranteeType] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setAccess(value: AccessControls): Self = StObject.set(x, "Access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "Access", js.undefined)
    
    inline def setAccessVarargs(value: AccessControl*): Self = StObject.set(x, "Access", js.Array(value*))
    
    inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeType(value: GranteeType): Self = StObject.set(x, "GranteeType", value.asInstanceOf[js.Any])
    
    inline def setGranteeTypeUndefined: Self = StObject.set(x, "GranteeType", js.undefined)
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
  }
}
