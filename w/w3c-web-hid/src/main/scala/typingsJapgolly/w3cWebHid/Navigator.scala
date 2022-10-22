package typingsJapgolly.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#extensions-to-the-navigator-interface */
trait Navigator extends StObject {
  
  val hid: HID
}
object Navigator {
  
  inline def apply(hid: HID): Navigator = {
    val __obj = js.Dynamic.literal(hid = hid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setHid(value: HID): Self = StObject.set(x, "hid", value.asInstanceOf[js.Any])
  }
}
