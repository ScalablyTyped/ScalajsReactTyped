package typingsJapgolly.sugar.sugarjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendOptions extends StObject {
  
  var enhance: js.UndefOr[Boolean] = js.undefined
  
  var enhanceArray: js.UndefOr[Boolean] = js.undefined
  
  var enhanceString: js.UndefOr[Boolean] = js.undefined
  
  var except: js.UndefOr[typingsJapgolly.sugar.Array[java.lang.String | NativeConstructor]] = js.undefined
  
  var methods: js.UndefOr[typingsJapgolly.sugar.Array[java.lang.String]] = js.undefined
  
  var namespaces: js.UndefOr[typingsJapgolly.sugar.Array[NativeConstructor]] = js.undefined
  
  var objectPrototype: js.UndefOr[Boolean] = js.undefined
}
object ExtendOptions {
  
  inline def apply(): ExtendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOptions]
  }
  
  extension [Self <: ExtendOptions](x: Self) {
    
    inline def setEnhance(value: Boolean): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
    
    inline def setEnhanceArray(value: Boolean): Self = StObject.set(x, "enhanceArray", value.asInstanceOf[js.Any])
    
    inline def setEnhanceArrayUndefined: Self = StObject.set(x, "enhanceArray", js.undefined)
    
    inline def setEnhanceString(value: Boolean): Self = StObject.set(x, "enhanceString", value.asInstanceOf[js.Any])
    
    inline def setEnhanceStringUndefined: Self = StObject.set(x, "enhanceString", js.undefined)
    
    inline def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
    
    inline def setExcept(value: typingsJapgolly.sugar.Array[java.lang.String | NativeConstructor]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setMethods(value: typingsJapgolly.sugar.Array[java.lang.String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setNamespaces(value: typingsJapgolly.sugar.Array[NativeConstructor]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setObjectPrototype(value: Boolean): Self = StObject.set(x, "objectPrototype", value.asInstanceOf[js.Any])
    
    inline def setObjectPrototypeUndefined: Self = StObject.set(x, "objectPrototype", js.undefined)
  }
}
