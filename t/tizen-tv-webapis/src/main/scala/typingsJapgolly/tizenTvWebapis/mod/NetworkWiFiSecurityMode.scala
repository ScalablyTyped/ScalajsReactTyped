package typingsJapgolly.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiSecurityMode extends StObject
@JSImport("tizen-tv-webapis", "NetworkWiFiSecurityMode")
@js.native
object NetworkWiFiSecurityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiSecurityMode & Double] = js.native
  
  /**
    * EAP security mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait EAP
    extends StObject
       with NetworkWiFiSecurityMode
  /* 4 */ val EAP: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiSecurityMode.EAP & Double = js.native
  
  /**
    * Open security mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait NONE
    extends StObject
       with NetworkWiFiSecurityMode
  /* 5 */ val NONE: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiSecurityMode.NONE & Double = js.native
  
  /**
    * Security mode unknown
    *
    * @since 2.3
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with NetworkWiFiSecurityMode
  /* 6 */ val UNKNOWN: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiSecurityMode.UNKNOWN & Double = js.native
  
  /**
    * WEP security mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait WEP
    extends StObject
       with NetworkWiFiSecurityMode
  /* 1 */ val WEP: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiSecurityMode.WEP & Double = js.native
  
  /**
    * WPA2_PSK security mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait WPA2_PSK
    extends StObject
       with NetworkWiFiSecurityMode
  /* 3 */ val WPA2_PSK: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiSecurityMode.WPA2_PSK & Double = js.native
  
  /**
    * PSK security mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait WPA_PSK
    extends StObject
       with NetworkWiFiSecurityMode
  /* 2 */ val WPA_PSK: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiSecurityMode.WPA_PSK & Double = js.native
}
