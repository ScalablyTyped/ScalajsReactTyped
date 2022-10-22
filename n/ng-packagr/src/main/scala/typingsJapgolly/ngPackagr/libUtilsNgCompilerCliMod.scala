package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.anon.TypeofimportedCompilerC
import typingsJapgolly.ngPackagr.anon.TypeofimportedNgcc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsNgCompilerCliMod {
  
  @JSImport("ng-packagr/lib/utils/ng-compiler-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngCompilerCli(): js.Promise[TypeofimportedCompilerC] = ^.asInstanceOf[js.Dynamic].applyDynamic("ngCompilerCli")().asInstanceOf[js.Promise[TypeofimportedCompilerC]]
  
  inline def ngccCompilerCli(): js.Promise[TypeofimportedNgcc] = ^.asInstanceOf[js.Dynamic].applyDynamic("ngccCompilerCli")().asInstanceOf[js.Promise[TypeofimportedNgcc]]
}
