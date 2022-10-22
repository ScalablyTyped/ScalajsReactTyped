package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRecipeSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The date on which this image recipe was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the image recipe.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The owner of the image recipe.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The base image of the image recipe.
    */
  var parentImage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platform of the image recipe.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The tags of the image recipe.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object ImageRecipeSummary {
  
  inline def apply(): ImageRecipeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRecipeSummary]
  }
  
  extension [Self <: ImageRecipeSummary](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentImage(value: NonEmptyString): Self = StObject.set(x, "parentImage", value.asInstanceOf[js.Any])
    
    inline def setParentImageUndefined: Self = StObject.set(x, "parentImage", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
