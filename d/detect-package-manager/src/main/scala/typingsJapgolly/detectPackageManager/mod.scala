package typingsJapgolly.detectPackageManager

import typingsJapgolly.detectPackageManager.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-package-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def detect(): js.Promise[PM] = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")().asInstanceOf[js.Promise[PM]]
  inline def detect(hasCwd: Cwd): js.Promise[PM] = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(hasCwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PM]]
  
  inline def getNpmVersion(pm: PM): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNpmVersion")(pm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.detectPackageManager.detectPackageManagerStrings.npm
    - typingsJapgolly.detectPackageManager.detectPackageManagerStrings.yarn
    - typingsJapgolly.detectPackageManager.detectPackageManagerStrings.pnpm
  */
  trait PM extends StObject
  object PM {
    
    inline def npm: typingsJapgolly.detectPackageManager.detectPackageManagerStrings.npm = "npm".asInstanceOf[typingsJapgolly.detectPackageManager.detectPackageManagerStrings.npm]
    
    inline def pnpm: typingsJapgolly.detectPackageManager.detectPackageManagerStrings.pnpm = "pnpm".asInstanceOf[typingsJapgolly.detectPackageManager.detectPackageManagerStrings.pnpm]
    
    inline def yarn: typingsJapgolly.detectPackageManager.detectPackageManagerStrings.yarn = "yarn".asInstanceOf[typingsJapgolly.detectPackageManager.detectPackageManagerStrings.yarn]
  }
}
