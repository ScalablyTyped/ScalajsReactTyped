package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.RestProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use `RestElement`
  */
trait RestProperty1
  extends StObject
     with BaseNode
     with DeprecatedAliases
     with Node {
  
  var argument: LVal
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation__ | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_RestProperty1: RestProperty
}
object RestProperty1 {
  
  inline def apply(argument: LVal): RestProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[RestProperty1]
  }
  
  extension [Self <: RestProperty1](x: Self) {
    
    inline def setArgument(value: LVal): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setType(value: RestProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation__ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
