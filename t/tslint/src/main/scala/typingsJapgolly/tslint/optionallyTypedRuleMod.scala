package typingsJapgolly.tslint

import typingsJapgolly.tslint.abstractRuleMod.AbstractRule
import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.tslint.ruleMod.ITypedRule
import typingsJapgolly.tslint.ruleMod.RuleFailure
import typingsJapgolly.tslint.walkerWalkerMod.IWalker
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/optionallyTypedRule", JSImport.Namespace)
@js.native
object optionallyTypedRuleMod extends js.Object {
  @js.native
  abstract class OptionallyTypedRule ()
    extends AbstractRule
       with ITypedRule {
    /* CompleteClass */
    @JSName("apply")
    override def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def getOptions(): IOptions = js.native
    /* CompleteClass */
    override def isEnabled(): Boolean = js.native
  }
  
}

