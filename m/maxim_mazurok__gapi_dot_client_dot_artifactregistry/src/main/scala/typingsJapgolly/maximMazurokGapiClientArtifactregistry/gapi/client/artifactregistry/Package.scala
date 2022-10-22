package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  /** The time when the package was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The display name of the package. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The name of the package, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1". If the package ID part contains slashes, the slashes are escaped. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The time when the package was last updated. This includes publishing a new version of the package. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Package {
  
  inline def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  
  extension [Self <: Package](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
