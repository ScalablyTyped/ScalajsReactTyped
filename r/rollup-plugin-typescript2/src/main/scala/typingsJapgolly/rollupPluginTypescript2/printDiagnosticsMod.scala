package typingsJapgolly.rollupPluginTypescript2

import typingsJapgolly.rollupPluginTypescript2.contextMod.IContext
import typingsJapgolly.rollupPluginTypescript2.tscacheMod.IDiagnostics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/print-diagnostics", JSImport.Namespace)
@js.native
object printDiagnosticsMod extends js.Object {
  def printDiagnostics(context: IContext, diagnostics: js.Array[IDiagnostics], pretty: Boolean): Unit = js.native
}

