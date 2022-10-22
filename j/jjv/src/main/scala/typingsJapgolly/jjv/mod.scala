package typingsJapgolly.jjv

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jjv.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Env = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Env]
  
  @JSImport("jjv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Env extends StObject {
    
    def addCheck(name: String, check: js.Function2[/* input */ Any, /* comparator */ Any, Any]): Unit = js.native
    
    def addFormat(name: String, parse: js.Function1[/* input */ Any, Any]): Unit = js.native
    
    def addSchema(name: String, schema: js.Object): Unit = js.native
    
    def addType(name: String, parse: js.Function1[/* input */ Any, Any]): Unit = js.native
    
    def addTypeCoercion(name: String, coerce: js.Function1[/* input */ Any, Any]): Unit = js.native
    
    var defaultOptions: Options = js.native
    
    def validate(name: String, `object`: Any): Errors = js.native
    def validate(name: String, `object`: Any, options: Options): Errors = js.native
    def validate(schema: js.Object, `object`: Any): Errors = js.native
    def validate(schema: js.Object, `object`: Any, options: Options): Errors = js.native
  }
  
  trait Errors extends StObject {
    
    var validation: StringDictionary[Required]
  }
  object Errors {
    
    inline def apply(validation: StringDictionary[Required]): Errors = {
      val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setValidation(value: StringDictionary[Required]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var checkRequired: js.UndefOr[Boolean] = js.undefined
    
    var removeAdditional: js.UndefOr[Boolean] = js.undefined
    
    var useCoerce: js.UndefOr[Boolean] = js.undefined
    
    var useDefault: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCheckRequired(value: Boolean): Self = StObject.set(x, "checkRequired", value.asInstanceOf[js.Any])
      
      inline def setCheckRequiredUndefined: Self = StObject.set(x, "checkRequired", js.undefined)
      
      inline def setRemoveAdditional(value: Boolean): Self = StObject.set(x, "removeAdditional", value.asInstanceOf[js.Any])
      
      inline def setRemoveAdditionalUndefined: Self = StObject.set(x, "removeAdditional", js.undefined)
      
      inline def setUseCoerce(value: Boolean): Self = StObject.set(x, "useCoerce", value.asInstanceOf[js.Any])
      
      inline def setUseCoerceUndefined: Self = StObject.set(x, "useCoerce", js.undefined)
      
      inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
    }
  }
}
