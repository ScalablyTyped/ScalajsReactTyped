package typingsJapgolly.tizenTvWebapis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tizenTvWebapis.anon.AES
import typingsJapgolly.tizenTvWebapis.anon.AUTO
import typingsJapgolly.tizenTvWebapis.anon.CELLULAR
import typingsJapgolly.tizenTvWebapis.anon.EAP
import typingsJapgolly.tizenTvWebapis.anon.GATEWAYCONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkManager extends StObject {
  
  /**
    * Defines constants for network connection types.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var NetworkActiveConnectionType: CELLULAR
  
  /**
    * Defines constants for network IP modes.
    *
    * @version 1
    *
    * @since 2.3
    */
  var NetworkIpMode: AUTO
  
  /**
    * Defines constants for network states.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var NetworkState: GATEWAYCONNECTED
  
  /**
    * Defines constants for Wi-fi network encryption types.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var NetworkWiFiEncryptionType: AES
  
  /**
    * Defines constants for Wi-Fi network security modes.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var NetworkWiFiSecurityMode: EAP
  
  /**
    * Registers an asynchronous event listener.
    *
    * @param listener Callback method. For example: listenerID = network.addNetworkStateChangeListener(onChange);
    *
    * @returns unsigned long Application async listener ID
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if an input parameter is not compatible with its expected type, TypeMismatchError is thrown instead of NotSupportedError.
    *
    * @note Since plugin version 3.0, the NotSupportedError exception has been removed.
    *
    */
  def addNetworkStateChangeListener(listener: NetworkStateChangedCallback): Double
  
  /**
    * Retrieves the DHCP option 60 vendor string currently used by Udhcp. Works only when the active connection type is wired.
    *
    * @returns DOMString Vendor string
    * Example: If Udhcpc is running with the default string "udhcpc1.21.1", after calling setDhcpOption60Field = "cisco", checkCurrentIpWith60Field= "udhcpc1.21.1"
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @throw WebAPIException with error type InvalidStateError, if the active connection type is Wi-Fi. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.1
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def checkCurrentIpWith60Field(): String
  
  /**
    * Retrieves the TV's currently-active connection type.
    *
    * @returns unsigned long Currently-active network connection type:
    * - "DISCONNECTED": 0
    * - "WIFI": 1
    * - "CELLULAR": 2
    * - "ETHERNET": 3
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getActiveConnectionType(): NetworkActiveConnectionType
  
  /**
    * Retrieves the DHCP option 60 vendor string. Works only when the active connection type is wired.
    *
    * @returns DOMString Vendor-specific string. Default value is "default".
    * Example: If setDhcpOption60Field = "cisco" then getCurrentDhcpOption60Field = "cisco".
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @throw WebAPIException with error type InvalidStateError, if the active connection type is Wi-Fi. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.1
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getCurrentDhcpOption60Field(): String
  
  /**
    * Retrieves the TV's configured DNS address.
    *
    * @returns DOMString DNS address for the currently-configured network
    * - Example: 192.168.0.1
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getDns(): String
  
  /**
    * Retrieves the TV's configured gateway address.
    *
    * @returns DOMString Gateway address for the currently-configured network
    *
    * - Example: 192.168.0.1
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getGateway(): String
  
  /**
    * Retrieves the TV's configured IP address.
    *
    * @returns DOMString IP address for the currently-configured network
    * - Example: 192.168.0.11
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getIp(): String
  
  /**
    * Retrieves the TV's IP configuration mode.
    *
    * @returns unsigned long Network IP mode
    * - "NONE":0
    * - "STATIC": 1
    * - "DYNAMIC": 2
    * - "AUTO": 3
    * - "FIXED": 4
    * - "UNKNOWN": 5
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, the NotSupportedError exception has been removed.
    *
    */
  def getIpMode(): NetworkIpMode
  
  /**
    * Retrieves the network device's MAC address.
    *
    * @returns DOMString MAC address for the currently-configured network
    * - Example: 50:B7:A3:C2:96:11
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getMac(): String
  
  /**
    * Retrieves the TV's configured secondary DNS address.
    *
    * @returns DOMString Secondary DNS address
    * - Example: 192.168.0.100
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.1
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getSecondaryDns(): String
  
  /**
    * Retrieves the TV's configured subnet mask address.
    *
    * @returns DOMString Subnet mask address for the currently-configured network
    * - Example: 255.255.255.0
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getSubnetMask(): String
  
  /**
    * Retrieves the TV's configured name when TV is connected to a network.
    *
    * @returns DOMString TV Name for any connected network
    * - Example: Tizen_Device
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @since 4.0
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getTVName(): String
  
  /**
    * Retrieves the TV network module version.
    *
    * @returns DOMString Network plugin module version
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, the NotSupportedError exception has been removed.
    *
    */
  def getVersion(): String
  
  /**
    * Retrieves the Wi-Fi encryption type. Works only when the active connection type is Wi-Fi.
    *
    * @returns unsigned long Wi-Fi encryption type
    * - "WEP": 1
    * - "TKIP": 2
    * - "AES": 3
    * - "TKIP_AES_MIXED": 4
    * - "NONE": 5
    * - "UNKNOWN": 6
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a Wi-Fi connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getWiFiEncryptionType(): NetworkWiFiEncryptionType
  
  /**
    * Retrieves the Wi-Fi security mode. Works only when the active connection type is Wi-Fi.
    *
    * @returns unsigned long Wi-Fi security mode
    * - "WEP": 1
    * - "WPA_PSK": 2
    * - "WPA2_PSK": 3
    * - "EAP": 4
    * - "NONE": 5
    * - "UNKNOWN": 6
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a Wi-Fi connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getWiFiSecurityMode(): NetworkWiFiSecurityMode
  
  /**
    * Retrieves the Wi-Fi signal strength. Works only when the active connection type is Wi-Fi.
    *
    * @returns long Signal strength level. Valid values are 1 to 5. Signal strength is strongest when the value is 5.
    * - 8dBm
    * - 8 ~ -77dBm
    * - 7 ~ -66dBm
    * - 6 ~ -55dBm
    * - 5dBm
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a Wi-Fi connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getWiFiSignalStrengthLevel(): Double
  
  /**
    * Retrieves the Wi-Fi network SSID. Works only when the active connection type is Wi-Fi.
    *
    * @returns DOMString Wi-Fi network SSID
    * - Example: Strawbarry
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a Wi-Fi connection is not available. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def getWiFiSsid(): String
  
  /**
    * Checks whether the TV is connected to a network gateway.
    *
    * @returns Boolean value:
    * true: Gateway connected
    * false: Gateway is not connected
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def isConnectedToGateway(): Boolean
  
  /**
    * Sets the DHCP option 60 vendor string to the default value, "udhcpc1.21.1". Works only when the active connection type is wired. The vendor string is updated when Udhcpc is restarted or relaunched.
    *
    * @returns void
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @throw WebAPIException with error type InvalidStateError, if the active connection type is Wi-Fi. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.1
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    */
  def removeDhcpOption60Field(): Unit
  
  /**
    * Unregisters an asynchronous event listener.
    *
    * @param listenerId ListenerID to be removed
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/network.public
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type InvalidValuesError, if the listenerId value is not the same as the value generated by addNetworkStateChangeListener. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if the listenerId value is not the same as the value generated by addNetworkStateChangeListener, InvalidValuesError is thrown instead of NotSupportedError.
    *
    */
  def removeNetworkStateChangeListener(listenerId: Double): Unit
  
  /**
    * Sets the DHCP option 60 vendor string. Works only when the active connection type is wired. The vendor string is updated when Udhcpc is restarted or relaunched.
    *
    * @param vendorName DHCP option 60 vendor name string
    *
    * @returns void
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    *
    * @throw WebAPIException with error type InvalidStateError, if the active connection type is Wi-Fi. (Since plugin version 3.0)
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.1
    *
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    *
    * @note Since plugin version 3.0, if an input parameter is not compatible with its expected type, TypeMismatchError is thrown instead of NotSupportedError.
    *
    */
  def setDhcpOption60Field(vendorName: String): Unit
}
object NetworkManager {
  
  inline def apply(
    NetworkActiveConnectionType: CELLULAR,
    NetworkIpMode: AUTO,
    NetworkState: GATEWAYCONNECTED,
    NetworkWiFiEncryptionType: AES,
    NetworkWiFiSecurityMode: EAP,
    addNetworkStateChangeListener: NetworkStateChangedCallback => Double,
    checkCurrentIpWith60Field: CallbackTo[String],
    getActiveConnectionType: CallbackTo[NetworkActiveConnectionType],
    getCurrentDhcpOption60Field: CallbackTo[String],
    getDns: CallbackTo[String],
    getGateway: CallbackTo[String],
    getIp: CallbackTo[String],
    getIpMode: CallbackTo[NetworkIpMode],
    getMac: CallbackTo[String],
    getSecondaryDns: CallbackTo[String],
    getSubnetMask: CallbackTo[String],
    getTVName: CallbackTo[String],
    getVersion: CallbackTo[String],
    getWiFiEncryptionType: CallbackTo[NetworkWiFiEncryptionType],
    getWiFiSecurityMode: CallbackTo[NetworkWiFiSecurityMode],
    getWiFiSignalStrengthLevel: CallbackTo[Double],
    getWiFiSsid: CallbackTo[String],
    isConnectedToGateway: CallbackTo[Boolean],
    removeDhcpOption60Field: Callback,
    removeNetworkStateChangeListener: Double => Callback,
    setDhcpOption60Field: String => Callback
  ): NetworkManager = {
    val __obj = js.Dynamic.literal(NetworkActiveConnectionType = NetworkActiveConnectionType.asInstanceOf[js.Any], NetworkIpMode = NetworkIpMode.asInstanceOf[js.Any], NetworkState = NetworkState.asInstanceOf[js.Any], NetworkWiFiEncryptionType = NetworkWiFiEncryptionType.asInstanceOf[js.Any], NetworkWiFiSecurityMode = NetworkWiFiSecurityMode.asInstanceOf[js.Any], addNetworkStateChangeListener = js.Any.fromFunction1(addNetworkStateChangeListener), checkCurrentIpWith60Field = checkCurrentIpWith60Field.toJsFn, getActiveConnectionType = getActiveConnectionType.toJsFn, getCurrentDhcpOption60Field = getCurrentDhcpOption60Field.toJsFn, getDns = getDns.toJsFn, getGateway = getGateway.toJsFn, getIp = getIp.toJsFn, getIpMode = getIpMode.toJsFn, getMac = getMac.toJsFn, getSecondaryDns = getSecondaryDns.toJsFn, getSubnetMask = getSubnetMask.toJsFn, getTVName = getTVName.toJsFn, getVersion = getVersion.toJsFn, getWiFiEncryptionType = getWiFiEncryptionType.toJsFn, getWiFiSecurityMode = getWiFiSecurityMode.toJsFn, getWiFiSignalStrengthLevel = getWiFiSignalStrengthLevel.toJsFn, getWiFiSsid = getWiFiSsid.toJsFn, isConnectedToGateway = isConnectedToGateway.toJsFn, removeDhcpOption60Field = removeDhcpOption60Field.toJsFn, removeNetworkStateChangeListener = js.Any.fromFunction1((t0: Double) => removeNetworkStateChangeListener(t0).runNow()), setDhcpOption60Field = js.Any.fromFunction1((t0: String) => setDhcpOption60Field(t0).runNow()))
    __obj.asInstanceOf[NetworkManager]
  }
  
  extension [Self <: NetworkManager](x: Self) {
    
    inline def setAddNetworkStateChangeListener(value: NetworkStateChangedCallback => Double): Self = StObject.set(x, "addNetworkStateChangeListener", js.Any.fromFunction1(value))
    
    inline def setCheckCurrentIpWith60Field(value: CallbackTo[String]): Self = StObject.set(x, "checkCurrentIpWith60Field", value.toJsFn)
    
    inline def setGetActiveConnectionType(value: CallbackTo[NetworkActiveConnectionType]): Self = StObject.set(x, "getActiveConnectionType", value.toJsFn)
    
    inline def setGetCurrentDhcpOption60Field(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentDhcpOption60Field", value.toJsFn)
    
    inline def setGetDns(value: CallbackTo[String]): Self = StObject.set(x, "getDns", value.toJsFn)
    
    inline def setGetGateway(value: CallbackTo[String]): Self = StObject.set(x, "getGateway", value.toJsFn)
    
    inline def setGetIp(value: CallbackTo[String]): Self = StObject.set(x, "getIp", value.toJsFn)
    
    inline def setGetIpMode(value: CallbackTo[NetworkIpMode]): Self = StObject.set(x, "getIpMode", value.toJsFn)
    
    inline def setGetMac(value: CallbackTo[String]): Self = StObject.set(x, "getMac", value.toJsFn)
    
    inline def setGetSecondaryDns(value: CallbackTo[String]): Self = StObject.set(x, "getSecondaryDns", value.toJsFn)
    
    inline def setGetSubnetMask(value: CallbackTo[String]): Self = StObject.set(x, "getSubnetMask", value.toJsFn)
    
    inline def setGetTVName(value: CallbackTo[String]): Self = StObject.set(x, "getTVName", value.toJsFn)
    
    inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
    
    inline def setGetWiFiEncryptionType(value: CallbackTo[NetworkWiFiEncryptionType]): Self = StObject.set(x, "getWiFiEncryptionType", value.toJsFn)
    
    inline def setGetWiFiSecurityMode(value: CallbackTo[NetworkWiFiSecurityMode]): Self = StObject.set(x, "getWiFiSecurityMode", value.toJsFn)
    
    inline def setGetWiFiSignalStrengthLevel(value: CallbackTo[Double]): Self = StObject.set(x, "getWiFiSignalStrengthLevel", value.toJsFn)
    
    inline def setGetWiFiSsid(value: CallbackTo[String]): Self = StObject.set(x, "getWiFiSsid", value.toJsFn)
    
    inline def setIsConnectedToGateway(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnectedToGateway", value.toJsFn)
    
    inline def setNetworkActiveConnectionType(value: CELLULAR): Self = StObject.set(x, "NetworkActiveConnectionType", value.asInstanceOf[js.Any])
    
    inline def setNetworkIpMode(value: AUTO): Self = StObject.set(x, "NetworkIpMode", value.asInstanceOf[js.Any])
    
    inline def setNetworkState(value: GATEWAYCONNECTED): Self = StObject.set(x, "NetworkState", value.asInstanceOf[js.Any])
    
    inline def setNetworkWiFiEncryptionType(value: AES): Self = StObject.set(x, "NetworkWiFiEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setNetworkWiFiSecurityMode(value: EAP): Self = StObject.set(x, "NetworkWiFiSecurityMode", value.asInstanceOf[js.Any])
    
    inline def setRemoveDhcpOption60Field(value: Callback): Self = StObject.set(x, "removeDhcpOption60Field", value.toJsFn)
    
    inline def setRemoveNetworkStateChangeListener(value: Double => Callback): Self = StObject.set(x, "removeNetworkStateChangeListener", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDhcpOption60Field(value: String => Callback): Self = StObject.set(x, "setDhcpOption60Field", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
