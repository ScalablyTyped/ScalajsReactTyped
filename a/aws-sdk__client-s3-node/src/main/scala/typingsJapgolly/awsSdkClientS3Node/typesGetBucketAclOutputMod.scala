package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesGrantMod.UnmarshalledGrant
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketAclOutputMod {
  
  trait GetBucketAclOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>A list of grants.</p>
      */
    var Grants: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.undefined
  }
  object GetBucketAclOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketAclOutput]
    }
    
    extension [Self <: GetBucketAclOutput](x: Self) {
      
      inline def setGrants(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
      
      inline def setGrantsVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "Grants", js.Array(value*))
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
