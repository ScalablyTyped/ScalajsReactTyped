package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import typingsJapgolly.oidcProvider.mod.PKCEMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Methods extends StObject {
  
  var methods: js.Array[PKCEMethods]
  
  var required: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Boolean
    ]
  ] = js.undefined
}
object Methods {
  
  inline def apply(methods: js.Array[PKCEMethods]): Methods = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Methods]
  }
  
  extension [Self <: Methods](x: Self) {
    
    inline def setMethods(value: js.Array[PKCEMethods]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: PKCEMethods*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setRequired(
      value: (/* ctx */ KoaContextWithOIDC, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Boolean
    ): Self = StObject.set(x, "required", js.Any.fromFunction2(value))
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
