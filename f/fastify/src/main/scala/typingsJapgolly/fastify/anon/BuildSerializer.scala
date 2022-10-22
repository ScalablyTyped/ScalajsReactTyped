package typingsJapgolly.fastify.anon

import typingsJapgolly.fastJsonStringify.mod.Options
import typingsJapgolly.fastifyAjvCompiler.mod.Ajv
import typingsJapgolly.fastifyAjvCompiler.mod.ValidatorCompiler
import typingsJapgolly.fastifyFastJsonStringifyCompiler.mod.SerializerCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSerializer extends StObject {
  
  var buildSerializer: js.UndefOr[SerializerCompiler] = js.undefined
  
  var buildValidator: js.UndefOr[ValidatorCompiler] = js.undefined
}
object BuildSerializer {
  
  inline def apply(): BuildSerializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSerializer]
  }
  
  extension [Self <: BuildSerializer](x: Self) {
    
    inline def setBuildSerializer(value: (/* externalSchemas */ Any, /* options */ Options) => js.Function1[/* doc */ Any, String]): Self = StObject.set(x, "buildSerializer", js.Any.fromFunction2(value))
    
    inline def setBuildSerializerUndefined: Self = StObject.set(x, "buildSerializer", js.undefined)
    
    inline def setBuildValidator(value: (/* externalSchemas */ Any, /* options */ typingsJapgolly.ajv.distCoreMod.Options) => Ajv): Self = StObject.set(x, "buildValidator", js.Any.fromFunction2(value))
    
    inline def setBuildValidatorUndefined: Self = StObject.set(x, "buildValidator", js.undefined)
  }
}
