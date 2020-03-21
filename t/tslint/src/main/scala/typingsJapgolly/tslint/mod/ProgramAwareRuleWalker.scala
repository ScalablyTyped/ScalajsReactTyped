package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "ProgramAwareRuleWalker")
@js.native
class ProgramAwareRuleWalker protected ()
  extends typingsJapgolly.tslint.walkerMod.ProgramAwareRuleWalker {
  def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
}

