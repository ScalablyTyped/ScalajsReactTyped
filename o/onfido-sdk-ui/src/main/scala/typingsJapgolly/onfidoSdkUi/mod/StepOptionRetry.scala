package typingsJapgolly.onfidoSdkUi.mod

import typingsJapgolly.onfidoSdkUi.anon.Buttontitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionRetry extends StObject {
  
  var text: js.UndefOr[Buttontitle] = js.undefined
}
object StepOptionRetry {
  
  inline def apply(): StepOptionRetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionRetry]
  }
  
  extension [Self <: StepOptionRetry](x: Self) {
    
    inline def setText(value: Buttontitle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
