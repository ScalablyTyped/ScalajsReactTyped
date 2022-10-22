package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.webpackBooleans.`false`
import typingsJapgolly.webpack.webpackStrings.`amd-require`
import typingsJapgolly.webpack.webpackStrings.`commonjs-module`
import typingsJapgolly.webpack.webpackStrings.`commonjs-static`
import typingsJapgolly.webpack.webpackStrings.`import`
import typingsJapgolly.webpack.webpackStrings.`node-commonjs`
import typingsJapgolly.webpack.webpackStrings.`this`
import typingsJapgolly.webpack.webpackStrings.`var`
import typingsJapgolly.webpack.webpackStrings.amd
import typingsJapgolly.webpack.webpackStrings.assign
import typingsJapgolly.webpack.webpackStrings.commonjs
import typingsJapgolly.webpack.webpackStrings.commonjs2
import typingsJapgolly.webpack.webpackStrings.global
import typingsJapgolly.webpack.webpackStrings.jsonp
import typingsJapgolly.webpack.webpackStrings.module
import typingsJapgolly.webpack.webpackStrings.promise
import typingsJapgolly.webpack.webpackStrings.script
import typingsJapgolly.webpack.webpackStrings.self
import typingsJapgolly.webpack.webpackStrings.system
import typingsJapgolly.webpack.webpackStrings.umd
import typingsJapgolly.webpack.webpackStrings.umd2
import typingsJapgolly.webpack.webpackStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFederationPluginOptions extends StObject {
  
  /**
  	 * Modules that should be exposed by this container. When provided, property name is used as public name, otherwise public name is automatically inferred from request.
  	 */
  var exposes: js.UndefOr[(js.Array[String | ExposesObject]) | ExposesObject] = js.undefined
  
  /**
  	 * The filename of the container as relative path inside the `output.path` directory.
  	 */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Options for library.
  	 */
  var library: js.UndefOr[LibraryOptions] = js.undefined
  
  /**
  	 * The name of the container.
  	 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * The external type of the remote containers.
  	 */
  var remoteType: js.UndefOr[
    `import` | `var` | module | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | `commonjs-static` | amd | `amd-require` | umd | umd2 | jsonp | system | promise | script | `node-commonjs`
  ] = js.undefined
  
  /**
  	 * Container locations and request scopes from which modules should be resolved and loaded at runtime. When provided, property name is used as request scope, otherwise request scope is automatically inferred from container location.
  	 */
  var remotes: js.UndefOr[(js.Array[String | RemotesObject]) | RemotesObject] = js.undefined
  
  /**
  	 * The name of the runtime chunk. If set a runtime chunk with this name is created or an existing entrypoint is used as runtime.
  	 */
  var runtime: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Share scope name used for all shared modules (defaults to 'default').
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
  
  /**
  	 * Modules that should be shared in the share scope. When provided, property names are used to match requested modules in this compilation.
  	 */
  var shared: js.UndefOr[(js.Array[String | SharedObject]) | SharedObject] = js.undefined
}
object ModuleFederationPluginOptions {
  
  inline def apply(): ModuleFederationPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleFederationPluginOptions]
  }
  
  extension [Self <: ModuleFederationPluginOptions](x: Self) {
    
    inline def setExposes(value: (js.Array[String | ExposesObject]) | ExposesObject): Self = StObject.set(x, "exposes", value.asInstanceOf[js.Any])
    
    inline def setExposesUndefined: Self = StObject.set(x, "exposes", js.undefined)
    
    inline def setExposesVarargs(value: (String | ExposesObject)*): Self = StObject.set(x, "exposes", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setLibrary(value: LibraryOptions): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemoteType(
      value: `import` | `var` | module | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | `commonjs-static` | amd | `amd-require` | umd | umd2 | jsonp | system | promise | script | `node-commonjs`
    ): Self = StObject.set(x, "remoteType", value.asInstanceOf[js.Any])
    
    inline def setRemoteTypeUndefined: Self = StObject.set(x, "remoteType", js.undefined)
    
    inline def setRemotes(value: (js.Array[String | RemotesObject]) | RemotesObject): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
    
    inline def setRemotesUndefined: Self = StObject.set(x, "remotes", js.undefined)
    
    inline def setRemotesVarargs(value: (String | RemotesObject)*): Self = StObject.set(x, "remotes", js.Array(value*))
    
    inline def setRuntime(value: String | `false`): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
    
    inline def setShared(value: (js.Array[String | SharedObject]) | SharedObject): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSharedVarargs(value: (String | SharedObject)*): Self = StObject.set(x, "shared", js.Array(value*))
  }
}
