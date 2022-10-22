package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Lazily get a React component to render for this screen.
    */
  def getComponent(): ComponentType[Any]
}
object Component {
  
  inline def apply(getComponent: CallbackTo[ComponentType[Any]]): Component = {
    val __obj = js.Dynamic.literal(getComponent = getComponent.toJsFn)
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setGetComponent(value: CallbackTo[ComponentType[Any]]): Self = StObject.set(x, "getComponent", value.toJsFn)
  }
}
