package typingsJapgolly.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MagneticStoreRejectedDataLocation extends StObject {
  
  /**
    * Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes.
    */
  var S3Configuration: js.UndefOr[typingsJapgolly.awsSdk.clientsTimestreamwriteMod.S3Configuration] = js.undefined
}
object MagneticStoreRejectedDataLocation {
  
  inline def apply(): MagneticStoreRejectedDataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagneticStoreRejectedDataLocation]
  }
  
  extension [Self <: MagneticStoreRejectedDataLocation](x: Self) {
    
    inline def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
  }
}
