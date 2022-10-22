package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileDialog extends StObject {
  
  def openFileDialog(): Unit
}
object OpenFileDialog {
  
  inline def apply(openFileDialog: Callback): OpenFileDialog = {
    val __obj = js.Dynamic.literal(openFileDialog = openFileDialog.toJsFn)
    __obj.asInstanceOf[OpenFileDialog]
  }
  
  extension [Self <: OpenFileDialog](x: Self) {
    
    inline def setOpenFileDialog(value: Callback): Self = StObject.set(x, "openFileDialog", value.toJsFn)
  }
}
