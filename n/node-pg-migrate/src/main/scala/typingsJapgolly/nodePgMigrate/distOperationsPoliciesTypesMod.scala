package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.IfExistsOption
import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ALL
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.DELETE
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.INSERT
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.SELECT
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsPoliciesTypesMod {
  
  type AlterPolicy = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* options */ PolicyOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreatePolicy extends CreatePolicyFn {
    
    def reverse(tableName: Name, policyName: String): String | js.Array[String] = js.native
    def reverse(tableName: Name, policyName: String, options: CreatePolicyOptions & IfExistsOption): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreatePolicyFn = js.native
  }
  
  type CreatePolicyFn = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* options */ js.UndefOr[CreatePolicyOptions & IfExistsOption], 
    String | js.Array[String]
  ]
  
  trait CreatePolicyOptions
    extends StObject
       with CreatePolicyOptionsEn
       with PolicyOptions
  object CreatePolicyOptions {
    
    inline def apply(): CreatePolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePolicyOptions]
    }
  }
  
  trait CreatePolicyOptionsEn extends StObject {
    
    var command: js.UndefOr[ALL | SELECT | INSERT | UPDATE | DELETE] = js.undefined
  }
  object CreatePolicyOptionsEn {
    
    inline def apply(): CreatePolicyOptionsEn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePolicyOptionsEn]
    }
    
    extension [Self <: CreatePolicyOptionsEn](x: Self) {
      
      inline def setCommand(value: ALL | SELECT | INSERT | UPDATE | DELETE): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    }
  }
  
  type DropPolicy = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* options */ js.UndefOr[IfExistsOption], 
    String | js.Array[String]
  ]
  
  trait PolicyOptions extends StObject {
    
    var check: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `using`: js.UndefOr[String] = js.undefined
  }
  object PolicyOptions {
    
    inline def apply(): PolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyOptions]
    }
    
    extension [Self <: PolicyOptions](x: Self) {
      
      inline def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setRole(value: String | js.Array[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRoleVarargs(value: String*): Self = StObject.set(x, "role", js.Array(value*))
      
      inline def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
      
      inline def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    }
  }
  
  @js.native
  trait RenamePolicy extends RenamePolicyFn {
    
    def reverse(tableName: Name, policyName: String, newPolicyName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenamePolicyFn = js.native
  }
  
  type RenamePolicyFn = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* newPolicyName */ String, 
    String | js.Array[String]
  ]
}
