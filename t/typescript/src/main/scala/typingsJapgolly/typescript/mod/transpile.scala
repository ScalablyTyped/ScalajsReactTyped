package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "transpile")
@js.native
object transpile extends js.Object {
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, compilerOptions: CompilerOptions): java.lang.String = js.native
  def apply(input: java.lang.String, compilerOptions: CompilerOptions, fileName: java.lang.String): java.lang.String = js.native
  def apply(
    input: java.lang.String,
    compilerOptions: CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[Diagnostic]
  ): java.lang.String = js.native
  def apply(
    input: java.lang.String,
    compilerOptions: CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[Diagnostic],
    moduleName: java.lang.String
  ): java.lang.String = js.native
}

