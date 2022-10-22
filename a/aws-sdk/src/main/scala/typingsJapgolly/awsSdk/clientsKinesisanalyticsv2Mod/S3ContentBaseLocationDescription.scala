package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ContentBaseLocationDescription extends StObject {
  
  /**
    * The base path for the S3 bucket.
    */
  var BasePath: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.BasePath] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.BucketARN
}
object S3ContentBaseLocationDescription {
  
  inline def apply(BucketARN: BucketARN): S3ContentBaseLocationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ContentBaseLocationDescription]
  }
  
  extension [Self <: S3ContentBaseLocationDescription](x: Self) {
    
    inline def setBasePath(value: BasePath): Self = StObject.set(x, "BasePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "BasePath", js.undefined)
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
  }
}
