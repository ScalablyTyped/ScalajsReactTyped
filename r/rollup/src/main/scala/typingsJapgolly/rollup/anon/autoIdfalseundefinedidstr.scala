package typingsJapgolly.rollup.anon

import typingsJapgolly.rollup.mod.AmdOptions
import typingsJapgolly.rollup.rollupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autoId :false | undefined,   id :string} & {  define :string | undefined,   forceJsExtensionForImports :boolean | undefined} */
trait autoIdfalseundefinedidstr
  extends StObject
     with AmdOptions {
  
  var autoId: js.UndefOr[`false`] = js.undefined
  
  var define: js.UndefOr[String] = js.undefined
  
  var forceJsExtensionForImports: js.UndefOr[Boolean] = js.undefined
  
  var id: String
}
object autoIdfalseundefinedidstr {
  
  inline def apply(id: String): autoIdfalseundefinedidstr = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoIdfalseundefinedidstr]
  }
  
  extension [Self <: autoIdfalseundefinedidstr](x: Self) {
    
    inline def setAutoId(value: `false`): Self = StObject.set(x, "autoId", value.asInstanceOf[js.Any])
    
    inline def setAutoIdUndefined: Self = StObject.set(x, "autoId", js.undefined)
    
    inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setForceJsExtensionForImports(value: Boolean): Self = StObject.set(x, "forceJsExtensionForImports", value.asInstanceOf[js.Any])
    
    inline def setForceJsExtensionForImportsUndefined: Self = StObject.set(x, "forceJsExtensionForImports", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
