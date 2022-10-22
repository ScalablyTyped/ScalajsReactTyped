package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.Host
import typingsJapgolly.angularCompilerCli.anon.Options
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersEntryPointsMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/entry_points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCompilerHost(hasOptionsTsHost: Options): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(hasOptionsTsHost.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
  
  inline def createProgram(hasRootNamesOptionsHostOldProgram: Host): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(hasRootNamesOptionsHostOldProgram.asInstanceOf[js.Any]).asInstanceOf[Program]
}
