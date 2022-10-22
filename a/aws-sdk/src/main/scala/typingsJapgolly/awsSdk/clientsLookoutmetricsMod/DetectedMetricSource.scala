package typingsJapgolly.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedMetricSource extends StObject {
  
  /**
    * The data source's source configuration.
    */
  var S3SourceConfig: js.UndefOr[DetectedS3SourceConfig] = js.undefined
}
object DetectedMetricSource {
  
  inline def apply(): DetectedMetricSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedMetricSource]
  }
  
  extension [Self <: DetectedMetricSource](x: Self) {
    
    inline def setS3SourceConfig(value: DetectedS3SourceConfig): Self = StObject.set(x, "S3SourceConfig", value.asInstanceOf[js.Any])
    
    inline def setS3SourceConfigUndefined: Self = StObject.set(x, "S3SourceConfig", js.undefined)
  }
}
