package typingsJapgolly.chromeApps.chrome.networking.onc

import typingsJapgolly.chromeApps.chromeAppsStrings.Disabled_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.Uninitialized
  - typingsJapgolly.chromeApps.chromeAppsStrings.Disabled_
  - typingsJapgolly.chromeApps.chromeAppsStrings.Enabling
  - typingsJapgolly.chromeApps.chromeAppsStrings.Enabled
  - typingsJapgolly.chromeApps.chromeAppsStrings.Prohibited
*/
trait DeviceState extends StObject
object DeviceState {
  
  inline def Disabled: Disabled_ = "Disabled".asInstanceOf[Disabled_]
  
  inline def Enabled: typingsJapgolly.chromeApps.chromeAppsStrings.Enabled = "Enabled".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.Enabled]
  
  inline def Enabling: typingsJapgolly.chromeApps.chromeAppsStrings.Enabling = "Enabling".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.Enabling]
  
  inline def Prohibited: typingsJapgolly.chromeApps.chromeAppsStrings.Prohibited = "Prohibited".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.Prohibited]
  
  inline def Uninitialized: typingsJapgolly.chromeApps.chromeAppsStrings.Uninitialized = "Uninitialized".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.Uninitialized]
}
