package typingsJapgolly.chromeApps.chrome.networking.onc

import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chrome.networking.onc.internal.NetworkConfigBase
import typingsJapgolly.chromeApps.chrome.networking.onc.internal.ObjectFunction
import typingsJapgolly.chromeApps.chromeAppsStrings.full
import typingsJapgolly.chromeApps.chromeAppsStrings.managed
import typingsJapgolly.chromeApps.chromeAppsStrings.partial
import typingsJapgolly.chromeApps.chromeAppsStrings.unmanaged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ManagedBoolean = ManagedType[Boolean]

type ManagedDOMString = ManagedType[String]

type ManagedDOMStringList = ManagedType[js.Array[String]]

type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]

type ManagedLong = ManagedType[integer]

type ManagedProperties = NetworkProperties[managed, full]

type NetworkConfigProperties[OF /* <: ObjectFunction */] = NetworkConfigBase[unmanaged, full, OF]

type NetworkStateProperties = NetworkProperties[unmanaged, partial]
