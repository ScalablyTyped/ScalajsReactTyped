package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringConstraintsResource extends StObject {
  
  /**
    * The Amazon S3 URI for the constraints resource.
    */
  var S3Uri: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.S3Uri] = js.undefined
}
object MonitoringConstraintsResource {
  
  inline def apply(): MonitoringConstraintsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConstraintsResource]
  }
  
  extension [Self <: MonitoringConstraintsResource](x: Self) {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
