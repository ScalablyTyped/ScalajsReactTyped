package typingsJapgolly.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDetail extends StObject {
  
  /**
    * The artifact media type of the image.
    */
  var artifactMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The media type of the image manifest.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. 
    */
  var imagePushedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A summary of the last completed image scan.
    */
  var imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary] = js.undefined
  
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined
  
  /**
    * The size, in bytes, of the image in the repository. If the image is a manifest list, this will be the max size of all manifests in the list.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined
  
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.undefined
  
  /**
    * The date and time, expressed in standard JavaScript date format, when Amazon ECR recorded the last image pull.  Amazon ECR refreshes the last image pull timestamp at least once every 24 hours. For example, if you pull an image once a day then the lastRecordedPullTime timestamp will indicate the exact time that the image was last pulled. However, if you pull an image once an hour, because Amazon ECR refreshes the lastRecordedPullTime timestamp at least once every 24 hours, the result may not be the exact time that the image was last pulled. 
    */
  var lastRecordedPullTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry to which this image belongs.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to which this image belongs.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object ImageDetail {
  
  inline def apply(): ImageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetail]
  }
  
  extension [Self <: ImageDetail](x: Self) {
    
    inline def setArtifactMediaType(value: MediaType): Self = StObject.set(x, "artifactMediaType", value.asInstanceOf[js.Any])
    
    inline def setArtifactMediaTypeUndefined: Self = StObject.set(x, "artifactMediaType", js.undefined)
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setImageManifestMediaType(value: MediaType): Self = StObject.set(x, "imageManifestMediaType", value.asInstanceOf[js.Any])
    
    inline def setImageManifestMediaTypeUndefined: Self = StObject.set(x, "imageManifestMediaType", js.undefined)
    
    inline def setImagePushedAt(value: js.Date): Self = StObject.set(x, "imagePushedAt", value.asInstanceOf[js.Any])
    
    inline def setImagePushedAtUndefined: Self = StObject.set(x, "imagePushedAt", js.undefined)
    
    inline def setImageScanFindingsSummary(value: ImageScanFindingsSummary): Self = StObject.set(x, "imageScanFindingsSummary", value.asInstanceOf[js.Any])
    
    inline def setImageScanFindingsSummaryUndefined: Self = StObject.set(x, "imageScanFindingsSummary", js.undefined)
    
    inline def setImageScanStatus(value: ImageScanStatus): Self = StObject.set(x, "imageScanStatus", value.asInstanceOf[js.Any])
    
    inline def setImageScanStatusUndefined: Self = StObject.set(x, "imageScanStatus", js.undefined)
    
    inline def setImageSizeInBytes(value: ImageSizeInBytes): Self = StObject.set(x, "imageSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setImageSizeInBytesUndefined: Self = StObject.set(x, "imageSizeInBytes", js.undefined)
    
    inline def setImageTags(value: ImageTagList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: ImageTag*): Self = StObject.set(x, "imageTags", js.Array(value*))
    
    inline def setLastRecordedPullTime(value: js.Date): Self = StObject.set(x, "lastRecordedPullTime", value.asInstanceOf[js.Any])
    
    inline def setLastRecordedPullTimeUndefined: Self = StObject.set(x, "lastRecordedPullTime", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
