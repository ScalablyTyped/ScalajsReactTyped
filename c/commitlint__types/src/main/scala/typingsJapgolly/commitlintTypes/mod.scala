package typingsJapgolly.commitlintTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/types", "RuleConfigQuality")
  @js.native
  object RuleConfigQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigQuality & Double] = js.native
    
    /* 1 */ val Qualified: typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigQuality.Qualified & Double = js.native
    
    /* 0 */ val User: typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigQuality.User & Double = js.native
  }
  
  @JSImport("@commitlint/types", "RuleConfigSeverity")
  @js.native
  object RuleConfigSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigSeverity & Double] = js.native
    
    /* 0 */ val Disabled: typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigSeverity.Disabled & Double = js.native
    
    /* 2 */ val Error: typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigSeverity.Error & Double = js.native
    
    /* 1 */ val Warning: typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigSeverity.Warning & Double = js.native
  }
}
