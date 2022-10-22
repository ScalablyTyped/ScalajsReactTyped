package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReplacement extends StObject {
  
  var replace: js.UndefOr[String] = js.undefined
  
  var replaceWith: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `with`: js.UndefOr[String] = js.undefined
}
object FileReplacement {
  
  inline def apply(): FileReplacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileReplacement]
  }
  
  extension [Self <: FileReplacement](x: Self) {
    
    inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
    
    inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setWith(value: String): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    
    inline def setWithUndefined: Self = StObject.set(x, "with", js.undefined)
  }
}
