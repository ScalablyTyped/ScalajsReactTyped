package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsPurgeCacheMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/purge-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def purgeStaleBuildCache(context: BuilderContext): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeStaleBuildCache")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
