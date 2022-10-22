package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.GoogleEarthEnterpriseMetadata
import typingsJapgolly.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var credit: js.UndefOr[typingsJapgolly.cesium.mod.Credit | String] = js.undefined
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var metadata: GoogleEarthEnterpriseMetadata
  
  var url: Resource | String
}
object Metadata {
  
  inline def apply(metadata: GoogleEarthEnterpriseMetadata, url: Resource | String): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setCredit(value: typingsJapgolly.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setMetadata(value: GoogleEarthEnterpriseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
