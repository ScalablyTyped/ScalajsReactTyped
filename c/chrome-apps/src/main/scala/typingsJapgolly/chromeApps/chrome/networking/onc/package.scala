package typingsJapgolly.chromeApps.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onc {
  type ManagedBoolean = typingsJapgolly.chromeApps.chrome.networking.onc.ManagedType[scala.Boolean]
  type ManagedDOMString = typingsJapgolly.chromeApps.chrome.networking.onc.ManagedType[java.lang.String]
  type ManagedDOMStringList = typingsJapgolly.chromeApps.chrome.networking.onc.ManagedType[js.Array[java.lang.String]]
  type ManagedIPConfigType = typingsJapgolly.chromeApps.chrome.networking.onc.ManagedType[js.Array[typingsJapgolly.chromeApps.chrome.networking.onc.IPConfigType]]
  type ManagedLong = typingsJapgolly.chromeApps.chrome.networking.onc.ManagedType[typingsJapgolly.chromeApps.chrome.integer]
  type ManagedProperties = typingsJapgolly.chromeApps.chrome.networking.onc.NetworkProperties[
    typingsJapgolly.chromeApps.chromeAppsStrings.managed, 
    typingsJapgolly.chromeApps.chromeAppsStrings.full
  ]
  type NetworkConfigProperties[OF /* <: typingsJapgolly.chromeApps.chrome.networking.onc.internal.ObjectFunction */] = typingsJapgolly.chromeApps.chrome.networking.onc.internal.NetworkConfigBase[
    typingsJapgolly.chromeApps.chromeAppsStrings.unmanaged, 
    typingsJapgolly.chromeApps.chromeAppsStrings.full, 
    OF
  ]
  type NetworkStateProperties = typingsJapgolly.chromeApps.chrome.networking.onc.NetworkProperties[
    typingsJapgolly.chromeApps.chromeAppsStrings.unmanaged, 
    typingsJapgolly.chromeApps.chromeAppsStrings.partial
  ]
}
