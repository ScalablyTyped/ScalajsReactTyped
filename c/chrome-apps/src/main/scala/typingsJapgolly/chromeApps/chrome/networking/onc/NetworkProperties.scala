package typingsJapgolly.chromeApps.chrome.networking.onc

import typingsJapgolly.chromeApps.chrome.networking.onc.internal.NetworkConfigBase
import typingsJapgolly.chromeApps.chromeAppsStrings.DevicePolicy
import typingsJapgolly.chromeApps.chromeAppsStrings.Device_
import typingsJapgolly.chromeApps.chromeAppsStrings.None
import typingsJapgolly.chromeApps.chromeAppsStrings.User
import typingsJapgolly.chromeApps.chromeAppsStrings.UserPolicy
import typingsJapgolly.chromeApps.chromeAppsStrings.getter
import typingsJapgolly.chromeApps.chromeAppsStrings.unmanaged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkProperties[M /* <: ManagedObject */, IF /* <: InterfaceType */]
  extends StObject
     with NetworkConfigBase[M, IF, getter] {
  
  /** Whether the network is connectable. */
  var Connectable: js.UndefOr[Boolean] = js.undefined
  
  /** The network's current connection state. */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined
  
  /** The last recorded network error state. */
  var ErrorState: js.UndefOr[String] = js.undefined
  
  /** The network's IP configuration. */
  var IPConfigs: js.UndefOr[
    js.Array[
      IPConfigProperties[
        unmanaged, 
        /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
      ]
    ]
  ] = js.undefined
  
  /** The network's MAC address. */
  var MacAddress: js.UndefOr[String] = js.undefined
  
  /** The network's proxy settings. */
  var ProxySettings: js.UndefOr[
    typingsJapgolly.chromeApps.chrome.networking.onc.ProxySettings[
      unmanaged, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any
    ]
  ] = js.undefined
  
  /**
    * For a connected network, whether the network connectivity to the Internet is limited,
    * e.g. if the network is behind a portal, or a cellular network is not activated.
    */
  var RestrictedConnectivity: js.UndefOr[Boolean] = js.undefined
  
  /** IP configuration that was received from the DHCP server before applying static IP configuration. */
  var SavedIPConfig: js.UndefOr[
    IPConfigProperties[
      unmanaged, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Indicates whether and how the network is configured.
    * 'None' conflicts with extension code generation,
    * so we must use a string for 'Source' instead of a SourceType enum.
    */
  var Source: js.UndefOr[Device_ | DevicePolicy | User | UserPolicy | None] = js.undefined
  
  /** The network's static IP configuration. */
  var StaticIPConfig: js.UndefOr[
    IPConfigProperties[
      M, 
      /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
    ]
  ] = js.undefined
}
object NetworkProperties {
  
  inline def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */](): NetworkProperties[M, IF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProperties[M, IF]]
  }
  
  extension [Self <: NetworkProperties[?, ?], M /* <: ManagedObject */, IF /* <: InterfaceType */](x: Self & (NetworkProperties[M, IF])) {
    
    inline def setConnectable(value: Boolean): Self = StObject.set(x, "Connectable", value.asInstanceOf[js.Any])
    
    inline def setConnectableUndefined: Self = StObject.set(x, "Connectable", js.undefined)
    
    inline def setConnectionState(value: ConnectionStateType): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setErrorState(value: String): Self = StObject.set(x, "ErrorState", value.asInstanceOf[js.Any])
    
    inline def setErrorStateUndefined: Self = StObject.set(x, "ErrorState", js.undefined)
    
    inline def setIPConfigs(
      value: js.Array[
          IPConfigProperties[
            unmanaged, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "IPConfigs", value.asInstanceOf[js.Any])
    
    inline def setIPConfigsUndefined: Self = StObject.set(x, "IPConfigs", js.undefined)
    
    inline def setIPConfigsVarargs(
      value: (IPConfigProperties[
          unmanaged, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
        ])*
    ): Self = StObject.set(x, "IPConfigs", js.Array(value*))
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    inline def setProxySettings(
      value: ProxySettings[
          unmanaged, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any
        ]
    ): Self = StObject.set(x, "ProxySettings", value.asInstanceOf[js.Any])
    
    inline def setProxySettingsUndefined: Self = StObject.set(x, "ProxySettings", js.undefined)
    
    inline def setRestrictedConnectivity(value: Boolean): Self = StObject.set(x, "RestrictedConnectivity", value.asInstanceOf[js.Any])
    
    inline def setRestrictedConnectivityUndefined: Self = StObject.set(x, "RestrictedConnectivity", js.undefined)
    
    inline def setSavedIPConfig(
      value: IPConfigProperties[
          unmanaged, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'unmanaged' extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
        ]
    ): Self = StObject.set(x, "SavedIPConfig", value.asInstanceOf[js.Any])
    
    inline def setSavedIPConfigUndefined: Self = StObject.set(x, "SavedIPConfig", js.undefined)
    
    inline def setSource(value: Device_ | DevicePolicy | User | UserPolicy | None): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStaticIPConfig(
      value: IPConfigProperties[
          M, 
          /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMStringList : std.Array<string> */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedLong : chrome-apps.chrome.integer */ js.Any
        ]
    ): Self = StObject.set(x, "StaticIPConfig", value.asInstanceOf[js.Any])
    
    inline def setStaticIPConfigUndefined: Self = StObject.set(x, "StaticIPConfig", js.undefined)
  }
}
