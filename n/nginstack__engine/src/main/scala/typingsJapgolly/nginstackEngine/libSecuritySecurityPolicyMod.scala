package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecuritySecurityPolicyMod {
  
  inline def apply(computerAddress: String, computerName: String, userKey: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(computerAddress.asInstanceOf[js.Any], computerName.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/SecurityPolicy", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SecurityPolicy {
    def this(computerAddress: String, computerName: String, userKey: Double) = this()
    
    /* CompleteClass */
    override def checkComputer(): Boolean = js.native
    
    /* CompleteClass */
    override def checkEnabledApplication(appId: SecurityPolicyApplication): Boolean = js.native
    
    /* CompleteClass */
    override def checkEngineRestartAllowed(): Boolean = js.native
    
    /* CompleteClass */
    var computerAddress: String = js.native
    
    /* CompleteClass */
    var computerName: String = js.native
    
    /* CompleteClass */
    var computerPolicyKey: Double = js.native
    
    /* CompleteClass */
    var groupsAndUsers: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var hostKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var hosts: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var initialize: Any = js.native
    
    /* CompleteClass */
    var networkKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var networkUtilities: typingsJapgolly.nginstackEngine.libNetNetworkUtilitiesMod.^ = js.native
    
    /* CompleteClass */
    var networks: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var securityPolicies: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var userKey: String = js.native
    
    /* CompleteClass */
    var userPolicyKey: Double = js.native
    
    /* CompleteClass */
    override def validateLogin(appId: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/security/SecurityPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def userCanAccessRemotely(userKey: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("userCanAccessRemotely")(userKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait SecurityPolicy extends StObject {
    
    def checkComputer(): Boolean
    
    def checkEnabledApplication(appId: SecurityPolicyApplication): Boolean
    
    def checkEngineRestartAllowed(): Boolean
    
    var computerAddress: String
    
    var computerName: String
    
    var computerPolicyKey: Double
    
    var groupsAndUsers: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    var hostKeys: js.Array[Any]
    
    var hosts: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    /* private */ var initialize: Any
    
    var networkKeys: js.Array[Any]
    
    var networkUtilities: typingsJapgolly.nginstackEngine.libNetNetworkUtilitiesMod.^
    
    var networks: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    var securityPolicies: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    var userKey: String
    
    var userPolicyKey: Double
    
    def validateLogin(appId: String): Unit
  }
  object SecurityPolicy {
    
    inline def apply(
      checkComputer: CallbackTo[Boolean],
      checkEnabledApplication: SecurityPolicyApplication => Boolean,
      checkEngineRestartAllowed: CallbackTo[Boolean],
      computerAddress: String,
      computerName: String,
      computerPolicyKey: Double,
      groupsAndUsers: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      hostKeys: js.Array[Any],
      hosts: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      initialize: Any,
      networkKeys: js.Array[Any],
      networkUtilities: typingsJapgolly.nginstackEngine.libNetNetworkUtilitiesMod.^,
      networks: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      securityPolicies: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      userKey: String,
      userPolicyKey: Double,
      validateLogin: String => Callback
    ): SecurityPolicy = {
      val __obj = js.Dynamic.literal(checkComputer = checkComputer.toJsFn, checkEnabledApplication = js.Any.fromFunction1(checkEnabledApplication), checkEngineRestartAllowed = checkEngineRestartAllowed.toJsFn, computerAddress = computerAddress.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], computerPolicyKey = computerPolicyKey.asInstanceOf[js.Any], groupsAndUsers = groupsAndUsers.asInstanceOf[js.Any], hostKeys = hostKeys.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], initialize = initialize.asInstanceOf[js.Any], networkKeys = networkKeys.asInstanceOf[js.Any], networkUtilities = networkUtilities.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], securityPolicies = securityPolicies.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any], userPolicyKey = userPolicyKey.asInstanceOf[js.Any], validateLogin = js.Any.fromFunction1((t0: String) => validateLogin(t0).runNow()))
      __obj.asInstanceOf[SecurityPolicy]
    }
    
    extension [Self <: SecurityPolicy](x: Self) {
      
      inline def setCheckComputer(value: CallbackTo[Boolean]): Self = StObject.set(x, "checkComputer", value.toJsFn)
      
      inline def setCheckEnabledApplication(value: SecurityPolicyApplication => Boolean): Self = StObject.set(x, "checkEnabledApplication", js.Any.fromFunction1(value))
      
      inline def setCheckEngineRestartAllowed(value: CallbackTo[Boolean]): Self = StObject.set(x, "checkEngineRestartAllowed", value.toJsFn)
      
      inline def setComputerAddress(value: String): Self = StObject.set(x, "computerAddress", value.asInstanceOf[js.Any])
      
      inline def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
      
      inline def setComputerPolicyKey(value: Double): Self = StObject.set(x, "computerPolicyKey", value.asInstanceOf[js.Any])
      
      inline def setGroupsAndUsers(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "groupsAndUsers", value.asInstanceOf[js.Any])
      
      inline def setHostKeys(value: js.Array[Any]): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
      
      inline def setHostKeysVarargs(value: Any*): Self = StObject.set(x, "hostKeys", js.Array(value*))
      
      inline def setHosts(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: Any): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      inline def setNetworkKeys(value: js.Array[Any]): Self = StObject.set(x, "networkKeys", value.asInstanceOf[js.Any])
      
      inline def setNetworkKeysVarargs(value: Any*): Self = StObject.set(x, "networkKeys", js.Array(value*))
      
      inline def setNetworkUtilities(value: typingsJapgolly.nginstackEngine.libNetNetworkUtilitiesMod.^): Self = StObject.set(x, "networkUtilities", value.asInstanceOf[js.Any])
      
      inline def setNetworks(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
      
      inline def setSecurityPolicies(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "securityPolicies", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
      
      inline def setUserPolicyKey(value: Double): Self = StObject.set(x, "userPolicyKey", value.asInstanceOf[js.Any])
      
      inline def setValidateLogin(value: String => Callback): Self = StObject.set(x, "validateLogin", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait SecurityPolicyApplication extends StObject {
    
    var FrameworkHTML: String
    
    var IDE: String
    
    var iWeb: String
  }
  object SecurityPolicyApplication {
    
    inline def apply(FrameworkHTML: String, IDE: String, iWeb: String): SecurityPolicyApplication = {
      val __obj = js.Dynamic.literal(FrameworkHTML = FrameworkHTML.asInstanceOf[js.Any], IDE = IDE.asInstanceOf[js.Any], iWeb = iWeb.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityPolicyApplication]
    }
    
    extension [Self <: SecurityPolicyApplication](x: Self) {
      
      inline def setFrameworkHTML(value: String): Self = StObject.set(x, "FrameworkHTML", value.asInstanceOf[js.Any])
      
      inline def setIDE(value: String): Self = StObject.set(x, "IDE", value.asInstanceOf[js.Any])
      
      inline def setIWeb(value: String): Self = StObject.set(x, "iWeb", value.asInstanceOf[js.Any])
    }
  }
}
