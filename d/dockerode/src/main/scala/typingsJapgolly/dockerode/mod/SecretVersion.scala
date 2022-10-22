package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretVersion extends StObject {
  
  var Index: Double
}
object SecretVersion {
  
  inline def apply(Index: Double): SecretVersion = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVersion]
  }
  
  extension [Self <: SecretVersion](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
  }
}
