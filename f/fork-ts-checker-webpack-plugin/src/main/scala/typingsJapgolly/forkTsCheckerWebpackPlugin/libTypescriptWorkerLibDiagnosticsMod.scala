package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typingsJapgolly.typescript.mod.BuilderProgram
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibDiagnosticsMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIssuesFromDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[Issue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIssuesFromDiagnostics")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[js.Array[Issue]]
  
  inline def getDiagnosticsOfProgram(program: BuilderProgram): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticsOfProgram")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  inline def getDiagnosticsOfProgram(program: Program): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticsOfProgram")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  
  inline def getIssues(): js.Array[Issue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIssues")().asInstanceOf[js.Array[Issue]]
  
  inline def invalidateDiagnostics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateDiagnostics")().asInstanceOf[Unit]
  
  inline def updateDiagnostics(configFile: String, diagnostics: js.Array[Diagnostic]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDiagnostics")(configFile.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
