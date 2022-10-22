package typingsJapgolly.aceBuilds.mod.Ace

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInput extends StObject {
  
  def resetSelection(): Unit
}
object TextInput {
  
  inline def apply(resetSelection: Callback): TextInput = {
    val __obj = js.Dynamic.literal(resetSelection = resetSelection.toJsFn)
    __obj.asInstanceOf[TextInput]
  }
  
  extension [Self <: TextInput](x: Self) {
    
    inline def setResetSelection(value: Callback): Self = StObject.set(x, "resetSelection", value.toJsFn)
  }
}
