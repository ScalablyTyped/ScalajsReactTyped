package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkInfoBar extends StObject {
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkInfoBar_typekey")
  var OutlookDotOlkInfoBar_typekey: OlkInfoBar
}
object OlkInfoBar {
  
  inline def apply(MouseIcon: StdPicture, MousePointer: OlMousePointer, OutlookDotOlkInfoBar_typekey: OlkInfoBar): OlkInfoBar = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkInfoBar_typekey")(OutlookDotOlkInfoBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkInfoBar]
  }
  
  extension [Self <: OlkInfoBar](x: Self) {
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkInfoBar_typekey(value: OlkInfoBar): Self = StObject.set(x, "Outlook.OlkInfoBar_typekey", value.asInstanceOf[js.Any])
  }
}
