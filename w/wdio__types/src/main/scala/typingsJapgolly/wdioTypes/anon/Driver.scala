package typingsJapgolly.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Driver extends StObject {
  
  var driver: js.UndefOr[String] = js.undefined
}
object Driver {
  
  inline def apply(): Driver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Driver]
  }
  
  extension [Self <: Driver](x: Self) {
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
  }
}
