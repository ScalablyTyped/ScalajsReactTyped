package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  /**
    * @example [
    *   "13.64.0.0/16",
    *   "13.65.0.0/16"
    * ]
    */
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "127.0.0.1/32"
    * ]
    */
  var api: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.168.7.15/32",
    *   "192.168.7.16/32"
    * ]
    */
  var dependabot: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "127.0.0.1/32"
    * ]
    */
  var git: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "127.0.0.1/32"
    * ]
    */
  var hooks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "54.158.161.132",
    *   "54.226.70.38"
    * ]
    */
  var importer: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "13.65.0.0/16",
    *   "157.55.204.33/32",
    *   "2a01:111:f403:f90c::/62"
    * ]
    */
  var packages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.30.252.153/32",
    *   "192.30.252.154/32"
    * ]
    */
  var pages: js.UndefOr[js.Array[String]] = js.undefined
  
  var ssh_key_fingerprints: js.UndefOr[SHA256DSA] = js.undefined
  
  /**
    * @example [
    *   "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOMqqnkVzrm0SdG6UOoqKLsabgH5C9okWi0dh2l9GKJl"
    * ]
    */
  var ssh_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @example true */
  var verifiable_password_authentication: Boolean
  
  /**
    * @example [
    *   "127.0.0.1/32"
    * ]
    */
  var web: js.UndefOr[js.Array[String]] = js.undefined
}
object Api {
  
  inline def apply(verifiable_password_authentication: Boolean): Api = {
    val __obj = js.Dynamic.literal(verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setApi(value: js.Array[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setApiVarargs(value: String*): Self = StObject.set(x, "api", js.Array(value*))
    
    inline def setDependabot(value: js.Array[String]): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
    
    inline def setDependabotUndefined: Self = StObject.set(x, "dependabot", js.undefined)
    
    inline def setDependabotVarargs(value: String*): Self = StObject.set(x, "dependabot", js.Array(value*))
    
    inline def setGit(value: js.Array[String]): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    inline def setGitVarargs(value: String*): Self = StObject.set(x, "git", js.Array(value*))
    
    inline def setHooks(value: js.Array[String]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setHooksVarargs(value: String*): Self = StObject.set(x, "hooks", js.Array(value*))
    
    inline def setImporter(value: js.Array[String]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setImporterVarargs(value: String*): Self = StObject.set(x, "importer", js.Array(value*))
    
    inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setSsh_key_fingerprints(value: SHA256DSA): Self = StObject.set(x, "ssh_key_fingerprints", value.asInstanceOf[js.Any])
    
    inline def setSsh_key_fingerprintsUndefined: Self = StObject.set(x, "ssh_key_fingerprints", js.undefined)
    
    inline def setSsh_keys(value: js.Array[String]): Self = StObject.set(x, "ssh_keys", value.asInstanceOf[js.Any])
    
    inline def setSsh_keysUndefined: Self = StObject.set(x, "ssh_keys", js.undefined)
    
    inline def setSsh_keysVarargs(value: String*): Self = StObject.set(x, "ssh_keys", js.Array(value*))
    
    inline def setVerifiable_password_authentication(value: Boolean): Self = StObject.set(x, "verifiable_password_authentication", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: js.Array[String]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    
    inline def setWebVarargs(value: String*): Self = StObject.set(x, "web", js.Array(value*))
  }
}
