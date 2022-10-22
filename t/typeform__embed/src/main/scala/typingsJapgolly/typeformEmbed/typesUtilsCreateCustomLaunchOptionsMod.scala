package typingsJapgolly.typeformEmbed

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCreateCustomLaunchOptionsMod {
  
  @JSImport("@typeform/embed/types/utils/create-custom-launch-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleCustomOpen(open: js.Function0[Unit], openType: String): RemoveHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("handleCustomOpen")(open.asInstanceOf[js.Any], openType.asInstanceOf[js.Any])).asInstanceOf[RemoveHandler]
  inline def handleCustomOpen(open: js.Function0[Unit], openType: String, value: Double): RemoveHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("handleCustomOpen")(open.asInstanceOf[js.Any], openType.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RemoveHandler]
  
  trait RemoveHandler extends StObject {
    
    def remove(): Unit
  }
  object RemoveHandler {
    
    inline def apply(remove: Callback): RemoveHandler = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn)
      __obj.asInstanceOf[RemoveHandler]
    }
    
    extension [Self <: RemoveHandler](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
