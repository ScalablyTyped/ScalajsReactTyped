package typingsJapgolly.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_interpreter", JSImport.Namespace)
@js.native
object outputInterpreterMod extends js.Object {
  def interpretStatements(statements: js.Array[Statement], reflector: CompileReflector): StringDictionary[js.Any] = js.native
}

