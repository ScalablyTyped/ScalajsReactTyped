package typingsJapgolly.appiumAdb.anon

import typingsJapgolly.appiumAdb.appiumAdbStrings.denied
import typingsJapgolly.appiumAdb.appiumAdbStrings.home
import typingsJapgolly.appiumAdb.appiumAdbStrings.off
import typingsJapgolly.appiumAdb.appiumAdbStrings.on
import typingsJapgolly.appiumAdb.appiumAdbStrings.roaming
import typingsJapgolly.appiumAdb.appiumAdbStrings.searching
import typingsJapgolly.appiumAdb.appiumAdbStrings.unregistered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSMVOICEDENIED extends StObject {
  
  var GSM_VOICE_DENIED: denied
  
  var GSM_VOICE_HOME: home
  
  var GSM_VOICE_OFF: off
  
  var GSM_VOICE_ON: on
  
  var GSM_VOICE_ROAMING: roaming
  
  var GSM_VOICE_SEARCHING: searching
  
  var GSM_VOICE_UNREGISTERED: unregistered
}
object GSMVOICEDENIED {
  
  inline def apply(): GSMVOICEDENIED = {
    val __obj = js.Dynamic.literal(GSM_VOICE_DENIED = "denied", GSM_VOICE_HOME = "home", GSM_VOICE_OFF = "off", GSM_VOICE_ON = "on", GSM_VOICE_ROAMING = "roaming", GSM_VOICE_SEARCHING = "searching", GSM_VOICE_UNREGISTERED = "unregistered")
    __obj.asInstanceOf[GSMVOICEDENIED]
  }
  
  extension [Self <: GSMVOICEDENIED](x: Self) {
    
    inline def setGSM_VOICE_DENIED(value: denied): Self = StObject.set(x, "GSM_VOICE_DENIED", value.asInstanceOf[js.Any])
    
    inline def setGSM_VOICE_HOME(value: home): Self = StObject.set(x, "GSM_VOICE_HOME", value.asInstanceOf[js.Any])
    
    inline def setGSM_VOICE_OFF(value: off): Self = StObject.set(x, "GSM_VOICE_OFF", value.asInstanceOf[js.Any])
    
    inline def setGSM_VOICE_ON(value: on): Self = StObject.set(x, "GSM_VOICE_ON", value.asInstanceOf[js.Any])
    
    inline def setGSM_VOICE_ROAMING(value: roaming): Self = StObject.set(x, "GSM_VOICE_ROAMING", value.asInstanceOf[js.Any])
    
    inline def setGSM_VOICE_SEARCHING(value: searching): Self = StObject.set(x, "GSM_VOICE_SEARCHING", value.asInstanceOf[js.Any])
    
    inline def setGSM_VOICE_UNREGISTERED(value: unregistered): Self = StObject.set(x, "GSM_VOICE_UNREGISTERED", value.asInstanceOf[js.Any])
  }
}
