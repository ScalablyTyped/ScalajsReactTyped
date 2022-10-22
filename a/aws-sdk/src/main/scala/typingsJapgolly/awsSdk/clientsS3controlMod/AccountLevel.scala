package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLevel extends StObject {
  
  /**
    * A container for the S3 Storage Lens activity metrics.
    */
  var ActivityMetrics: js.UndefOr[typingsJapgolly.awsSdk.clientsS3controlMod.ActivityMetrics] = js.undefined
  
  /**
    * A container for the S3 Storage Lens bucket-level configuration.
    */
  var BucketLevel: typingsJapgolly.awsSdk.clientsS3controlMod.BucketLevel
}
object AccountLevel {
  
  inline def apply(BucketLevel: BucketLevel): AccountLevel = {
    val __obj = js.Dynamic.literal(BucketLevel = BucketLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLevel]
  }
  
  extension [Self <: AccountLevel](x: Self) {
    
    inline def setActivityMetrics(value: ActivityMetrics): Self = StObject.set(x, "ActivityMetrics", value.asInstanceOf[js.Any])
    
    inline def setActivityMetricsUndefined: Self = StObject.set(x, "ActivityMetrics", js.undefined)
    
    inline def setBucketLevel(value: BucketLevel): Self = StObject.set(x, "BucketLevel", value.asInstanceOf[js.Any])
  }
}
