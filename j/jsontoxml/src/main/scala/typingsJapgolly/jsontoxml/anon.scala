package typingsJapgolly.jsontoxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Standalone extends StObject {
    
    var standalone: js.UndefOr[Boolean] = js.undefined
  }
  object Standalone {
    
    inline def apply(): Standalone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Standalone]
    }
    
    extension [Self <: Standalone](x: Self) {
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
