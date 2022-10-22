package typingsJapgolly.tsNode.anon

import typingsJapgolly.typescript.mod.CancellationToken
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallProgramSourceFileCancellationToken extends StObject {
  
  def apply(program: Program): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: Unit, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}
