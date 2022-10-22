package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDigests extends StObject {
  
  /**
    * Provides a hash value that uniquely identifies the stored model artifacts.
    */
  var ArtifactDigest: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ArtifactDigest] = js.undefined
}
object ModelDigests {
  
  inline def apply(): ModelDigests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDigests]
  }
  
  extension [Self <: ModelDigests](x: Self) {
    
    inline def setArtifactDigest(value: ArtifactDigest): Self = StObject.set(x, "ArtifactDigest", value.asInstanceOf[js.Any])
    
    inline def setArtifactDigestUndefined: Self = StObject.set(x, "ArtifactDigest", js.undefined)
  }
}
