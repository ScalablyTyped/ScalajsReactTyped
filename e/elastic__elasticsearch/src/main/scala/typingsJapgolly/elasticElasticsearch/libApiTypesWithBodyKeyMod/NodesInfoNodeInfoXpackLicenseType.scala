package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackLicenseType extends StObject {
  
  var `type`: String
}
object NodesInfoNodeInfoXpackLicenseType {
  
  inline def apply(`type`: String): NodesInfoNodeInfoXpackLicenseType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackLicenseType]
  }
  
  extension [Self <: NodesInfoNodeInfoXpackLicenseType](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
