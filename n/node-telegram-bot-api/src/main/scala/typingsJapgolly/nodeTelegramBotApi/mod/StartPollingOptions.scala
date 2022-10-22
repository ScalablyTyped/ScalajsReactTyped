package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPollingOptions
  extends StObject
     with ConstructorOptions {
  
  var restart: js.UndefOr[Boolean] = js.undefined
}
object StartPollingOptions {
  
  inline def apply(): StartPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPollingOptions]
  }
  
  extension [Self <: StartPollingOptions](x: Self) {
    
    inline def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
  }
}
