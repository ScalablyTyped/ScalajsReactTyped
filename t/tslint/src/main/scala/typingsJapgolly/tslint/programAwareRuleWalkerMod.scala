package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.tslint.ruleWalkerMod.RuleWalker
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/programAwareRuleWalker", JSImport.Namespace)
@js.native
object programAwareRuleWalkerMod extends js.Object {
  @js.native
  class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    val program: js.Any = js.native
    val typeChecker: js.Any = js.native
    def getProgram(): Program = js.native
    def getTypeChecker(): TypeChecker = js.native
  }
  
}

