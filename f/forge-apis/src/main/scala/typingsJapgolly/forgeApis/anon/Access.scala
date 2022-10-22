package typingsJapgolly.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Access extends StObject {
  
  var access: js.UndefOr[String] = js.undefined
}
object Access {
  
  inline def apply(): Access = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Access]
  }
  
  extension [Self <: Access](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
