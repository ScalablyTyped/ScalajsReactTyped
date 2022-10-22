package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.mod.DllReferencePluginOptions
import typingsJapgolly.webpack.mod.DllReferencePluginOptionsManifest
import typingsJapgolly.webpack.webpackStrings.`amd-require`
import typingsJapgolly.webpack.webpackStrings.`commonjs-module`
import typingsJapgolly.webpack.webpackStrings.`object`
import typingsJapgolly.webpack.webpackStrings.`this`
import typingsJapgolly.webpack.webpackStrings.`var`
import typingsJapgolly.webpack.webpackStrings.amd
import typingsJapgolly.webpack.webpackStrings.assign
import typingsJapgolly.webpack.webpackStrings.commonjs
import typingsJapgolly.webpack.webpackStrings.commonjs2
import typingsJapgolly.webpack.webpackStrings.global
import typingsJapgolly.webpack.webpackStrings.jsonp
import typingsJapgolly.webpack.webpackStrings.require
import typingsJapgolly.webpack.webpackStrings.system
import typingsJapgolly.webpack.webpackStrings.umd
import typingsJapgolly.webpack.webpackStrings.umd2
import typingsJapgolly.webpack.webpackStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions
  extends StObject
     with DllReferencePluginOptions {
  
  /**
  			 * Context of requests in the manifest (or content property) as absolute path.
  			 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope').
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  			 * An object containing content and name or a string to the absolute path of the JSON manifest to be loaded upon compilation.
  			 */
  var manifest: String | DllReferencePluginOptionsManifest
  
  /**
  			 * The name where the dll is exposed (external name, defaults to manifest.name).
  			 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  			 * Prefix which is used for accessing the content of the dll.
  			 */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
  			 * How the dll is exposed (libraryTarget, defaults to manifest.type).
  			 */
  var sourceType: js.UndefOr[
    `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
  ] = js.undefined
  
  /**
  			 * The way how the export of the dll bundle is used.
  			 */
  var `type`: js.UndefOr[`object` | require] = js.undefined
}
object Extensions {
  
  inline def apply(manifest: String | DllReferencePluginOptionsManifest): Extensions = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setManifest(value: String | DllReferencePluginOptionsManifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSourceType(
      value: `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setType(value: `object` | require): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
