package typingsJapgolly.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageSource extends StObject {
  
  /**
    * Name of the bucket containing the package.
    */
  var S3BucketName: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.S3BucketName] = js.undefined
  
  /**
    * Key (file name) of the package.
    */
  var S3Key: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.S3Key] = js.undefined
}
object PackageSource {
  
  inline def apply(): PackageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageSource]
  }
  
  extension [Self <: PackageSource](x: Self) {
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
