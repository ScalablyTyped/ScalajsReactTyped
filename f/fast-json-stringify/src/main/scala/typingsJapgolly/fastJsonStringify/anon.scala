package typingsJapgolly.fastJsonStringify

import typingsJapgolly.ajv.mod.default
import typingsJapgolly.fastJsonStringify.mod.ObjectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ajv extends StObject {
    
    var ajv: default
    
    var code: String
  }
  object Ajv {
    
    inline def apply(ajv: default, code: String): Ajv = {
      val __obj = js.Dynamic.literal(ajv = ajv.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ajv]
    }
    
    extension [Self <: Ajv](x: Self) {
      
      inline def setAjv(value: default): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllOf extends StObject {
    
    var allOf: js.UndefOr[js.Array[ObjectProperties]] = js.undefined
    
    var anyOf: js.UndefOr[js.Array[ObjectProperties]] = js.undefined
    
    var `else`: js.UndefOr[ObjectProperties] = js.undefined
    
    var `if`: js.UndefOr[ObjectProperties] = js.undefined
    
    var `then`: js.UndefOr[ObjectProperties] = js.undefined
  }
  object AllOf {
    
    inline def apply(): AllOf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllOf]
    }
    
    extension [Self <: AllOf](x: Self) {
      
      inline def setAllOf(value: js.Array[ObjectProperties]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(value: ObjectProperties*): Self = StObject.set(x, "allOf", js.Array(value*))
      
      inline def setAnyOf(value: js.Array[ObjectProperties]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(value: ObjectProperties*): Self = StObject.set(x, "anyOf", js.Array(value*))
      
      inline def setElse(value: ObjectProperties): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      inline def setIf(value: ObjectProperties): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setThen(value: ObjectProperties): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    }
  }
}
