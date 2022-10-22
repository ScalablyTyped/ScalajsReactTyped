package typingsJapgolly.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParallelDataRequest extends StObject {
  
  /**
    * A unique identifier for the request. This token is automatically generated when you use Amazon Translate through an AWS SDK.
    */
  var ClientToken: ClientTokenString
  
  /**
    * A custom description for the parallel data resource in Amazon Translate.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsTranslateMod.Description] = js.undefined
  
  var EncryptionKey: js.UndefOr[typingsJapgolly.awsSdk.clientsTranslateMod.EncryptionKey] = js.undefined
  
  /**
    * A custom name for the parallel data resource in Amazon Translate. You must assign a name that is unique in the account and region.
    */
  var Name: ResourceName
  
  /**
    * Specifies the format and S3 location of the parallel data input file.
    */
  var ParallelDataConfig: typingsJapgolly.awsSdk.clientsTranslateMod.ParallelDataConfig
  
  /**
    * Tags to be associated with this resource. A tag is a key-value pair that adds metadata to a resource. Each tag key for the resource must be unique. For more information, see  Tagging your resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateParallelDataRequest {
  
  inline def apply(ClientToken: ClientTokenString, Name: ResourceName, ParallelDataConfig: ParallelDataConfig): CreateParallelDataRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParallelDataConfig = ParallelDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParallelDataRequest]
  }
  
  extension [Self <: CreateParallelDataRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParallelDataConfig(value: ParallelDataConfig): Self = StObject.set(x, "ParallelDataConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
