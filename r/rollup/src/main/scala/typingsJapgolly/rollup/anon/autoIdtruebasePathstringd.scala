package typingsJapgolly.rollup.anon

import typingsJapgolly.rollup.mod.NormalizedAmdOptions
import typingsJapgolly.rollup.rollupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autoId :true,   basePath :string} & {  define :string,   forceJsExtensionForImports :boolean} */
trait autoIdtruebasePathstringd
  extends StObject
     with NormalizedAmdOptions {
  
  var autoId: `true`
  
  var basePath: String
  
  var define: String
  
  var forceJsExtensionForImports: Boolean
}
object autoIdtruebasePathstringd {
  
  inline def apply(basePath: String, define: String, forceJsExtensionForImports: Boolean): autoIdtruebasePathstringd = {
    val __obj = js.Dynamic.literal(autoId = true, basePath = basePath.asInstanceOf[js.Any], define = define.asInstanceOf[js.Any], forceJsExtensionForImports = forceJsExtensionForImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoIdtruebasePathstringd]
  }
  
  extension [Self <: autoIdtruebasePathstringd](x: Self) {
    
    inline def setAutoId(value: `true`): Self = StObject.set(x, "autoId", value.asInstanceOf[js.Any])
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setForceJsExtensionForImports(value: Boolean): Self = StObject.set(x, "forceJsExtensionForImports", value.asInstanceOf[js.Any])
  }
}
