package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewCustomButtonEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val buttonID: String
  
  val visibleIndex: Double
}
object CardViewCustomButtonEventArgs {
  
  inline def apply(buttonID: String, processOnServer: Boolean, sender: Control, visibleIndex: Double): CardViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewCustomButtonEventArgs]
  }
  
  extension [Self <: CardViewCustomButtonEventArgs](x: Self) {
    
    inline def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
