package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleAbstractRuleMod.AbstractRule
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.ITypedRule
import typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleFailure
import typingsJapgolly.tslint.libLanguageWalkerWalkerMod.IWalker
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageRuleOptionallyTypedRuleMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/rule/optionallyTypedRule", "OptionallyTypedRule")
  @js.native
  open class OptionallyTypedRule protected ()
    extends AbstractRule
       with ITypedRule {
    def this(options: IOptions) = this()
    
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
