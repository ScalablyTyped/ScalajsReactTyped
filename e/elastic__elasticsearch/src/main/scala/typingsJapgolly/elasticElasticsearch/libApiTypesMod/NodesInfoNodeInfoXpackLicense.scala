package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackLicense extends StObject {
  
  var self_generated: NodesInfoNodeInfoXpackLicenseType
}
object NodesInfoNodeInfoXpackLicense {
  
  inline def apply(self_generated: NodesInfoNodeInfoXpackLicenseType): NodesInfoNodeInfoXpackLicense = {
    val __obj = js.Dynamic.literal(self_generated = self_generated.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackLicense]
  }
  
  extension [Self <: NodesInfoNodeInfoXpackLicense](x: Self) {
    
    inline def setSelf_generated(value: NodesInfoNodeInfoXpackLicenseType): Self = StObject.set(x, "self_generated", value.asInstanceOf[js.Any])
  }
}
