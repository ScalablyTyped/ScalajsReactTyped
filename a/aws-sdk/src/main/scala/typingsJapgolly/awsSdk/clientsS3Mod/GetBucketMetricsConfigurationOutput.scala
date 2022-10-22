package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketMetricsConfigurationOutput extends StObject {
  
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.MetricsConfiguration] = js.undefined
}
object GetBucketMetricsConfigurationOutput {
  
  inline def apply(): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
  
  extension [Self <: GetBucketMetricsConfigurationOutput](x: Self) {
    
    inline def setMetricsConfiguration(value: MetricsConfiguration): Self = StObject.set(x, "MetricsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMetricsConfigurationUndefined: Self = StObject.set(x, "MetricsConfiguration", js.undefined)
  }
}
