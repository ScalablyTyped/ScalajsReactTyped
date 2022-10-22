package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  var GroundTruthManifest: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.GroundTruthManifest] = js.undefined
}
object Asset {
  
  inline def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setGroundTruthManifest(value: GroundTruthManifest): Self = StObject.set(x, "GroundTruthManifest", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthManifestUndefined: Self = StObject.set(x, "GroundTruthManifest", js.undefined)
  }
}
