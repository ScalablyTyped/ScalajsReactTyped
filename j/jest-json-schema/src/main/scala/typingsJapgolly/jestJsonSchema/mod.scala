package typingsJapgolly.jestJsonSchema

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ajv.mod.Ajv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-json-schema", "matchers")
  @js.native
  val matchers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ExpectExtendMap */ Any = js.native
  
  inline def matchersWithOptions(options: Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("matchersWithOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def matchersWithOptions(options: Options, extendAjv: js.Function1[/* ajv */ Ajv, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchersWithOptions")(options.asInstanceOf[js.Any], extendAjv.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Options
    extends StObject
       with typingsJapgolly.ajv.distCoreMod.Options {
    
    var AjvClass: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAjvClass(value: Any): Self = StObject.set(x, "AjvClass", value.asInstanceOf[js.Any])
      
      inline def setAjvClassUndefined: Self = StObject.set(x, "AjvClass", js.undefined)
    }
  }
  
  object global {
    
    object jest {
      
      trait Matchers[R, T] extends StObject {
        
        def toBeValidSchema(): R
        
        def toMatchSchema(schema: js.Object): R
      }
      object Matchers {
        
        inline def apply[R, T](toBeValidSchema: CallbackTo[R], toMatchSchema: js.Object => R): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toBeValidSchema = toBeValidSchema.toJsFn, toMatchSchema = js.Any.fromFunction1(toMatchSchema))
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        extension [Self <: Matchers[?, ?], R, T](x: Self & (Matchers[R, T])) {
          
          inline def setToBeValidSchema(value: CallbackTo[R]): Self = StObject.set(x, "toBeValidSchema", value.toJsFn)
          
          inline def setToMatchSchema(value: js.Object => R): Self = StObject.set(x, "toMatchSchema", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
