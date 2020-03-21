package typingsJapgolly.tsNode

import typingsJapgolly.typescript.mod.CancellationToken
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallProgramSourceFileCancellationToken extends js.Object {
  def apply(program: Program): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}

