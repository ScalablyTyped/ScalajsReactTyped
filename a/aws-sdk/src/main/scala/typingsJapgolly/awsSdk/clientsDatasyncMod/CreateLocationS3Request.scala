package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationS3Request extends StObject {
  
  /**
    * If you're using DataSync on an Amazon Web Services Outpost, specify the Amazon Resource Names (ARNs) of the DataSync agents deployed on your Outpost. For more information about launching a DataSync agent on an Amazon Web Services Outpost, see Deploy your DataSync agent on Outposts.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The ARN of the Amazon S3 bucket. If the bucket is on an Amazon Web Services Outpost, this must be an access point ARN.
    */
  var S3BucketArn: typingsJapgolly.awsSdk.clientsDatasyncMod.S3BucketArn
  
  var S3Config: typingsJapgolly.awsSdk.clientsDatasyncMod.S3Config
  
  /**
    * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. For buckets in Amazon Web Services Regions, the storage class defaults to Standard. For buckets on Outposts, the storage class defaults to Amazon Web Services S3 Outposts. For more information about S3 storage classes, see Amazon S3 Storage Classes. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see Considerations when working with S3 storage classes in DataSync.
    */
  var S3StorageClass: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.S3StorageClass] = js.undefined
  
  /**
    * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
    */
  var Subdirectory: js.UndefOr[S3Subdirectory] = js.undefined
  
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationS3Request {
  
  inline def apply(S3BucketArn: S3BucketArn, S3Config: S3Config): CreateLocationS3Request = {
    val __obj = js.Dynamic.literal(S3BucketArn = S3BucketArn.asInstanceOf[js.Any], S3Config = S3Config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationS3Request]
  }
  
  extension [Self <: CreateLocationS3Request](x: Self) {
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setS3BucketArn(value: S3BucketArn): Self = StObject.set(x, "S3BucketArn", value.asInstanceOf[js.Any])
    
    inline def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    inline def setS3StorageClass(value: S3StorageClass): Self = StObject.set(x, "S3StorageClass", value.asInstanceOf[js.Any])
    
    inline def setS3StorageClassUndefined: Self = StObject.set(x, "S3StorageClass", js.undefined)
    
    inline def setSubdirectory(value: S3Subdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
