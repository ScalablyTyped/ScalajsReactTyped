package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The Amazon S3 bucket name.
    */
  var Bucket: typingsJapgolly.awsSdk.clientsDatabrewMod.Bucket
  
  /**
    * The Amazon Web Services account ID of the bucket owner.
    */
  var BucketOwner: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.BucketOwner] = js.undefined
  
  /**
    * The unique name of the object in the bucket.
    */
  var Key: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.Key] = js.undefined
}
object S3Location {
  
  inline def apply(Bucket: Bucket): S3Location = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucket(value: Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketOwner(value: BucketOwner): Self = StObject.set(x, "BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setBucketOwnerUndefined: Self = StObject.set(x, "BucketOwner", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
