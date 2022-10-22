package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.anon.TypeofimportedMigrations
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsLoadEsmMod {
  
  @JSImport("@angular/core/schematics/utils/load_esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadCompilerCliMigrationsModule(): js.Promise[TypeofimportedMigrations] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCompilerCliMigrationsModule")().asInstanceOf[js.Promise[TypeofimportedMigrations]]
  
  inline def loadEsmModule[T](modulePath: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEsmModule")(modulePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def loadEsmModule[T](modulePath: URL_): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEsmModule")(modulePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
