package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundles extends StObject {
  
  var bundles: String
  
  var media: String
}
object Bundles {
  
  inline def apply(bundles: String, media: String): Bundles = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundles]
  }
  
  extension [Self <: Bundles](x: Self) {
    
    inline def setBundles(value: String): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
