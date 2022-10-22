package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibHostCompilerHostMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/host/compiler-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCompilerHost(parsedConfig: ParsedCommandLine): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(parsedConfig.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
}
