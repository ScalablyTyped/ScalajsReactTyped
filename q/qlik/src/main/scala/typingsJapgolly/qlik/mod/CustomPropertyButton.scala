package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.qlik.qlikStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyButton
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  def action(data: VisualizationOptions): Unit
  
  var component: button
}
object CustomPropertyButton {
  
  inline def apply(action: VisualizationOptions => Callback): CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1((t0: VisualizationOptions) => action(t0).runNow()), component = "button")
    __obj.asInstanceOf[CustomPropertyButton]
  }
  
  extension [Self <: CustomPropertyButton](x: Self) {
    
    inline def setAction(value: VisualizationOptions => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: VisualizationOptions) => value(t0).runNow()))
    
    inline def setComponent(value: button): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
