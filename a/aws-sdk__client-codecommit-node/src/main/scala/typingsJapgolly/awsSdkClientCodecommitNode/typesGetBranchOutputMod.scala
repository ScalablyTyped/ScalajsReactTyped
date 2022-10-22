package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBranchOutputMod {
  
  trait GetBranchOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The name of the branch.</p>
      */
    var branch: js.UndefOr[UnmarshalledBranchInfo] = js.undefined
  }
  object GetBranchOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBranchOutput]
    }
    
    extension [Self <: GetBranchOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: UnmarshalledBranchInfo): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    }
  }
}
