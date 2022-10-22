package typingsJapgolly.reactHelmetAsync

import typingsJapgolly.reactHelmetAsync.mod.HelmetServerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Helmet extends StObject {
    
    var helmet: HelmetServerState
  }
  object Helmet {
    
    inline def apply(helmet: HelmetServerState): Helmet = {
      val __obj = js.Dynamic.literal(helmet = helmet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Helmet]
    }
    
    extension [Self <: Helmet](x: Self) {
      
      inline def setHelmet(value: HelmetServerState): Self = StObject.set(x, "helmet", value.asInstanceOf[js.Any])
    }
  }
}
