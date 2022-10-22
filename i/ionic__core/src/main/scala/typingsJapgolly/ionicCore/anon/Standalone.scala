package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Standalone extends StObject {
  
  var standalone: Boolean
}
object Standalone {
  
  inline def apply(standalone: Boolean): Standalone = {
    val __obj = js.Dynamic.literal(standalone = standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standalone]
  }
  
  extension [Self <: Standalone](x: Self) {
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
  }
}
