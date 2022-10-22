package typingsJapgolly.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiEncryptionType extends StObject
@JSImport("tizen-tv-webapis", "NetworkWiFiEncryptionType")
@js.native
object NetworkWiFiEncryptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiEncryptionType & Double] = js.native
  
  /**
    * AES encryption
    *
    * @since 2.3
    */
  @js.native
  sealed trait AES
    extends StObject
       with NetworkWiFiEncryptionType
  /* 3 */ val AES: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiEncryptionType.AES & Double = js.native
  
  /**
    * No encryption
    *
    * @since 2.3
    */
  @js.native
  sealed trait NONE
    extends StObject
       with NetworkWiFiEncryptionType
  /* 5 */ val NONE: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiEncryptionType.NONE & Double = js.native
  
  /**
    * TKIP encryption
    *
    * @since 2.3
    */
  @js.native
  sealed trait TKIP
    extends StObject
       with NetworkWiFiEncryptionType
  /* 2 */ val TKIP: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiEncryptionType.TKIP & Double = js.native
  
  /**
    * TKIP_AES_MIXED encryption
    *
    * @since 2.3
    */
  @js.native
  sealed trait TKIP_AES_MIXED
    extends StObject
       with NetworkWiFiEncryptionType
  /* 4 */ val TKIP_AES_MIXED: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiEncryptionType.TKIP_AES_MIXED & Double = js.native
  
  /**
    * Encryption type unknown
    *
    * @since 2.3
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with NetworkWiFiEncryptionType
  /* 6 */ val UNKNOWN: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiEncryptionType.UNKNOWN & Double = js.native
  
  /**
    * WEP encryption
    *
    * @since 2.3
    */
  @js.native
  sealed trait WEP
    extends StObject
       with NetworkWiFiEncryptionType
  /* 1 */ val WEP: typingsJapgolly.tizenTvWebapis.mod.NetworkWiFiEncryptionType.WEP & Double = js.native
}
