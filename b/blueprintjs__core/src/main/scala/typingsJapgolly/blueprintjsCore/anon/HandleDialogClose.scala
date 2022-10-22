package typingsJapgolly.blueprintjsCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleDialogClose extends StObject {
  
  def handleDialogClose(): Unit
}
object HandleDialogClose {
  
  inline def apply(handleDialogClose: Callback): HandleDialogClose = {
    val __obj = js.Dynamic.literal(handleDialogClose = handleDialogClose.toJsFn)
    __obj.asInstanceOf[HandleDialogClose]
  }
  
  extension [Self <: HandleDialogClose](x: Self) {
    
    inline def setHandleDialogClose(value: Callback): Self = StObject.set(x, "handleDialogClose", value.toJsFn)
  }
}
