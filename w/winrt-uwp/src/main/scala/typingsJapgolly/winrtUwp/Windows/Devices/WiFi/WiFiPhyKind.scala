package typingsJapgolly.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiPhyKind extends StObject
/** Describes PHY types supported by standard 802.11. */
@JSGlobal("Windows.Devices.WiFi.WiFiPhyKind")
@js.native
object WiFiPhyKind extends StObject {
  
  /** Direct sequence, spread-spectrum (DSSS) PHY. */
  @js.native
  sealed trait dsss
    extends StObject
       with WiFiPhyKind
  
  /** Extended Rate (ERP) PHY. */
  @js.native
  sealed trait erp
    extends StObject
       with WiFiPhyKind
  
  /** Frequency-hopping, spread-spectrum (FHSS) PHY. */
  @js.native
  sealed trait fhss
    extends StObject
       with WiFiPhyKind
  
  /** High-rated DSSS (HRDSSS) PHY. */
  @js.native
  sealed trait hrdsss
    extends StObject
       with WiFiPhyKind
  
  /** 802.11n PHY. */
  @js.native
  sealed trait ht
    extends StObject
       with WiFiPhyKind
  
  /** Infrared (IR) baseband PHY. */
  @js.native
  sealed trait irBaseband
    extends StObject
       with WiFiPhyKind
  
  /** Orthogonal frequency division multiplex (OFDM) PHY. */
  @js.native
  sealed trait ofdm
    extends StObject
       with WiFiPhyKind
  
  /** Unspecified PHY type */
  @js.native
  sealed trait unknown
    extends StObject
       with WiFiPhyKind
  
  /** 802.11ac PHY. */
  @js.native
  sealed trait vht
    extends StObject
       with WiFiPhyKind
}
