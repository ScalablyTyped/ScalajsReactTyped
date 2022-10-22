package typingsJapgolly.vscodeWindowsRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vscode-windows-registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetStringRegKey(hive: HKEY, path: String, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetStringRegKey")(hive.asInstanceOf[js.Any], path.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER
    - typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE
    - typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT
    - typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS
    - typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG
  */
  trait HKEY extends StObject
  object HKEY {
    
    inline def HKEY_CLASSES_ROOT: typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT = "HKEY_CLASSES_ROOT".asInstanceOf[typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT]
    
    inline def HKEY_CURRENT_CONFIG: typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG = "HKEY_CURRENT_CONFIG".asInstanceOf[typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG]
    
    inline def HKEY_CURRENT_USER: typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER = "HKEY_CURRENT_USER".asInstanceOf[typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER]
    
    inline def HKEY_LOCAL_MACHINE: typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE = "HKEY_LOCAL_MACHINE".asInstanceOf[typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE]
    
    inline def HKEY_USERS: typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS = "HKEY_USERS".asInstanceOf[typingsJapgolly.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS]
  }
}
