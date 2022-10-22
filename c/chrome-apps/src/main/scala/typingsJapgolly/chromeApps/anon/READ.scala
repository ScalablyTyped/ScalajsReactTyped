package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait READ extends StObject {
  
  var READ: typingsJapgolly.chromeApps.chromeAppsStrings.READ
  
  var WRITE: typingsJapgolly.chromeApps.chromeAppsStrings.WRITE
}
object READ {
  
  inline def apply(): READ = {
    val __obj = js.Dynamic.literal(READ = "READ", WRITE = "WRITE")
    __obj.asInstanceOf[READ]
  }
  
  extension [Self <: READ](x: Self) {
    
    inline def setREAD(value: typingsJapgolly.chromeApps.chromeAppsStrings.READ): Self = StObject.set(x, "READ", value.asInstanceOf[js.Any])
    
    inline def setWRITE(value: WRITE): Self = StObject.set(x, "WRITE", value.asInstanceOf[js.Any])
  }
}
