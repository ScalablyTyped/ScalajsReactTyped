package typingsJapgolly.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHelpersInstallMod {
  
  @JSImport("next/dist/lib/helpers/install", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(
    root: String,
    dependencies: js.Array[String],
    hasPackageManagerIsOnlineDevDependencies: InstallArgs
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(root.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], hasPackageManagerIsOnlineDevDependencies.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def install(root: String, dependencies: Null, hasPackageManagerIsOnlineDevDependencies: InstallArgs): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(root.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], hasPackageManagerIsOnlineDevDependencies.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait InstallArgs extends StObject {
    
    /**
      * Indicate whether the given dependencies are devDependencies.
      */
    var devDependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicate whether there is an active Internet connection.
      */
    var isOnline: Boolean
    
    /**
      * Indicate whether to install packages using npm, pnpm or Yarn.
      */
    var packageManager: PackageManager
  }
  object InstallArgs {
    
    inline def apply(isOnline: Boolean, packageManager: PackageManager): InstallArgs = {
      val __obj = js.Dynamic.literal(isOnline = isOnline.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallArgs]
    }
    
    extension [Self <: InstallArgs](x: Self) {
      
      inline def setDevDependencies(value: Boolean): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setIsOnline(value: Boolean): Self = StObject.set(x, "isOnline", value.asInstanceOf[js.Any])
      
      inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.npm
    - typingsJapgolly.next.nextStrings.pnpm
    - typingsJapgolly.next.nextStrings.yarn
  */
  trait PackageManager extends StObject
  object PackageManager {
    
    inline def npm: typingsJapgolly.next.nextStrings.npm = "npm".asInstanceOf[typingsJapgolly.next.nextStrings.npm]
    
    inline def pnpm: typingsJapgolly.next.nextStrings.pnpm = "pnpm".asInstanceOf[typingsJapgolly.next.nextStrings.pnpm]
    
    inline def yarn: typingsJapgolly.next.nextStrings.yarn = "yarn".asInstanceOf[typingsJapgolly.next.nextStrings.yarn]
  }
}
