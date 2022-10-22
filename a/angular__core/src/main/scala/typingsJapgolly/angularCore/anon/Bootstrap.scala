package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.mod.SchemaMetadata
import typingsJapgolly.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bootstrap[T] extends StObject {
  
  /** List of components to bootstrap. */
  var bootstrap: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
  
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
  
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
  
  /** Unique ID for the module that is used with `getModuleFactory`. */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
  
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  
  /** Token representing the module. Used by DI. */
  var `type`: T
}
object Bootstrap {
  
  inline def apply[T](`type`: T): Bootstrap[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bootstrap[T]]
  }
  
  extension [Self <: Bootstrap[?], T](x: Self & Bootstrap[T]) {
    
    inline def setBootstrap(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "bootstrap", value.toJsFn)
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setBootstrapVarargs(value: Type[Any]*): Self = StObject.set(x, "bootstrap", js.Array(value*))
    
    inline def setDeclarations(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "declarations", value.toJsFn)
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: Type[Any]*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setExports(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "exports", value.toJsFn)
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: Type[Any]*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "imports", value.toJsFn)
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Type[Any]*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
