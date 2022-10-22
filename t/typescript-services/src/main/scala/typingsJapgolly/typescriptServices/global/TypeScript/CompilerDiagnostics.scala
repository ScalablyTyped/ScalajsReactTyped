package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.CompilerDiagnostics.IDiagnosticWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompilerDiagnostics {
  
  @JSGlobal("TypeScript.CompilerDiagnostics")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Alert(output: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Alert")(output.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("TypeScript.CompilerDiagnostics.analysisPass")
  @js.native
  def analysisPass: Double = js.native
  inline def analysisPass_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("analysisPass")(x.asInstanceOf[js.Any])
  
  inline def assert(condition: Boolean, s: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("TypeScript.CompilerDiagnostics.debug")
  @js.native
  def debug: Boolean = js.native
  
  inline def debugPrint(s: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debugPrint")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.CompilerDiagnostics.diagnosticWriter")
  @js.native
  def diagnosticWriter: IDiagnosticWriter = js.native
  inline def diagnosticWriter_=(x: IDiagnosticWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diagnosticWriter")(x.asInstanceOf[js.Any])
}
