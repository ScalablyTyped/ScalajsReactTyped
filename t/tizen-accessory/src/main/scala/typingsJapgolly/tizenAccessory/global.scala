package typingsJapgolly.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("SATransport")
  @js.native
  object SATransport extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tizenAccessory.SATransport & String] = js.native
    
    /* "TRANSPORT_BLE" */ val TRANSPORT_BLE: typingsJapgolly.tizenAccessory.SATransport.TRANSPORT_BLE & String = js.native
    
    /* "TRANSPORT_BT" */ val TRANSPORT_BT: typingsJapgolly.tizenAccessory.SATransport.TRANSPORT_BT & String = js.native
    
    /* "TRANSPORT_MOBILE" */ val TRANSPORT_MOBILE: typingsJapgolly.tizenAccessory.SATransport.TRANSPORT_MOBILE & String = js.native
    
    /* "TRANSPORT_USB" */ val TRANSPORT_USB: typingsJapgolly.tizenAccessory.SATransport.TRANSPORT_USB & String = js.native
    
    /* "TRANSPORT_WIFI" */ val TRANSPORT_WIFI: typingsJapgolly.tizenAccessory.SATransport.TRANSPORT_WIFI & String = js.native
  }
  
  object webapis {
    
    @JSGlobal("webapis.sa")
    @js.native
    val sa: SAManager = js.native
  }
}
