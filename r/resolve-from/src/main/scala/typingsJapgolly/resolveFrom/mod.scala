package typingsJapgolly.resolveFrom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from a given path.
  	@param fromDirectory - Directory to resolve from.
  	@param moduleId - What you would use in `require()`.
  	@returns Resolved module path. Throws when the module can't be found.
  	@example
  	```
  	import resolveFrom = require('resolve-from');
  	// There is a file at `./foo/bar.js`
  	resolveFrom('foo', './bar');
  	//=> '/Users/sindresorhus/dev/test/foo/bar.js'
  	```
  	*/
  inline def apply(fromDirectory: String, moduleId: String): String = (^.asInstanceOf[js.Dynamic].apply(fromDirectory.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("resolve-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from a given path.
  	@param fromDirectory - Directory to resolve from.
  	@param moduleId - What you would use in `require()`.
  	@returns Resolved module path or `undefined` when the module can't be found.
  	*/
  inline def silent(fromDirectory: String, moduleId: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("silent")(fromDirectory.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
