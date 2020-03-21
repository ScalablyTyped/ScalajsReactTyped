package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.tslint.ruleMod.IRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.ruleMod.RuleFailure
import typingsJapgolly.tslint.ruleMod.RuleSeverity
import typingsJapgolly.tslint.walkerMod.WalkContext
import typingsJapgolly.tslint.walkerWalkerMod.IWalker
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/abstractRule", JSImport.Namespace)
@js.native
object abstractRuleMod extends js.Object {
  @js.native
  abstract class AbstractRule protected () extends IRule {
    def this(options: IOptions) = this()
    val options: js.Any = js.native
    val ruleArguments: js.Array[_] = js.native
    var ruleName: String = js.native
    val ruleSeverity: RuleSeverity = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction(
      sourceFile: SourceFile,
      walkFn: js.Function1[/* ctx */ WalkContext[js.UndefOr[scala.Nothing]], Unit]
    ): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction[T](sourceFile: SourceFile, walkFn: js.Function1[/* ctx */ WalkContext[T], Unit], options: NoInfer[T]): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction[T, U](
      sourceFile: SourceFile,
      walkFn: js.Function2[/* ctx */ WalkContext[T], /* programOrChecker */ U, Unit],
      options: NoInfer[T],
      checker: NoInfer[U]
    ): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
    /**
      * @deprecated
      * Failures will be filtered based on `tslint:disable` comments by tslint.
      * This method now does nothing.
      */
    /* protected */ def filterFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
    /* CompleteClass */
    override def getOptions(): IOptions = js.native
    /* CompleteClass */
    override def isEnabled(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AbstractRule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
  type NoInfer[T] = T with typingsJapgolly.tslint.tslintStrings.NoInfer
}

