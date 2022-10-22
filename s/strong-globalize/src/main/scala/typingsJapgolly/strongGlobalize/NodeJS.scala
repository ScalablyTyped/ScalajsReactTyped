package typingsJapgolly.strongGlobalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  trait Process extends StObject {
    
    var browser: Boolean
  }
  object Process {
    
    inline def apply(browser: Boolean): Process = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Process]
    }
    
    extension [Self <: Process](x: Self) {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    }
  }
}
