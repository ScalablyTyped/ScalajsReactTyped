package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigVersion extends StObject {
  
  var Index: Double
}
object ConfigVersion {
  
  inline def apply(Index: Double): ConfigVersion = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigVersion]
  }
  
  extension [Self <: ConfigVersion](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
  }
}
