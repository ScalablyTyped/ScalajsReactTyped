package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvePath extends StObject {
  
  var resolvePath: String
  
  var virtualName: js.UndefOr[String] = js.undefined
}
object ResolvePath {
  
  inline def apply(resolvePath: String): ResolvePath = {
    val __obj = js.Dynamic.literal(resolvePath = resolvePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvePath]
  }
  
  extension [Self <: ResolvePath](x: Self) {
    
    inline def setResolvePath(value: String): Self = StObject.set(x, "resolvePath", value.asInstanceOf[js.Any])
    
    inline def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
