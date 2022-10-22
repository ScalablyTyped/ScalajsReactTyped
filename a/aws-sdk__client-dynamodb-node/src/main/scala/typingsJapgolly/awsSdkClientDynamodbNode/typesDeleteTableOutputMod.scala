package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesTableDescriptionMod.UnmarshalledTableDescription
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteTableOutputMod {
  
  trait DeleteTableOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Represents the properties of a table.</p>
      */
    var TableDescription: js.UndefOr[UnmarshalledTableDescription] = js.undefined
  }
  object DeleteTableOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteTableOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteTableOutput]
    }
    
    extension [Self <: DeleteTableOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setTableDescription(value: UnmarshalledTableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
}
