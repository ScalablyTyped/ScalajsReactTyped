package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.webpackStrings.`amd-require`
import typingsJapgolly.webpack.webpackStrings.`commonjs-module`
import typingsJapgolly.webpack.webpackStrings.`this`
import typingsJapgolly.webpack.webpackStrings.`var`
import typingsJapgolly.webpack.webpackStrings.amd
import typingsJapgolly.webpack.webpackStrings.assign
import typingsJapgolly.webpack.webpackStrings.commonjs
import typingsJapgolly.webpack.webpackStrings.commonjs2
import typingsJapgolly.webpack.webpackStrings.global
import typingsJapgolly.webpack.webpackStrings.jsonp
import typingsJapgolly.webpack.webpackStrings.system
import typingsJapgolly.webpack.webpackStrings.umd
import typingsJapgolly.webpack.webpackStrings.umd2
import typingsJapgolly.webpack.webpackStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing content, name and type.
  */
trait DllReferencePluginOptionsManifest extends StObject {
  
  /**
  	 * The mappings from request to module info.
  	 */
  var content: DllReferencePluginOptionsContent
  
  /**
  	 * The name where the dll is exposed (external name).
  	 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * The type how the dll is exposed (external type).
  	 */
  var `type`: js.UndefOr[
    `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
  ] = js.undefined
}
object DllReferencePluginOptionsManifest {
  
  inline def apply(content: DllReferencePluginOptionsContent): DllReferencePluginOptionsManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DllReferencePluginOptionsManifest]
  }
  
  extension [Self <: DllReferencePluginOptionsManifest](x: Self) {
    
    inline def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(
      value: `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
