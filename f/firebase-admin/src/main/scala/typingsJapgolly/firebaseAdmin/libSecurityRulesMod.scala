package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityRulesMod {
  
  @JSImport("firebase-admin/lib/security-rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/security-rules", "Ruleset")
  @js.native
  open class Ruleset ()
    extends typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.Ruleset
  
  @JSImport("firebase-admin/lib/security-rules", "RulesetMetadataList")
  @js.native
  open class RulesetMetadataList ()
    extends typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.RulesetMetadataList
  
  @JSImport("firebase-admin/lib/security-rules", "SecurityRules")
  @js.native
  open class SecurityRules ()
    extends typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules
  /* static members */
  object SecurityRules {
    
    @JSImport("firebase-admin/lib/security-rules", "SecurityRules.CLOUD_FIRESTORE")
    @js.native
    val CLOUD_FIRESTORE: Any = js.native
    
    @JSImport("firebase-admin/lib/security-rules", "SecurityRules.FIREBASE_STORAGE")
    @js.native
    val FIREBASE_STORAGE: Any = js.native
  }
  
  inline def getSecurityRules(): typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityRules")().asInstanceOf[typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules]
  inline def getSecurityRules(app: App): typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityRules")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules]
}
