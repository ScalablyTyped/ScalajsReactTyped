package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAssetidOwner extends StObject {
  
  var path: AssetidOwner
}
object PathAssetidOwner {
  
  inline def apply(path: AssetidOwner): PathAssetidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAssetidOwner]
  }
  
  extension [Self <: PathAssetidOwner](x: Self) {
    
    inline def setPath(value: AssetidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
