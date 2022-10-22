package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/rules", "AbstractRule")
  @js.native
  open class AbstractRule protected ()
    extends typingsJapgolly.tslint.libLanguageRuleAbstractRuleMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object AbstractRule {
    
    @JSImport("tslint/lib/rules", "AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules", "AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("tslint/lib/rules", "OptionallyTypedRule")
  @js.native
  open class OptionallyTypedRule protected ()
    extends typingsJapgolly.tslint.libLanguageRuleOptionallyTypedRuleMod.OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("tslint/lib/rules", "TypedRule")
  @js.native
  open class TypedRule protected ()
    extends typingsJapgolly.tslint.libLanguageRuleTypedRuleMod.TypedRule {
    def this(options: IOptions) = this()
  }
}
