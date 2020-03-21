package typingsJapgolly.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>An instantiation of a WiFi network adaptor</p>
* 
* @url http://www.espruino.com/Reference#WLAN
*/
@js.native
trait WLAN extends /**
  * 
  * @return  
  */
Instantiable0[WLAN] {
  /**
    * <p>Connect to a wireless network</p>
    * 
    * @param ap 
    * @param key 
    * @param callback 
    * @return  
    * @url http://www.espruino.com/Reference#l_WLAN_connect
    */
  def connect(ap: js.Any, key: js.Any, callback: js.Any): Boolean = js.native
  /**
    * <p>Completely uninitialise and power down the CC3000. After this you&#39;ll have to use <code>require(&quot;CC3000&quot;).connect()</code> again.</p>
    * 
    * @url http://www.espruino.com/Reference#l_WLAN_disconnect
    */
  def disconnect(): Unit = js.native
  /**
    * <p>Get the current IP address</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_WLAN_getIP
    */
  def getIP(): js.Any = js.native
  /**
    * <p>Completely uninitialise and power down the CC3000, then reconnect to the old access point.</p>
    * 
    * @url http://www.espruino.com/Reference#l_WLAN_reconnect
    */
  def reconnect(): Unit = js.native
  /**
    * <p>Set the current IP address for get an IP from DHCP (if no options object is specified).</p>
    * <p><strong>Note:</strong> Changes are written to non-volatile memory, but will only take effect after calling <code>wlan.reconnect()</code></p>
    * 
    * @param options 
    * @return  
    * @url http://www.espruino.com/Reference#l_WLAN_setIP
    */
  def setIP(options: js.Any): Boolean = js.native
}

