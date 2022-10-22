package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityRulesSecurityRulesNamespaceMod {
  
  object securityRules {
    
    inline def apply(): SecurityRules = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SecurityRules]
    inline def apply(app: App): SecurityRules = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SecurityRules]
    
    @JSImport("firebase-admin/lib/security-rules/security-rules-namespace", "securityRules")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.security-rules#RulesFile}.
      */
    type RulesFile = typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.RulesFile
    
    /**
      * Type alias to {@link firebase-admin.security-rules#Ruleset}.
      */
    type Ruleset = typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.Ruleset
    
    /**
      * Type alias to {@link firebase-admin.security-rules#RulesetMetadata}.
      */
    type RulesetMetadata = typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.RulesetMetadata
    
    /**
      * Type alias to {@link firebase-admin.security-rules#RulesetMetadataList}.
      */
    type RulesetMetadataList = typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.RulesetMetadataList
    
    /**
      * Type alias to {@link firebase-admin.security-rules#SecurityRules}.
      */
    type SecurityRules = typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules
  }
}
