package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.PUK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PIN extends StObject {
  
  var PIN: typingsJapgolly.chromeApps.chromeAppsStrings.PIN
  
  var PUK: typingsJapgolly.chromeApps.chromeAppsStrings.PUK
}
object PIN {
  
  inline def apply(): PIN = {
    val __obj = js.Dynamic.literal(PIN = "PIN", PUK = "PUK")
    __obj.asInstanceOf[PIN]
  }
  
  extension [Self <: PIN](x: Self) {
    
    inline def setPIN(value: typingsJapgolly.chromeApps.chromeAppsStrings.PIN): Self = StObject.set(x, "PIN", value.asInstanceOf[js.Any])
    
    inline def setPUK(value: PUK): Self = StObject.set(x, "PUK", value.asInstanceOf[js.Any])
  }
}
