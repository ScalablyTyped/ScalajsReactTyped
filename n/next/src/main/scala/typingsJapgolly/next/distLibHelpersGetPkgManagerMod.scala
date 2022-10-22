package typingsJapgolly.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHelpersGetPkgManagerMod {
  
  @JSImport("next/dist/lib/helpers/get-pkg-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPkgManager(baseDir: String): PackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getPkgManager")(baseDir.asInstanceOf[js.Any]).asInstanceOf[PackageManager]
  
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
