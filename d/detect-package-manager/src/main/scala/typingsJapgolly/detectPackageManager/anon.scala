package typingsJapgolly.detectPackageManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
  }
  object Cwd {
    
    inline def apply(): Cwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cwd]
    }
    
    extension [Self <: Cwd](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
