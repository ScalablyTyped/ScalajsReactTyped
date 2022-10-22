package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketInventoryConfigurationOutputMod {
  
  trait GetBucketInventoryConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies the inventory configuration.</p>
      */
    var InventoryConfiguration: js.UndefOr[UnmarshalledInventoryConfiguration] = js.undefined
  }
  object GetBucketInventoryConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
    }
    
    extension [Self <: GetBucketInventoryConfigurationOutput](x: Self) {
      
      inline def setInventoryConfiguration(value: UnmarshalledInventoryConfiguration): Self = StObject.set(x, "InventoryConfiguration", value.asInstanceOf[js.Any])
      
      inline def setInventoryConfigurationUndefined: Self = StObject.set(x, "InventoryConfiguration", js.undefined)
    }
  }
}
