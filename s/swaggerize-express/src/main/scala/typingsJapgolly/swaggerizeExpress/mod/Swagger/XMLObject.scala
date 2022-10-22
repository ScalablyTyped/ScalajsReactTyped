package typingsJapgolly.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLObject
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  var attribute: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var wrapped: js.UndefOr[Boolean] = js.undefined
}
object XMLObject {
  
  inline def apply(): XMLObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLObject]
  }
  
  extension [Self <: XMLObject](x: Self) {
    
    inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    
    inline def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
  }
}
