package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵNgModuleDef[T] extends StObject {
  
  /** List of components to bootstrap. */
  var bootstrap: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]
  
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]
  
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]
  
  /** Unique ID for the module with which it should be registered.  */
  var id: String | Null
  
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]
  
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.Array[SchemaMetadata] | Null
  
  /**
    * Cached value of computed `transitiveCompileScopes` for this module.
    *
    * This should never be read directly, but accessed via `transitiveScopesFor`.
    */
  var transitiveCompileScopes: ɵNgModuleTransitiveScopes | Null
  
  /** Token representing the module. Used by DI. */
  var `type`: T
}
object ɵNgModuleDef {
  
  inline def apply[T](
    bootstrap: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]],
    declarations: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]],
    exports: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]],
    imports: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]],
    `type`: T
  ): ɵNgModuleDef[T] = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], id = null, schemas = null, transitiveCompileScopes = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleDef[T]]
  }
  
  extension [Self <: ɵNgModuleDef[?], T](x: Self & ɵNgModuleDef[T]) {
    
    inline def setBootstrap(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "bootstrap", value.toJsFn)
    
    inline def setBootstrapVarargs(value: Type[Any]*): Self = StObject.set(x, "bootstrap", js.Array(value*))
    
    inline def setDeclarations(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "declarations", value.toJsFn)
    
    inline def setDeclarationsVarargs(value: Type[Any]*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setExports(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "exports", value.toJsFn)
    
    inline def setExportsVarargs(value: Type[Any]*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setImports(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsCallbackTo(value: CallbackTo[js.Array[Type[Any]]]): Self = StObject.set(x, "imports", value.toJsFn)
    
    inline def setImportsVarargs(value: Type[Any]*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setTransitiveCompileScopes(value: ɵNgModuleTransitiveScopes): Self = StObject.set(x, "transitiveCompileScopes", value.asInstanceOf[js.Any])
    
    inline def setTransitiveCompileScopesNull: Self = StObject.set(x, "transitiveCompileScopes", null)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
