package typingsJapgolly.duplicatePackageCheckerWebpackPlugin

import typingsJapgolly.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("duplicate-package-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  type DuplicatePackageCheckerWebpackPlugin = Plugin
  
  /** The configurable options for the plugin */
  trait Options extends StObject {
    
    /** Emit errors instead of warnings (default: false) */
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclude instances of packages from the results.
      * If all instances of a package are excluded, or all instances except one,
      * then the package is no longer considered duplicated and won't be emitted as a warning/error.
      * @param instance The instance of a package being evaluated for exclusion.
      * @returns true to exclude the instance, false otherwise
      */
    var exclude: js.UndefOr[js.Function1[/* instance */ PackageInstanceProperties, Boolean]] = js.undefined
    
    /** Show help message if duplicate packages are found (default: true) */
    var showHelp: js.UndefOr[Boolean] = js.undefined
    
    /** Warn also if major versions differ (default: true) */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /** Also show module that is requiring each duplicate package (default: false) */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      inline def setExclude(value: /* instance */ PackageInstanceProperties => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setShowHelp(value: Boolean): Self = StObject.set(x, "showHelp", value.asInstanceOf[js.Any])
      
      inline def setShowHelpUndefined: Self = StObject.set(x, "showHelp", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /** The properties of the instance of a package */
  trait PackageInstanceProperties extends StObject {
    
    /** Absolute path to the module that requested the package */
    var issuer: js.UndefOr[String] = js.undefined
    
    /** The name of the package */
    var name: String
    
    /** Absolute path to the package */
    var path: String
    
    /** The version of the package */
    var version: String
  }
  object PackageInstanceProperties {
    
    inline def apply(name: String, path: String, version: String): PackageInstanceProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInstanceProperties]
    }
    
    extension [Self <: PackageInstanceProperties](x: Self) {
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
